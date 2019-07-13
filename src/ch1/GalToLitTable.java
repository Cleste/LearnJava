package ch1;

public class GalToLitTable {
    public static void  main(String[] args)
    {
        double gal, lit;
        int counter = 0;

        for (gal = 1;gal <= 100;gal++)
        {
            lit = gal * 3.7854;
            System.out.println(gal + " галлонов равняется " + lit + " литрам");
            counter++;
            if(counter == 10)
            {
                System.out.println();
                counter = 0;
            }
        }

    }
}
