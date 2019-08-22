package ch13.GenericQueue;

public class DynamicQueue<T> extends MasterQueue<T> implements IGenQ<T> {
    public DynamicQueue(T[] array, String name) {
        super(array, name);
    }
    public void put(T var) throws QueueFullException {
        if (getPutIndex() + 1 == getGetIndex()) {
            throw new QueueFullException(getQueueArr().length - 1);
        }
        if (getPutIndex() == getQueueArr().length - 1)
            setQueueArr((T[])arrExpansionTwice(getQueueArr()));
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
