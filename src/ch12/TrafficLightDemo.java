package ch12;

enum TrafficLightColor {
    RED, YELLOW, GREEN
}

class TrafficLightStream implements Runnable {
    private Thread thread;
    private TrafficLightColor color;
    boolean stop = false, changed = false;

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
                switch (color) {
                    case GREEN:
                        Thread.sleep(500);
                        break;
                    case YELLOW:
                        Thread.sleep(200);
                        break;
                    case RED:
                        Thread.sleep(700);
                        break;
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        switch (color) {
            case GREEN:
                color = TrafficLightColor.YELLOW;
                break;
            case YELLOW:
                color = TrafficLightColor.RED;
                break;
            case RED:
                color = TrafficLightColor.GREEN;
                break;
        }
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

    public TrafficLightColor getColor() {
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
