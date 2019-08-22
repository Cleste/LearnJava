package ch13.GenericStack;

class Stack<T> implements IGenStack<T>{
    private T[] StackArr;
    private int index;

    Stack(T[] array) {
        StackArr = array;
        if (StackArr[0] != null)
        index = array.length;
    }

    Stack(Stack obj, T[] array) {
        index = obj.index;
        StackArr = array;
    }


    public void push(T var) throws StackFullException {
        if (index == StackArr.length - 1) {
            throw new StackFullException(StackArr.length - 1);
        }
        index++;
        StackArr[index] = var;
    }

    public T pop() throws StackEmptyException {
        if (index == 0) {
            throw new StackEmptyException();
        }
        return StackArr[index--];
    }

    void showStack() throws StackEmptyException {
        System.out.println("Stack content: ");
        do {
            System.out.print(pop() + " ");
        } while (index != 0);
        System.out.println();
    }
}
