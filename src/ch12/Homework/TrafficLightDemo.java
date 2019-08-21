package ch12.Homework;

enum TrafficLightColor {
    RED(1500) {
        public TrafficLightColor change() {
            return GREEN;
        }
    }, YELLOW(300) {
        public TrafficLightColor change() {
            return RED;
        }
    }, GREEN(1000) {
        public TrafficLightColor change() {
            return YELLOW;
        }
    };

    public abstract TrafficLightColor change();

    private int delay;

    TrafficLightColor(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
}

class TrafficLightStream implements Runnable {
    private Thread thread;
    private TrafficLightColor color;
    private boolean stop = false, changed = false;

    TrafficLightStream(TrafficLightColor color) {
        this.color = color;
        thread = new Thread(this);
        thread.start();
    }

    TrafficLightStream() {
        this.color = TrafficLightColor.RED;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(color.getDelay());
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    private synchronized void changeColor() {
        color = color.change();
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait();
            }
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    TrafficLightColor getColor() {
        return color;
    }

    void cancel() {
        stop = true;
    }
}

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightStream tl =
                new TrafficLightStream(TrafficLightColor.GREEN);
        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();


    }
}

