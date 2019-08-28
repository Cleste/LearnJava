package ch14;

interface NumericTest {
    boolean test(int n, int m);
}

public class LambdaDemo {
    public static void main(String[] args) {
        NumericTest isFactor = (n, d) -> (n % d) == 0;
        System.out.println(isFactor.test(10, 2) ? "2 is divider 10" : "2 not divider 10");
        System.out.println(isFactor.test(10, 3) ? "3 is divider 10" : "3 not divider 10");

        NumericTest lessThan = (n, d) -> n < d;
        System.out.println(lessThan.test(5, 4) ? "5 less than 4" : "5 more than 4");
        System.out.println(lessThan.test(4, 5) ? "4 less than 5" : "4 more than 500");

    }
}
