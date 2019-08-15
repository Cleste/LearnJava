package ch10;

import java.io.*;

public class DtoS {
    public static void main(String[] args) {
        String line;
        try (BufferedReader fileInput = new BufferedReader(new
                FileReader("test.txt")))
        {
            while ((line = fileInput.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException exc){
            System.out.println("IO error: " + exc);
        }
    }
}
