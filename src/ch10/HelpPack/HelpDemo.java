package ch10.HelpPack;

public class HelpDemo {
    public static void main(String[] args) {
        Help operators = new Help("operators.txt");
        String themeName;
        System.out.println("Select a theme. To stop the program, enter stop");
        do{
            themeName = operators.getSelection();
            if(!operators.helpOn(themeName)) System.out.println("Theme is not found");
        }while (!themeName.equals("stop") && !themeName.equals("Stop"));
    }
}
