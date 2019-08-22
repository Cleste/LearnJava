package ch13.GenericQueue;

public class CircularQueue<T> extends MasterQueue<T> implements IGenQ<T> {

    public CircularQueue(T[] array, String name) {
        super(array, name);
    }


    public void put(T var) throws QueueFullException {
        if (getPutIndex() + 1 == getGetIndex()
                | ((getPutIndex() == getQueueArr().length - 1) & (getGetIndex() == 0))) {
            throw new QueueFullException(getQueueArr().length - 1);
        }
        incPutInd();
        if (getPutIndex() == getQueueArr().length) setPutIndex(0);
        getQueueArr()[getPutIndex()] = var;
    }

    public T get() throws QueueEmptyException {
        if (getGetIndex() == getPutIndex()) {
            throw new QueueEmptyException();
        }
        incGetInd();
        if (getGetIndex() == getQueueArr().length) setGetIndex(0);
        return getQueueArr()[getGetIndex()];
    }
}
