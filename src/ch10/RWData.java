package ch10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int intVal = 77;
        double doubleVal = 77.77;
        boolean boolVal = false;
        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testRW"))) {
            dataOut.writeInt(intVal);
            System.out.println("Recorded: " + intVal);
            dataOut.writeDouble(doubleVal);
            System.out.println("Recorded: " + doubleVal);
            dataOut.writeBoolean(boolVal);
            System.out.println("Recorded: " + boolVal);
            dataOut.writeDouble(12.85 * 64.23);
            System.out.println("Recorded: " + 12.85 * 64.23);
        }catch (IOException exc){
            System.out.println("Record error.");
            return;
        }
        System.out.println();
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("testRW"))) {
            intVal = dataIn.readInt();
            System.out.println("Read: " + intVal);
            doubleVal = dataIn.readDouble();
            System.out.println("Read: " + doubleVal);
            boolVal = dataIn.readBoolean();
            System.out.println("Read: " + boolVal);
            doubleVal = dataIn.readDouble();
            System.out.println("Read: " + doubleVal);
        }catch (IOException exc){
            System.out.println("Read error.");
            return;
        }
    }
}
