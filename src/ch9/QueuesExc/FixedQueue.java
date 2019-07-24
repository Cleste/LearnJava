package ch9.QueuesExc;

public class FixedQueue extends MasterQueue implements ICharQ {

    public FixedQueue(int size, String name) {
        super(size, name);
    }

    public void put(char sumb) throws QueueFullException {
        if (getPutIndex() == getQueueArr().length - 1) {
            throw new QueueFullException(getQueueArr().length - 1);
        }
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
