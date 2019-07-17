package ch6;

public class SumDemo {
    public static void main(String[] args) {
        Summatilon obj1 = new Summatilon(5);
        Summatilon obj2 = new Summatilon(obj1);

        System.out.println("obj1.sum: " + obj1.sum);
        System.out.println("obj2.sum: " + obj2.sum);
    }
}

class Summatilon {
    int sum;

    Summatilon(int num) {
        sum = 0;
        for (int i = 0; i <= num; i++) sum += i;
    }

    Summatilon(Summatilon obj){
        sum = obj.sum;
    }
}
