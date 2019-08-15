package ch10;

import java.io.*;

public class KtoD {
    public static void main(String[] args) {
        String line;
        BufferedReader consoleInput = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter strings. \"Stop\" means end of input.");
        try (FileWriter file = new FileWriter("test.txt")) {
            for (; ; ) {
                line = consoleInput.readLine();
                if (line.equals("Stop") || line.equals("stop")) break;
                line = line + "\r\n";
                file.write(line);
            }
        } catch (IOException exc) {
            System.out.println("IO error" + exc);
            return;
        }
    }
}
