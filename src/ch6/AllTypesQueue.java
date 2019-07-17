package ch6;

public class AllTypesQueue {
    public static void main(String[] args) {
        Queue queue1 = new Queue(10);

        char[] charArr = {'T', 'Z', 'A', 'E'};
        Queue queue2 = new Queue(charArr);

        char sumb;

        for (int i = 0; i < 10; i++)
            queue1.put((char) ('A' + i));

        Queue  queue3 = new Queue(queue1);

        System.out.println("Queue1 content: ");
        for (int i = 0; i < 10; i++) {
            sumb = queue1.get();
            System.out.print(sumb + " ");
        }
        System.out.println("\nQueue2 content: ");
        for (int i = 0; i < 4; i++) {
            sumb= queue2.get();
            System.out.print(sumb + " ");
        }
        System.out.println("\nQueue3 content: ");
        for (int i = 0; i < 10; i++) {
            sumb = queue3.get();
            System.out.print(sumb + " ");
        }
    }
}
class Queue {
    private char[] queueArr;
    private int putNum, getNum;
    Queue(int size) {
        queueArr = new char[size + 1];
        putNum = getNum = 0;
    }
    Queue(Queue obj){
        putNum = obj.putNum;
        getNum = obj.getNum;
        queueArr = new char[obj.queueArr.length];

        if (putNum + 1 - getNum + 1 >= 0)
            System.arraycopy(obj.queueArr, getNum + 1, queueArr, getNum + 1, putNum + 1 - getNum + 1);
    }

    void put(char sumb){
        if(putNum == queueArr.length - 1){
            System.out.println("Queue is full.");
            return;
        }
        putNum++;
        queueArr[putNum] = sumb;
    }

    Queue(char[] arr){
        putNum = getNum = 0;
        queueArr = new char[arr.length + 1];
        for (char c : arr) put(c);
    }

    char get(){
        if(getNum == putNum){
            System.out.println("Queue is empty.");
            return (char) 0;
        }

        getNum++;
        return queueArr[getNum];
    }

    void showQueue(){
        for (char x:queueArr) System.out.print(x);
    }
}
