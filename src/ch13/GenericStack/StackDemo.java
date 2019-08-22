package ch13.GenericStack;


public class StackDemo {
    public static void main(String[] args) {

        Stack stack1 = new Stack(new String[10]);
        try {
            stack1.push("This");
            stack1.push("is");
            stack1.push("Test");
        } catch (StackFullException exc) {
            System.out.println(exc);
        }
        try {
            stack1.showStack();
            System.out.println(stack1.pop());
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }

    }
}

