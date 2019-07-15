package ch5;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] nums = {23, 2134, -234, 3421, 32,
                3, 13241, 0, -23, -6};
        int size = 10, swap;

        System.out.print("Иcxoдный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);

        System.out.println();

        for (int i = 1; i < 10; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (nums[j - 1] > nums[j]) {
                    swap = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = swap;
                }
            }
        }
        System.out.print("Отсортированный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);

    }
}
