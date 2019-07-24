package ch8;

import ch8.Queues.*;

import static ch8.Queues.MasterQueue.queueCopy;

public class QueueDemo {
    public static void main(String[] args) {
        FixedQueue queue1 = new FixedQueue(10, "Line Queue 1");
        FixedQueue queue2 = new FixedQueue(10, "Line Queue 2");
        DynamicQueue queue4 = new DynamicQueue(10, "Dynamic Queue 1");
        CircularQueue queue3 = new CircularQueue(10, "Circular Queue 1");
        DynamicCircularQueue queue5 = new DynamicCircularQueue(5, "Dynamic Circular Queue 1");
        queue1.fillQueue();
        queue1.showContent();

        queue4.fillQueue();
        queue4.showContent();

        queue3.fillQueue();
        queue3.showContent();
        queue3.fillQueue(10, 20);
        queue3.showContent();

        queue5.fillQueue();
        queue5.showContent();
        queue5.reset();
        queue5.fillQueue(5, 10);
        queue5.showContent();
        queue5.reset();
        queue5.fillQueue(0, 10);
        queue5.showContent();

        queue1.reset();
        queue1.fillQueue();
        queue2.fillQueue(10, 20);
        queueCopy(queue1, queue2);
        queue1.showContent();
        queue2.showContent();
    }
}
