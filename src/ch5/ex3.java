package ch5;

public class ex3 {
    public static void main(String[] args) {
        double[] nums = {10.23, 234.23, 123.0, -32.23, 233.23, 23.23,
                23145.546, 7765.54, 457.645, 95403.344};
        double sum = 0;
        System.out.println("Array:");
        for (double x : nums) System.out.print(x + " ");
        for (double x : nums) sum += x;
        System.out.print("\nAverage of array: " + sum/nums.length);
    }
}
