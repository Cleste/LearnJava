package ch4;

public class FDemo {
    private int x;

    FDemo(int i){
        x = i;
    }

    protected void finalize(){
        System.out.println("Финализация " + x);
    }

    void  generator(int i){
        FDemo o = new FDemo(i);
    }
}
