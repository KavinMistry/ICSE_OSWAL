import java.util.Scanner; //Importing scanner to accept values from user
public class Ch3_Q5_H_PG_109
{
    public static void main(String[] args)
    {
        char x;
        Scanner sc = new Scanner(System.in); //Defining scanner
        System.out.println(" > Which figure would you like to calculate the area of ? ");
        System.out.println(" > Press '1' To calculate the area of a Square ");
        System.out.println(" > Press '2' To calculate the area of a Circle ");
        System.out.println(" > Press '3' To calculate the area of a Rectangle ");
        x = sc.next().charAt(0); //Accepting choise from user
        if(x == '1') //Using if statement to identify the choise of the user
        {
            double S, A;
            System.out.println(" > Enter the value of a side of the Square ");
            S = sc.nextDouble();
            A = S * S;
            System.out.println(" Area is --> " + A );
        }
        else if(x == '2')
        {
            double R, A;
            System.out.println(" > Enter the value of Radius of the circle ");
            R = sc.nextDouble();
            A = (R * R) * 3.14; //Using 3.14 instead of 22/7 for the value of PI
            System.out.println(" Area is --> " + A );
        }
        else if(x == '3')
        {
            double L, B, A;
            System.out.println(" > Enter the value of Length of the rectangle ");
            L = sc.nextDouble();
            System.out.println(" > Enter the value of Breadth(Width) of the rectangle ");
            B = sc.nextDouble();
            A = L * B; 
            System.out.println(" Area is --> " + A );
        }
        else
        {
            System.out.println(" Invalid choise ");
        }
        sc.close();
        System.out.println(" Contact me on github if you face any issues with the program \n GITHUB ID --> KavinMistry ");
    }
}
