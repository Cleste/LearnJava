package ch6;

public class PassOb {
    public static void main(String[] args) {
        Block obj1 = new Block(7,4,5);
        Block obj2 = new Block(7,4,5);
        Block obj3 = new Block(2,7,10);

        System.out.println("obj1 have same size as obj2: " + obj1.SameBlock(obj2));
        System.out.println("obj1 have same size as obj3: " + obj1.SameBlock(obj3));
        System.out.println("obj2 have same volume as obj3: " + obj2.SameBlock(obj3));
    }
}

class Block {
    private int a, b, c;
    private int volume;

    Block(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
        volume = a * b * c;
    }

    boolean SameBlock(Block obj){
        return (a == obj.a) && (b == obj.b) && (c == obj.c);
    }

    boolean SameVolume(Block obj){
        return volume == obj.volume;
    }
}