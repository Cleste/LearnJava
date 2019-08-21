package ch11;

class Priority implements Runnable {
    private int counter;
    private Thread thread;
    private static boolean stop = false;
    private static String currentName;

    Priority(String name) {
        thread = new Thread(this, name);
        counter = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " - started.");
        do {
            counter++;
            if (!currentName.equals(thread.getName())) {
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        } while (!stop && counter < 10000000);
        stop = true;

        System.out.println(thread.getName() + " - completed.");
    }

    Thread getThread() {
        return thread;
    }

    void showCounter() {
        System.out.println(thread.getName() + "counter: " + counter);
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        Priority streamOne = new Priority("High priority stream");
        Priority streamTwo = new Priority("Low priority stream");
        streamOne.getThread().setPriority(Thread.NORM_PRIORITY + 1);
        streamTwo.getThread().setPriority(Thread.NORM_PRIORITY - 1);

        streamOne.getThread().start();
        streamTwo.getThread().start();

        try {
            streamOne.getThread().join();
            streamTwo.getThread().join();
        }catch (InterruptedException exc){
            System.out.println("Main stream interrupted.");
        }
        streamOne.showCounter();
        streamTwo.showCounter();
    }
}
