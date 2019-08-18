package ch11;

class SumArray {
    private int sum;

    synchronized int sumArray(int[] nums) {
        sum = 0;
        for (int x : nums) {
            sum += x;
            System.out.println("Current sum value for " + Thread.currentThread().getName() + ": " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Main stream interrupted");
            }
        }
        return sum;
    }
}

class SyncThread implements Runnable {
    private Thread thread;
    private static SumArray sumObj = new SumArray();
    private int[] numsArray;
    private int answer;

    SyncThread(String name, int[] numsArray) {
        thread = new Thread(this, name);
        this.numsArray = numsArray;
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " - started.");
        answer = sumObj.sumArray(numsArray);
        System.out.println("Sum for" + thread.getName() + " - " + answer);
        System.out.println(thread.getName() + " - completed.");
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        int[] numsArray = {1, 2, 3, 4, 5};
        SyncThread streamOne = new SyncThread("First stream", numsArray);
        SyncThread streamTwo = new SyncThread("Second stream", numsArray);
    }
}
