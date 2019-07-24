package ch9.QueuesExc;

public interface ICharQ {
    void put(char sumb) throws QueueFullException;
    char get() throws QueueEmptyException;
}
