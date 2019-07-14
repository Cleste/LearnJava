package ch3;

public class Game {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква из диапозона A-Z");
            System.out.print("Попытайтесь ее угадать: ");

            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("Правильно!");
            else {
                System.out.print(" ... Извинитe, нужная буква находится ");
                if (ch < answer)
                    System.out.println("ближe к концу алфавита");
                else System.out.println("ближe к началу алфавита");
                System.out.println("Пoвтopитe попытку!\n");
            }
        } while (ch != answer);
    }
}
