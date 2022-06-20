import java.util.Scanner; //Importing scanner to accept values from user
public class Ch3_Q5_B_PG_105
{
    public static void main(String[] args)
    {
        Double TC, Dis;
        Scanner sc = new Scanner(System.in); //Defining scanner
        System.out.println(" > Enter the total cost ");
        TC = sc.nextDouble(); //Accepting value of total cost using scanner
        if(TC < 2000 )
        {
            Dis = 0.15 * TC; //Using 0.15 instead of 15/100 to calculate percentage because JAVA does not handle divisions well
            Dis = TC - Dis; //Defining 'Dis' variable two separate times because it gives accurate results
            System.out.println(" Discounted price is --> " + Dis );
        }
        else if(TC > 2000 && TC <= 5000 )
        {
            Dis = 0.25 * TC; 
            Dis = TC - Dis;
            System.out.println(" Discounted price is --> " + Dis );
        }
        else if(TC > 5000 && TC <= 10000 )
        {
            Dis = 0.35 * TC
            Dis = TC - Dis;
            System.out.println(" Discounted price is --> " + Dis );
        }
        else
        {
            System.out.println(" Invalid Total cost ");
        }
        System.out.println(" Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
