package ch3;

public class ex_10 {
    public static void main(String[] args)
            throws java.io.IOException {
        char sumb;
        int counter = 0;
        System.out.println("Введите любую букву английского алфавита и программа поменяет ее регистр на обратный." +
                "Программа завершит работу при введении символа точки");

        do {
            sumb = (char) System.in.read();
            if (sumb > 'a' & sumb < 'z') {
                System.out.println("\n " + (char) (sumb - 32));
                counter++;
            }
            if (sumb > 'A' & sumb < 'Z') {
                System.out.println("\n " + (char) (sumb + 32));
                counter++;
            }
        } while (sumb != '.');
        if (counter != 0) System.out.println("Замена регистра была произведена " + counter + " раза");
        else System.out.println("Замена регистра не была произведена");
    }
}
