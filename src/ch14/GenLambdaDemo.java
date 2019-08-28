package ch14;

interface SomeTest<T>{
    boolean test(T n, T m);
}

public class GenLambdaDemo {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, m) -> (n % m) == 0;
        SomeTest<Double> isFactorD = (n, m) -> (n % m) == 0.0;
        SomeTest<String> isIn = (a, b) -> a.contains(b);
        System.out.println(isFactor.test(10, 2) ? "2 is divider 10" : "2 not divider 10");
        System.out.println(isFactor.test(10, 3) ? "3 is divider 10" : "3 not divider 10");
        System.out.println(isFactorD.test(12.5, 2.5) ? "2.5 is divider 12.5" : "2.5 not divider 12.5");
        System.out.println(isFactorD.test(10.5, 3.0) ? "3.0 is divider 10.5" : "3.0 not divider 10.5");
        System.out.println(isIn.test("String test", "test") ? "\"String test\" contains \"test\"" : "\"String test\" doesn't contains \"test\"");

    }
}
