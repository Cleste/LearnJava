package ch14;

interface MyGenFunc<T>{
    T func(T val);
}

public class GenFactorialLambda {
    public static void main(String[] args) {
        MyGenFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };

        System.out.println("5! = " + factorial.func(5));
        System.out.println("7! = " + factorial.func(7));
        System.out.println("2! = " + factorial.func(2));
        System.out.println("0! = " + factorial.func(0));
    }
}
