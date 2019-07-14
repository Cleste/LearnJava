package ch2;

public class Log_Table {
    public static void main(String[] args) {
        boolean p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = false;
        q = false;
        Table(p, q);

        p = false;
        q = true;
        Table(p, q);

        p = true;
        q = false;
        Table(p, q);

        p = true;
        q = true;
        Table(p, q);
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