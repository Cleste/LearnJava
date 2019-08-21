package ch12;

//@Deprecated
class MyClass{
    private String message;

    MyClass(String message){
        this.message = message;
    }

    @MyAnno(str = "Test my anno", val = 1)
    public static void myMeth(){
        System.out.println("myMeth");
    }

    @Deprecated
    public String getMessage() {
        return message;
    }
}


public class AnnoDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass("Test");
        obj.getMessage();
        MyClass.myMeth();
    }
}
