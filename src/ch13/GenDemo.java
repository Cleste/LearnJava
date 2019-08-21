package ch13;

class Gen<T> {
    private T object;

    Gen(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }

    void showType() {
        System.out.println("Type T this is " + object.getClass().getName());
    }
}


public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> integerObj = new Gen<>(88);
        integerObj.showType();
        System.out.println("Value of integerObj is " + integerObj.getObject());

        Gen<String> stringObj = new Gen<>("Test");
        stringObj.showType();
        System.out.println("Value of stringObj is \"" + stringObj.getObject() + "\"");

    }
}
