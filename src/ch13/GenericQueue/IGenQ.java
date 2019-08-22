package ch13.GenericQueue;

public interface IGenQ<T> {
    void put(T var) throws QueueFullException;

    T get() throws QueueEmptyException;
}
