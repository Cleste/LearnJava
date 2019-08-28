package ch14;

interface StringFunc {
    String func(String str);
}

public class LambdaArgumentDemo {

    static String changeString(StringFunc sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions extend Java";
        String outStr;
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        outStr = changeString(reverse, inStr);
        System.out.println("Reversed string: " + outStr);

        outStr = changeString((str) -> str.replace(' ', '-'), inStr);
        System.out.println("String with replaced spaces: " + outStr);

        outStr = changeString((str) -> {
            String result = "";
            char symb;
            for (int i = 0; i < str.length(); i++) {
                symb = str.charAt(i);
                if (Character.isUpperCase(symb))
                    result += Character.toLowerCase(symb);
                else
                    result += Character.toUpperCase(symb);
            }
            return result;
        }, inStr);
        System.out.println("String with reversed case: " + outStr);
    }
}
