package ch8.Queues;

public class CircularQueue extends MasterQueue implements ICharQ{

    public CircularQueue(int size, String name) {
        super(size, name);
    }

    public void put(char sumb) {
        if (getPutIndex() + 1 == getGetIndex()
                | ((getPutIndex() == getQueueArr().length - 1) & (getGetIndex() == 0))) {
            messageList("err01");
            return;
        }
        incPutInd();
        if (getPutIndex() == getQueueArr().length) setPutIndex(0);
        getQueueArr()[getPutIndex()] = sumb;
    }

    public char get() {
        if (getGetIndex() == getPutIndex()) {
            messageList("err02");
            return (char) 0;
        }
        incGetInd();
        if (getGetIndex() == getQueueArr().length) setGetIndex(0);
        return getQueueArr()[getGetIndex()];
    }
}
