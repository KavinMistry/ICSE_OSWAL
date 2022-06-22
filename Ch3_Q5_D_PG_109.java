import java.util.Scanner; //Importing scanner to accept values from user
public class Ch3_Q5_D_PG_109
{
    public static void main(String[] args)
    {
        double Y, S, R;
        Scanner sc = new Scanner(System.in); //Defining scanner
        System.out.pritln(" > Enter years of service ");
        Y = sc.nextDouble(); //Accepting years of service from user
        System.out.pritln(" > Enter salary ");
        S = sc.nextDouble(); //Accepting salary from user
        if(Y < 5) //Using if statement to identify years of service 
        {
            R = 0.05 * S; //Using 0.05 instead of 5/100 to calculate percentage because JAVA does not handle divisions well and gives in-accurate values
            S = S + R;
            System.out.println(" revised salary --> " + S );
        }
        else if(Y >= 5 && Y < 10)
        {
            R = 0.1 * S;
            S = S + R;
            System.out.println(" revised salary --> " + S );
        }
        else if(Y >= 10 && Y < 15)
        {
            R = 0.15 * S;
            S = S + R;
            System.out.println(" revised salary --> " + S );
        }
        else if(Y >= 15)
        {
            R = 0.2 * S;
            S = S + R;
            System.out.println(" revised salary --> " + S );
        }
        else
        {
            System.out.println(" Invalid salary or years of service ");
        }
        sc.close(); //Closing resource leak
        System.out.println(" > Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
