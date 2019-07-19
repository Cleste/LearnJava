package ch8.Queues;

public class DynamicQueue extends MasterQueue implements ICharQ {
    public DynamicQueue(int size, String name) {
        super(size, name);
    }

    public void put(char sumb) {
        if (getPutIndex() + 1 == getGetIndex()) {
            messageList("err01");
            return;
        }
        if (getPutIndex() == getQueueArr().length - 1)
            setQueueArr(arrExpansionTwice(getQueueArr()));
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
