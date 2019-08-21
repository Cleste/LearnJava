package ch13;

class NumericFns<T extends Number> {
    private T num;

    NumericFns(T object) {
        num = object;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }


    T getNum() {
        return num;
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> intObj = new NumericFns<>(10);
        System.out.println("intObj value is " + intObj.getNum());
        NumericFns<Double> doubleObj = new NumericFns<>(10.5);
        System.out.println("doubleObj value is " + doubleObj.getNum());
        System.out.println("Fraction of " + doubleObj.getNum() + " is " + doubleObj.fraction());
    }
}
