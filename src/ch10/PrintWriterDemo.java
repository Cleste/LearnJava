package ch10;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter consoleOutput = new PrintWriter(System.out, true);
        consoleOutput.println(10);
        consoleOutput.println(23.23);
        consoleOutput.println("10 + 23.23 = " + (10 + 23.23));
    }
}
