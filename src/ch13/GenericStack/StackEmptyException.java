package ch13.GenericStack;

public class StackEmptyException extends Exception {
    public String toString(){
        return "\nStack is empty\n";
    }
}
