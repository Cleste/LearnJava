package ch6;
/*Напишите рекурсивный метод, отображающий символы, составляющие строку в
обратном порядке.*/

public class ReverseDemo {
    public static void main(String[] args) {
        String testStr = "Hello world!";
        System.out.println(reverse(testStr));
    }

    private static String reverse(String str) {
        if (str.length() <= 1) return str;

        String result = "";

        result += str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
        //The substring (i, j) method extract the specified string from i to j.

        return result;
    }
}


