package ch5;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(26);

        char sumb;
        int id;

        System.out.println("Используем очередь для помещения в нее английского алфавита");
        for (id = 0; id < 26; id++)
            bigQ.put((char) ('A' + id));

        System.out.println("Содержание очереди:  ");
        for (id = 0; id < 26; id++) {
            sumb= bigQ.get();
            if (sumb != (char) 0) System.out.print(sumb);
        }
    }
}
class Queue {
    private char[] queueArr;
    private int put_num, get_num;
    Queue(int size) {
        queueArr = new char[size + 1];
        put_num = get_num = 0;
    }
    void put(char sumb){
        if(put_num == queueArr.length - 1){
            System.out.println("Очередь заполнена.");
            return;
        }

        put_num++;
        queueArr[put_num] = sumb;
    }
    char get(){
        if(get_num == put_num){
            System.out.println("Очередь пуста.");
            return (char) 0;
        }

        get_num++;
        return queueArr[get_num];
    }

    void showQueue(){
        for (char x:queueArr) System.out.print(x);
    }
}
