import java.util.Scanner; //Importing scanner to accept values from user
public class Ch3_Q5_G_PG_109
{
    public static void main(String[] args)
    {
        double W;
        Scanner sc = new Scanner(System.in); //Defining scanner
        System.out.println(" > Enter weight of groceries ");
        W = sc.nextDouble(); //Accepting weight of groceries from user
        if(W <= 10 && W >= 8) //Using if statement to identify weight of groceries 
        {
            System.out.println(" Gift is --> A chocolate cake ");
        }
        else if(W <= 7 && W >= 5)
        {
            System.out.println(" Gift is --> A vanilla cake ");
        }
        else if(W <= 4 && W >= 2)
        {
            System.out.println(" Gift is --> A fruit juice bottle ");
        }
        else
        {
            System.out.println(" Invalid weight of groceries ");
        }
        sc.close(); //Closing resource leak
        System.out.println(" > Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
