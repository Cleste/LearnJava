package ch6;

import com.sun.corba.se.spi.ior.IORTemplate;

public class QuickSortDemo {
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'V', 'z', 'y', 'w', 'S', 'Y', 's', 'W', 'o', 'f'};

        System.out.println("Original array: ");
        for (char x: arr) System.out.print(x + " ");
        QuickSort.qsort(arr);
        System.out.println("\nSorted array: ");
        for (char x: arr) System.out.print(x + " ");
    }
}

class QuickSort {
    static void qsort(char[] items) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(char[] items, int left, int right) {
        int leftPoint = left, rightPoint = right;
        char item = items[(leftPoint + rightPoint) / 2], swap;

        do {
            while ((items[leftPoint] < item) && (leftPoint < right)) leftPoint++;
            while ((items[rightPoint] > item) && (rightPoint > left)) rightPoint--;

            if(leftPoint <= rightPoint){
                swap = items[leftPoint];
                items[leftPoint] = items[rightPoint];
                items[rightPoint] = swap;
                leftPoint++;rightPoint--;
            }
        }while (leftPoint <= rightPoint);

        if(left < rightPoint) qs(items, left, rightPoint);
        if(leftPoint < right) qs(items, leftPoint, right);
    }
}
