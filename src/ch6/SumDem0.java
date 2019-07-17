package ch6;

public class SumDem0 {
    public static void main(String[] args){
        System.out.println("Sum of numbers 2l, 23, 16: " + sum(21, 23, 16));
        System.out.println("Sum of numbers 2, 3, 5, 7: " + sum(2, 3, 5, 7));
        System.out.println("Empty method call: " + sum());
    }

    private static int sum(int ... nums){
        int result = 0;
        for(int x: nums) result += x;
        return result;
    }
}
