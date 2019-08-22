package ch13.GenericStack;

public interface IGenStack<T> {
    void push(T object) throws StackFullException;

    T pop() throws StackEmptyException;
}
