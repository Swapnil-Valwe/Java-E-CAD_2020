/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully 
 the given expression and initialize variables by any random value.
B. y = x++ + ++x (print value of x and y) 
*/



package Assignment3;

public class Expression2 
{
	public static void main(String [] args)
	{
		int x = 10;
		int y = x++ + ++x;
		System.out.println("The value of y: "+y);	
		System.out.print("The value of x: "+x);
	}

}
