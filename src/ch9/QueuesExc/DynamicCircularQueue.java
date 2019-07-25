package ch9.QueuesExc;

public class DynamicCircularQueue extends MasterQueue implements ICharQ {
    public DynamicCircularQueue(int size, String name) {
        super(size, name);
    }

    public void put(char ch) throws QueueFullException {
        if (getPutIndex() + 1 == getGetIndex()) {
            throw new QueueFullException(getQueueArr().length - 1);
        }
        if (((getPutIndex() == getQueueArr().length - 1) & (getGetIndex() == 0))) {
            setQueueArr(arrExpansionTwice(getQueueArr()));
        }

        incPutInd();
        if (getPutIndex() == getQueueArr().length) setPutIndex(0);
        getQueueArr()[getPutIndex()] = ch;
    }

    public char get() throws QueueEmptyException {
        if (getGetIndex() == getPutIndex()) {
            throw new QueueEmptyException();
        }
        incGetInd();
        if (getGetIndex() == getQueueArr().length) setGetIndex(0);
        return getQueueArr()[getGetIndex()];
    }
}
