package ch5;

public class ex_4 {
    public static void main(String[] args) {
        String[] arr = {"Hi, ", "It ", "Is ", "Bubble ", "Sort "};
        String swap;

        System.out.print("Original array: ");
        for (String x : arr)
            System.out.print(x);

        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    swap = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (String x : arr)
            System.out.print(x);

    }
}
