package ch14;

interface IntPredicate {
    boolean test(int num);
}

class MyIntPredicate {
    static boolean isEven(int val) {
        return (val % 2) == 0;
    }

    static boolean isPrime(int val) {
        if (val < 2) return false;
        for (int i = 2; i < val / i; i++) {
            if (val % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPositive(int val){
        return val > 0;
    }
}

public class MethodRefDemo {
    private static boolean numTest(IntPredicate p, int val) {
        return p.test(val);
    }

    public static void main(String[] args) {
        if(numTest(MyIntPredicate::isPrime, 17))
            System.out.println("17 is prime");
        if (numTest(MyIntPredicate::isEven, 8))
            System.out.println("8 is even");
        if (numTest(MyIntPredicate::isPositive, 3))
            System.out.println("3 is positive");
    }
}
