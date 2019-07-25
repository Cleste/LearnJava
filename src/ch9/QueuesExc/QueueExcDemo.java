package ch9.QueuesExc;

/*В этом проекте предстоит создать два класса исключений, которые будут использоваться классом
очереди, разработанным в упражнении 8.1.*/

public class QueueExcDemo {
    public static void main(String[] args) {
        FixedQueue queue1 = new FixedQueue(10, "Fixed Queue 1");
        try {
            queue1.fillQueue(0, 11);
        }catch (QueueFullException exc){
            System.out.println(exc);
        }
        try {
            queue1.showContent(11);
        }catch (QueueEmptyException exc){
            System.out.println(exc);
        }
    }
}
