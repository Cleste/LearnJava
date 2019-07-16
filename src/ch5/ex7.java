package ch5;

public class ex7 {
    public static void main(String[] args) {
        String msg = "Message for test";
        String encd;
        String decd;

        System.out.println("\nOriginal message: ");
        System.out.println(msg);

        encd = String_Encoder.encode(msg, "password");

        System.out.println("\nEncoded message : ");
        System.out.println(encd);

        decd = String_Encoder.encode(encd, "password");

        System.out.println("\nDecoded message: ");
        System.out.println(decd);

    }
}

class String_Encoder {
    //Encode and decode do the same thing, so that the reason why they in the same method.
    static String encode(String msg, String key) {
        String encdMsg = "";
        int j = 0;
        for (int i = 0; i < msg.length(); i++) {
            encdMsg += (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        return encdMsg;
    }
}
