package ch6.Stack;

class Stack {
    private char[] StackArr;
    private int index;

    Stack(int size) {
        StackArr = new char[size + 1];
        index = 0;
    }

    Stack(Stack obj) {
        index = obj.index;
        StackArr = new char[obj.StackArr.length];

        for (int i = 0; i <= index; i++) StackArr[i] = obj.StackArr[i];
    }

    Stack(char[] arr) throws StackFullException {
        index = 0;
        StackArr = new char[arr.length + 1];
        for (char c : arr) push(c);
    }

    void push(char sumb) throws StackFullException{
        if (index == StackArr.length - 1) {
            throw new StackFullException(StackArr.length - 1);
        }
        index++;
        StackArr[index] = sumb;
    }

    char pop() throws StackEmptyException {
        if (index == 0) {
            throw new StackEmptyException();
        }
        return StackArr[index--];
    }

    void showStack() throws StackEmptyException {
        System.out.println("Stack content: ");
        do {
            System.out.print(pop());
        } while (index != 0);
        System.out.println();
    }
}
