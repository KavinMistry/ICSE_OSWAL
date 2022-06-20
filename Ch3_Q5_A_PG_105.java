import java.util.Scanner;

public class Ch3_Q5_A_PG_105
{
    public static void main(String[] args)
    {
        Double TI, TAX;
        Scanner sc = new Scanner(System.in); //Initiating scanner
        System.out.println(" > Enter income "); 
        TI = sc.nextDouble(); //Accepting value of income
        if(TI < 160000)
        {
            System.out.println(" TAX --> NIL ");
        }
        else if(TI > 160000 && TI <= 500000)
        {
            TAX = (TI - 160000);
            TAX = 0.1 * TAX; //Using 0.1 instead of 10/100 because JAVA does not work well with divisions.
            System.out.println(" TAX --> " + TAX); 
        }
        else if(TI > 500000 && TI <= 800000)
        {
            TAX = (TI - 500000);
            TAX = 0.2 * TAX; //Again Using 0.2 instead of 20/100
            TAX = TAX + 34000;
            System.out.println(" TAX --> " + TAX );
        }
        else if(TI >= 800000 )
        {
            TAX = (TI - 800000);
            TAX = 0.3 * TAX;
            TAX = TAX + 94000;
            System.out.println(" TAX --> " + TAX);
        }
        else
        {
            System.out.println(" ERROR --> Invalid input ");
        }
        System.out.println(" Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}