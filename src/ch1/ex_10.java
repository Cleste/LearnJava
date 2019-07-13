package ch1;

public class ex_10 {
    public static void main(String[] args)
    {
        double linches, metr;
        int counter = 0;
        for (linches = 1;linches <= 144; linches++)
        {
            metr = linches / 39.7;
            System.out.println("В " + linches + " дюймах " + metr + " метра");
            counter++;

            if(counter == 12)
            {
                System.out.println();
                counter = 0;
            }
        }

    }
}
