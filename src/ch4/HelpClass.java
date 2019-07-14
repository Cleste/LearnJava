package ch4;

public class HelpClass {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        for (; ; ) {
            do {
                Help.showmenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!Help.isvalid(choice));

            if (choice == 'q') break;

            System.out.println();

            Help.showmenu(choice);

            System.out.println();
        }
    }
}
