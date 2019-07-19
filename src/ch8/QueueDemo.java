package ch8;

import ch8.Queues.*;

import static ch8.Queues.MasterQueue.queueCopy;

public class QueueDemo {
    public static void main(String[] args) {
        FixedQueue queue1 = new FixedQueue(10, "Line Queue 1");
        queue1.fillQueue();
        FixedQueue queue2 = new FixedQueue(5,"Line Queue 2");
        queueCopy(queue1, queue2);
        queue1.showContent();
        queue2.showContent();
        CircularQueue queue3 = new CircularQueue(10, "Circular Queue 1");
        queue3.fillQueue();
        System.out.println(queue3.get());
        queue3.put('Z');
        queue3.showContent();
        DynamicQueue queue4 = new DynamicQueue(13, "Dynamic Queue 1");
        queue4.fillQueue(0, 26);
        queue4.showContent();
        DynamicCircularQueue queue5 = new DynamicCircularQueue(13, "Dynamic Circular Queue 1");
        queue5.fillQueue(0, 26);
        queue5.showContent();
    }
}
