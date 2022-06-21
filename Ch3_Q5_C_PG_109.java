import java.util.Scanner; //Importing scanner to accept values from user
public class Ch3_Q5_C_PG_109
{
    public static void main(String[] args)
    {
        double ATI, TAX;
        Scanner sc = new Scanner(System.in); //Defining scanner
        System.out.println(" > Enter your total annual income ");
        ATI = sc.nextDouble(); //Accepting total annual income using scanner
        if(ATI <= 100000 ) //Using if statement to identify value of Total income
        {
            System.out.println(" > No TAX ");
        }
        else if(ATI > 100000 && ATI <= 150000 )
        {
            TAX = ATI - 100000; //Defining 'TAX' multiple times because JAVA gives in-accurate values if done together
            TAX = 0.1 * TAX; //Using 0.1 instead of 10/100 to calculate percentage because JAVA does not handle divisions well and gives in-accurate values
            System.out.println(" TAX --> " + TAX );
        }
        else if(ATI > 150000 && ATI <= 250000 )
        {
            TAX = ATI - 150000;
            TAX = 0.2 * TAX;
            TAX = TAX + 5000;
            System.out.println(" TAX --> " + TAX );
        }
        else if(ATI > 250000 )
        {
            TAX = ATI - 250000;
            TAX = 0.3 * TAX;
            TAX = TAX + 25000;
            System.out.println(" TAX --> " + TAX );
        }
        else
        {
            System.out.println(" Invalid annual income ");
        }
        System.out.println(" Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
