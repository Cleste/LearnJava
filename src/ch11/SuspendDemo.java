package ch11;


import com.sun.xml.internal.ws.policy.SimpleAssertion;

class SusspedThread implements Runnable {
    Thread thread;

    private volatile boolean suspend, stopped;

    SusspedThread(String name) {
        thread = new Thread(this, name);
        stopped = false;
        suspend = false;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " - started");
        try {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if (i % 10 == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                synchronized (this) {
                    while (suspend) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " - interrupted");
        }
        System.out.println(thread.getName() + " - completed");
    }

    synchronized void myStop(){
        stopped = true;
        suspend = false;
        notify();
    }

    synchronized void myResume(){
        suspend = false;
        notify();
    }

    synchronized void mySuspend(){
        suspend = true;
    }
}

public class SuspendDemo {
    public static void main(String[] args) {
        SusspedThread stream = new SusspedThread("Stream #1");
        try {
            Thread.sleep(1000);

            stream.mySuspend();
            System.out.println("Thread suspend");
            Thread.sleep(1000);

            stream.myResume();
            System.out.println("Thread resume");
            Thread.sleep(1000);

            stream.mySuspend();
            System.out.println("Thread suspend");
            Thread.sleep(1000);

            stream.myResume();
            System.out.println("Thread resume");
            Thread.sleep(1000);

            stream.mySuspend();
            System.out.println("Thread stop");
            stream.myStop();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }

        try {
            stream.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exit");
    }
}
