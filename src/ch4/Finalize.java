package ch4;

public class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo obj = new FDemo(0);
        for (count = 1; count < 1000000; count++)
            obj.generator(count);
    }
}
