import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Ch3_Q5_I_PG_109
{
    public static void main(String[] args)
    {
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.println(" > What would you like to do ");
        System.out.println(" > Press '1' to convert Celsius to Fahrenheit ");
        System.out.println(" > Press '1' to convert Fahrenheit to Celsius ");
        x = sc.next().charAt(0);
        if(x == '1')
        {
            double C, F;
            System.out.println(" > Enter temperature in Celsius ");
            F = (C * 1.8) + 32;
            System.out.println(" Temperature in Fahrenheit is --> " + F );
        }
        else if(x == '2')
        {
            double C, F;
            System.out.println(" > Enter temperature in Fahrenheit ");
            C = (F - 32) * 1.8;
            System.out.println(" Temperature in Celsius is --> " + C );
        }
        else
        {
            System.out.println(" > ");
        }
        sc.close();
        System.out.println(" Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
