package ch11;

class SecondThread extends Thread {
    Thread thread;

    SecondThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        System.out.println(getName() + " - start");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + " counter: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " - interrupted");
        }
        System.out.println(getName() + " - completed");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main stream started");
        SecondThread thread = new SecondThread("First stream");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main stream interrupted");
            }
        }

        System.out.println("Main stream completed");
    }
}
