package ch10;

import java.io.*;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        char sumb;
        BufferedReader consoleInput = new BufferedReader(new
                InputStreamReader(System.in));

        System.out.println("Enter chars. '.' means end of input");

        do{
            sumb = (char) consoleInput.read();
            System.out.print(sumb + " ");
        }while (sumb != '.');
    }
}
