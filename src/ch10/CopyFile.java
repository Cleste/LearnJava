package ch10;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        int sumb;
        if (args.length != 2) {
            System.out.println("Program usage: CopyFile from_name where_name");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])){
            do{
                sumb = fin.read();
                if(sumb != -1) fout.write((char) sumb);
            }while (sumb != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File not found.");
            return;
        } catch (IOException exc) {
            System.out.println("File read error.");
        }
    }
}
