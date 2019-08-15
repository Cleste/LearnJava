package ch10.HelpPack;

import java.io.*;

public class Help {
    private String fileName;

    Help(String fileName){
        this.fileName = fileName;
    }
    boolean helpOn(String what){
        int sumb;
        String themeName, themeInfo;
        try(BufferedReader helpRdr = new BufferedReader(new
                FileReader(fileName))){
            do {
                sumb = helpRdr.read();
                if (sumb == '#'){
                    themeName = helpRdr.readLine();
                    if (what.equals(themeName)){
                        do {
                            themeInfo = helpRdr.readLine();
                            if (themeInfo != null) System.out.println(themeInfo);
                        }while ((themeInfo != null) && (!themeInfo.equals("")));
                    }
                }
            }while (sumb != -1);

        }catch (IOException exc){
            System.out.println("File access error.");
            return false;
        }
        return false;
    }

    String getSelection() {
        String theme = "";
        BufferedReader InputStream = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.println("Enter theme:");
        try {
            theme = InputStream.readLine();
        } catch (IOException exc) {
            System.out.println("Input error!");
        }
        return theme;
    }

}
