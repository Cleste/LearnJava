package ch14;

interface MyFunc {
    MyClass func(String str);
}

class MyClass {
    private String str;

    MyClass(String str) {
        this.str = str;
    }

    MyClass() {
        str = "";
    }

    String getStr() {
        return str;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc myClassConstructor = MyClass::new;

        MyClass obj = myClassConstructor.func("Test");

        System.out.println("Object content is: " + obj.getStr());
    }
}
