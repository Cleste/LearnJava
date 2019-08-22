package ch13;


class Arrays<T> implements Containment<T> {

    private T[] array;

    Arrays(T[] array) {
        this.array = array;
    }

    @Override
    public void contains(T checkedVar) {
        for (T x : array)
            if (x.equals(checkedVar)) {
                System.out.println(checkedVar + " is contained in the array");
                return;
            }
        System.out.println(checkedVar + " is not contained in the array");
    }
}

class Summation {
    <T extends Number> Summation(T num) {
        int sum = 0;

        for (int i = 1; i <= num.intValue(); i++)
            sum += i;
        System.out.println("\nSum of numbers from 1 to " +
                num.intValue() + ": " + sum + "\n");
    }

}

public class GenericDemo {
    private static <T extends Comparable<T>, V extends T>
    boolean arraysEqual(T[] firstArr, V[] secondArr) {

        if (firstArr.length != secondArr.length) return false;
        for (int i = 0; i < firstArr.length; i++)
            if (!firstArr[i].equals(secondArr[i])) return false;
        return true;
    }

    public static void main(String[] args) {

        Integer[] testArray = {24, 32, 12, 23, 32};
        Arrays<Integer> array = new Arrays<>(testArray);
        array.contains(12);
        array.contains(7);

        Summation num = new Summation(9.0);

        Integer[] nums1 = {24, 32, 12, 23, 32};
        Integer[] nums3 = {24, 42, 23, 23, 13};
        if (arraysEqual(nums1, nums1)) System.out.println("nums1 equal nums1");
        if (arraysEqual(nums1, testArray)) System.out.println("nums1 equal nums2");
        if (arraysEqual(nums1, nums3)) System.out.println("nums1 equal nums3");
    }
}
