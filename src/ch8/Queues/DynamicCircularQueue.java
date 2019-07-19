package ch8.Queues;

public class DynamicCircularQueue extends MasterQueue implements ICharQ {
    public DynamicCircularQueue(int size, String name) {
        super(size, name);
    }

    public void put(char ch) {
        if (getPutIndex() + 1 == getGetIndex()) {
            messageList("err01");
            return;
        }
        if (((getPutIndex() == getQueueArr().length - 1) & (getGetIndex() == 0))) {
            setQueueArr(arrExpansionTwice(getQueueArr()));
        }

        incPutInd();
        if (getPutIndex() == getQueueArr().length) setPutIndex(0);
        getQueueArr()[getPutIndex()] = ch;
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
