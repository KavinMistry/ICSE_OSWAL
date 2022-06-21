import java.util.Scanner; //Importing scanner to accept values from user
public class Ch3_Q5_E_PG_109
{
    public static void main(String[] args)
    {
        double D, LF;
        Scanner sc = new Scanner(System.in); //Defining scanner
        System.out.println(" > Enter the number of days late ");
        D = sc.nextDouble(); //Accepting number of days late from user
        if(D <= 3) //Using if statement to identify years of service 
        {
            LF = D * 4;
            System.out.println(" Late fine is --> " + LF);
        }
        else if(D > 3 && D <= 7)
        {
            LF = D * 8;
            System.out.println(" Late fine is --> " + LF);
        }
        else if(D > 7 && D <= 10)
        {
            LF = D * 12;
            System.out.println(" Late fine is --> " + LF);
        }
        else if(D > 10)
        {
            LF = D * 15;
            System.out.println(" Late fine is --> " + LF);
        }
        else 
        {
            System.out.println(" > Invalid amount of days late ");
        }
        System.out.println(" Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
