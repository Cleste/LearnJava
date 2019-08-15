package ch10;

import java.io.*;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = {12.3, 23.12, 24.52, 93.3, 34.32};
        double number;
        try (RandomAccessFile randomF = new RandomAccessFile("random.dat", "rw")) {
            for (double x : data) {
                randomF.writeDouble(x);
            }

            randomF.seek(0);
            number = randomF.readDouble();
            System.out.println("First value: " + number);
            randomF.seek(8);
            number = randomF.readDouble();
            System.out.println("Second value: " + number);
            randomF.seek(8 * 3);
            number = randomF.readDouble();
            System.out.println("Fourth value: " + number);

            for (int i = 0; i < data.length; i += 2) {
                randomF.seek(8 * i);
                number = randomF.readDouble();
                System.out.print(number + " ");
            }
        } catch (IOException exc) {
            System.out.println("IO error: " + exc);
        }
    }
}
