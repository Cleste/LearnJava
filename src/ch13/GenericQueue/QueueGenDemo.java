package ch13.GenericQueue;


public class QueueGenDemo {
    public static void main(String[] args) {
        Integer[] testInt = new Integer[10];
        Integer[] numsInt = {10, 11, 23, 123, 42, 213, 123, 234, 123};
        Double[] numsDouble = {10.23, 11.12, 23.21, 123.13, 42.21, 213.34, 123.32};
        Double[] testDouble = {10.23, 11.12, 23.21, 123.13, 42.21, 213.34, 123.32};
        FixedQueue<Integer> queue1 = new FixedQueue<>(testInt, "Fixed Queue 1");
        DynamicCircularQueue<Double> queue2 = new DynamicCircularQueue<>(numsDouble, "DynamicCircular");

        try {
            queue1.fillQueue(numsInt);
            queue2.fillQueue(testDouble);
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        try {
            queue1.showContent(8);
            queue2.showContent();
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
