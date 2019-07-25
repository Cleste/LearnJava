package ch6.Stack;

public class StackFullException extends Exception {

    private int size;

    StackFullException(int size) {this.size = size;}

    public String toString() {
        return "\nStack is full. Max size: " + size + "!\n";
    }
}