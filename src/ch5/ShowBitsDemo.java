package ch5;

public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits small = new ShowBits(8);
        ShowBits medium = new ShowBits(16);
        ShowBits large = new ShowBits(32);

        System.out.println("637 in binary:");
        small.show(253);
        System.out.println("\n63922 in binary:");
        medium.show(63922);
        System.out.println("\n3832848234 in binary:");
        large.show(3832848234L);
        System.out.println("\nlast 8 bits of th number 63922 in binary:");
        small.show(63922);
    }
}

class ShowBits {
    private int numbits; //variable for the number of bits

    ShowBits(int num) {
        numbits = num;
    }

    void show(long val) {
        long mask = 1;
        byte spacer = 0; //For space each 8 bits
        //correct position of 1
        mask <<= numbits - 1;
        //show val in binary
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if (spacer % 8 == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
    }
}