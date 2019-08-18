package ch11;

class TickTock {
    private String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");
        state = "ticked";

        notify();

        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " - interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");
        state = "tocked";
        notify();

        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println(Thread.currentThread().getName() + " - interrupted.");
        }
    }
}

class TickTockThread implements Runnable {
    private Thread thread;
    private TickTock tickTockObj;

    TickTockThread(String name, TickTock tickTockObj) {
        thread = new Thread(this, name);
        this.tickTockObj = tickTockObj;
        thread.start();
    }

    @Override
    public void run() {
        switch (thread.getName()) {
            case "Tick":
                for (int i = 0; i < 5; i++) tickTockObj.tick(true);
                tickTockObj.tick(false);
                break;
            case "Tock":
                for (int i = 0; i < 5; i++) tickTockObj.tock(true);
                tickTockObj.tock(false);
                break;

            default:
                System.out.println("Incorrect stream name.");
        }
    }

    Thread getThread() {
        return thread;
    }
}

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        TickTockThread tickStream = new TickTockThread("Tick", tt);
        TickTockThread tockStream = new TickTockThread("Tock", tt);
        try {
            tickStream.getThread().join();
            tockStream.getThread().join();
        }catch (InterruptedException exc){
            System.out.println("Main stream interrupted.");
        }
    }
}
