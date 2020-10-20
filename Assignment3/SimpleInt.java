/*08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using 
  Scanner class.
 */
package Assignment3;
import java.util.Scanner;

public class SimpleInt {
	public static void main(String[] args) {
	
	 double P, R, t;
     double interest;
     Scanner sc=new Scanner(System.in);
     System.out.print("Principal amount: ");
     P=sc.nextDouble();
     System.out.print("Time period: ");
     t=sc.nextDouble();
     System.out.print("Rate of interest: " );
     R = sc.nextDouble();
     
     interest = P*R*t;
     System.out.println("The Simple interest is: "+interest);
     sc.close();
    
	}
}
