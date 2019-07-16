package ch2;

public class Log_Table {
    public static void main(String[] args) {

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        Table(false, false);

        Table(false, true);

        Table(true, false);

        Table(true, true);
    }

    private static void Table(boolean p, boolean q) {
        if (p) System.out.print("1\t");
            else System.out.print("0\t");
        if (q) System.out.print("1\t");
            else System.out.print("0\t");
        if (p & q) System.out.print("1\t");
            else System.out.print("0\t");
        if (p | q) System.out.print("1\t");
            else System.out.print("0\t");
        if (p ^ q) System.out.print("1\t");
            else System.out.print("0\t");
        if (!p) System.out.println("1\t");
            else System.out.println("0\t");
    }
}