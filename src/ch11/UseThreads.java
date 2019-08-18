package ch11;

class MyThread implements Runnable {
    private Thread thread;

    MyThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    public void run() {
        System.out.println(thread.getName() + " - start");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(24);
                System.out.println("In " + thread.getName() + " counter: " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " - interrupted");
        }
        System.out.println(thread.getName() + " - completed");
    }
}

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main stream started");
        MyThread thread = new MyThread("First stream");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(5);
            }catch (InterruptedException exc){
                System.out.println("Main stream interrupted");
            }
        }

        System.out.println("Main stream completed");
    }
}
