import java.util.Scanner; //Importing scanner to accept values from user
public class Ch3_Q5_F_PG_109
{
    public static void main(String[] args)
    {
        double PA, DIS;
        Scanner sc = new Scanner(System.in); //Defining scanner
        System.out.pritln(" > Enter purchase amount ");
        PA = sc.nextDouble(); //Accepting number of days late from user
        if(PA >= 20000 ) //Using if statement to identify purchase amount
        {
            DIS = 0.25 * PA; //Using 0.25 instead of 25/100 to calculate percentage because JAVA does not handle divisions well and gives in-accurate values
            DIS = PA - DIS;
            System.out.println(" Amount payable --> " + PA + "\n Gift recived --> anipod ");
        }
        else if(PA < 20000 && PA >= 12000 )
        {
            DIS = 0.20 * PA;
            DIS = PA - DIS;
            System.out.println(" Amount payable --> " + PA + "\n Gift recived --> wrist watch ");
        }
        else if(PA < 12000 && PA >= 5000 )
        {
            DIS = 0.11 * PA;
            DIS = PA - DIS;
            System.out.println(" Amount payable --> " + PA + "\n Gift recived --> digital table clock ");
        }
        else if(PA < 5000 )
        {
            DIS = 0.05 * PA;
            DIS = PA - DIS;
            System.out.println(" Amount payable --> " + PA + "\n Gift recived --> pen set ");
        }
        else
        {
            System.out.println(" Invalid purchase amount ");
        }
        sc.close(); //Closing resource leak
        System.out.println(" > Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
