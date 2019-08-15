package ch10.Homework;

import java.io.*;

public class ByteCopy {
    public static void main(String[] args) {
        int sumb;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length != 2) {
            System.out.println("Program usage: ByteCopy from_name where_name");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do{
                sumb = fin.read();
                if(sumb != -1 & sumb != ' ') fout.write((char) sumb);
                else if (sumb == ' ') fout.write('-');
            }while (sumb != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File not found.");
            return;
        } catch (IOException exc) {
            System.out.println("File read error.");
        } finally {
            try {
                if(fin != null) fin.close();
                if(fout != null) fout.close();
            }catch (IOException exc){
                System.out.println("File close error");
            }
        }
    }
}
