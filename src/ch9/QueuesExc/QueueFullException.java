package ch9.QueuesExc;

public class QueueFullException extends Exception {
    private int size;

    QueueFullException(int size) {this.size = size;}

    public String toString() {
        return "\n - Queue is full. Max size: " + size + "!";
    }
}
