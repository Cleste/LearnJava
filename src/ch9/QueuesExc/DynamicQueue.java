package ch9.QueuesExc;

public class DynamicQueue extends MasterQueue implements ICharQ {
    public DynamicQueue(int size, String name) {
        super(size, name);
    }

    public void put(char sumb) throws QueueFullException {
        if (getPutIndex() + 1 == getGetIndex()) {
            throw new QueueFullException(getQueueArr().length - 1);
        }
        if (getPutIndex() == getQueueArr().length - 1)
            setQueueArr(arrExpansionTwice(getQueueArr()));
        incPutInd();
        getQueueArr()[getPutIndex()] = sumb;
    }

    public char get() throws QueueEmptyException {
        if (getGetIndex() == getPutIndex()) {
            throw new QueueEmptyException();
        }
        incGetInd();
        return getQueueArr()[getGetIndex()];
    }
}
