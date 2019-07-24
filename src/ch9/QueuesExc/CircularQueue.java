package ch9.QueuesExc;

public class CircularQueue extends MasterQueue implements ICharQ {

    public CircularQueue(int size, String name) {
        super(size, name);
    }

    public void put(char sumb) throws QueueFullException {
        if (getPutIndex() + 1 == getGetIndex()
                | ((getPutIndex() == getQueueArr().length - 1) & (getGetIndex() == 0))) {
            throw new QueueFullException(getQueueArr().length - 1);
        }
        incPutInd();
        if (getPutIndex() == getQueueArr().length) setPutIndex(0);
        getQueueArr()[getPutIndex()] = sumb;
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
