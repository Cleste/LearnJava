package ch2;

public class Primes {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Эта программа выводит все простые числа в диапозоне от 2 до 1000");
        System.out.print("2, ");
        for (int i = 3; i < 1000; i += 2)
            notprime:{
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    if (i % j == 0) break notprime;
                }
                System.out.print(i + ", ");
                counter++;
                if (counter == 10) {
                    System.out.println();
                    counter = 0;

                }

            }
    }
}
