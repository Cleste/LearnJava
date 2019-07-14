package ch3;

public class ex_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1024; i *= 2) {
            if (i != 1024) System.out.print(i + ", ");
            else System.out.print(i + ".");
        }
    }
}
