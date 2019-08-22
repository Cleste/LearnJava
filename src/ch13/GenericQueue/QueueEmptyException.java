package ch13.GenericQueue;

public class QueueEmptyException extends Exception {
    public String toString() {
        return "\n - Queue is empty";
    }
}
