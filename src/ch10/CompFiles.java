package ch10;

import java.io.*;

public class CompFiles {
    public static void main(String[] args) {
        int sumb1, sumb2;
        if (args.length != 2) {
            System.out.println("Program usage: CompFiles file1_name file2_name");
            return;
        }

        try(FileInputStream file1 = new FileInputStream(args[0]);
        FileInputStream file2 = new FileInputStream(args[1])){
            do {
                sumb1 = file1.read();
                sumb2 = file2.read();
                if(sumb1 != sumb2) break;
            }while (sumb1 != -1);
            if (sumb1 != sumb2) System.out.println("Files content doesn't match");
            else System.out.println("Files content match");
        }catch (IOException exc){
            System.out.println("IO error: " + exc);
            return;
        }


    }
}
