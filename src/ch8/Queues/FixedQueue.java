package ch8.Queues;

public class FixedQueue extends MasterQueue implements ICharQ{

    public FixedQueue(int size, String name) {
        super(size, name);
    }

    public void put(char sumb) {
        if (getPutIndex() == getQueueArr().length - 1) {
            messageList("err01");
            return;
        }
        incPutInd();
        getQueueArr()[getPutIndex()] = sumb;
    }

    public char get() {
        if (getGetIndex() == getPutIndex()) {
            messageList("err02");
            return (char) 0;
        }
        incGetInd();
        return getQueueArr()[getGetIndex()];
    }

}
