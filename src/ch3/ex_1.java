package ch3;

public class ex_1 {
    public static void main(String[] args)
            throws java.io.IOException {
        int counter = 0;
        char symb;
        System.out.println("Введите любую строку содержащую точку.Программа найдет количество пробелов до первого символа точки.");
        do {
            symb = (char) System.in.read();
            if (symb == ' ') counter++;
        } while (symb != '.');
        if (counter != 0) System.out.println("Количество пробелов до первого символа точки равно:" + counter);
        else System.out.println("Пробелов до первого символы точки не найдено.");
    }
}
