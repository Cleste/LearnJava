package ch10;

import java.io.*;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleInput = new BufferedReader(new
                InputStreamReader(System.in));
        String line;
        int quantity;
        double sum = 0.0, avg, val;
        System.out.println("How many numbers will you enter?");
        line = consoleInput.readLine();
        try {
            quantity = Integer.parseInt(line);
        } catch (NumberFormatException exc) {
            System.out.println("Wrong format");
            quantity = 0;
        }
        System.out.println("Enter " + quantity + " numbers");
        for (int i = 0; i < quantity; i++){
            line = consoleInput.readLine();
            try {
                val = Double.parseDouble(line);
            } catch (NumberFormatException exc) {
                System.out.println("Wrong format");
                val = 0.0;
            }
            sum += val;
        }
        avg = sum / quantity;
        System.out.println("Average value: " + avg);
    }
}
