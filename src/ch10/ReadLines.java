package ch10;

import java.io.*;

public class ReadLines {
    public static void main(String[] args) throws IOException {
        String line;

        BufferedReader consoleInput = new BufferedReader(new
                InputStreamReader(System.in));

        System.out.println("Enter strings. \"Stop\" means end of input");
        do {
            line = consoleInput.readLine();
            System.out.println(line);
        }while (!line.equals("Stop") & !line.equals("stop"));
    }
}
