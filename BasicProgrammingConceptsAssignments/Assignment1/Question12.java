package Assignment1;
import java.util.Scanner;
 
class Question12
{
	public static void main(String [] args)
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
	double u = (x + y + z) / 3;
        System.out.print("The average value is " + u);
        in.close();
       
    }
}