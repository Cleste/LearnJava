package ch10;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int sumb;
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Program usage: ShowFile file_name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            do {
                sumb = fin.read();
                if (sumb != -1) System.out.print((char) sumb);
            } while (sumb != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File not found.");
            return;
        } catch (IOException exc) {
            System.out.println("File read error.");
        }finally {
            try{
                if(fin != null) fin.close();
            }catch (IOException exc){
                System.out.println("File close error.");
            }
        }

    }
}
