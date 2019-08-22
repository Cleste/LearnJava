package ch13.GenericQueue;

public class FixedQueue<T> extends MasterQueue<T> implements IGenQ<T> {

    public FixedQueue(T[] array, String name) {
        super(array, name);
    }


    public void put(T var) throws QueueFullException {
        if (getPutIndex() == getQueueArr().length - 1) {
            throw new QueueFullException(getQueueArr().length - 1);
        }
        incPutInd();
        getQueueArr()[getPutIndex()] = var;
    }

    public T get() throws QueueEmptyException {
        if (getGetIndex() == getPutIndex()) {
            throw new QueueEmptyException();
        }
        incGetInd();
        return getQueueArr()[getGetIndex()];
    }

}
