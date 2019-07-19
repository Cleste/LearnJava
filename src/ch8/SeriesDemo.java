package ch8;


public class SeriesDemo {
    public static void main(String[] args) {

        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("ByTwos next value: " + ob.getNext());
            ob = threeOb;
            System.out.println("ByThree next value: " + ob.getNext());
        }

        twoOb.reset();
        System.out.println("\n\nDemo of method getNextArray for twoOb: ");

        int[] q = twoOb.getNextArray(5);
        for (int val: q) {System.out.print(val + " ");
        }
    }
}