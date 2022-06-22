import java.util.Scanner; //Importing scanner to accept values from user
public class Ch3_Q5_I_PG_109
{
    public static void main(String[] args)
    {
        char x;
        Scanner sc = new Scanner(System.in); //Defining scanner
        System.out.println(" > What would you like to do ");
        System.out.println(" > Press '1' to convert Celsius to Fahrenheit ");
        System.out.println(" > Press '1' to convert Fahrenheit to Celsius ");
        x = sc.next().charAt(0); //Accepting choise from user
        if(x == '1') //Using if statement to identify the choise of the user
        {
            double C, F;
            System.out.println(" > Enter temperature in Celsius ");
            F = (C * 1.8) + 32; //Using 1.8 instead of 5/9
            System.out.println(" Temperature in Fahrenheit is --> " + F );
        }
        else if(x == '2')
        {
            double C, F;
            System.out.println(" > Enter temperature in Fahrenheit ");
            C = (F - 32) * 1.8; //Using 1.8 instead of 5/9
            System.out.println(" Temperature in Celsius is --> " + C );
        }
        else
        {
            System.out.println(" > Invalid choise ");
        }
        sc.close(); //Closing resource leak
        System.out.println(" > Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
