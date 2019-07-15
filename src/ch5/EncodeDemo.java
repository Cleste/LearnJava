package ch5;


public class EncodeDemo {
    public static void main(String[] args) {
        String msg = "Message for test";
        String encd;
        String decd;

        System.out.println("\nOriginal message: ");
        System.out.println(msg);

        encd = Encoder.encode(msg, 34);

        System.out.println("\nEncoded message : ");
        System.out.println(encd);

        decd = Encoder.encode(encd, 34);

        System.out.println("\nDecoded message: ");
        System.out.println(decd);

    }
}

class Encoder {
    //Encode and decode do the same thing, so that the reason why they in the same method.
    static String encode(String msg, int key) {
        String encd_msg = "";
        for (int i = 0; i < msg.length(); i++) {
            encd_msg += (char) (msg.charAt(i) ^ key);
        }
        return encd_msg;
    }
}