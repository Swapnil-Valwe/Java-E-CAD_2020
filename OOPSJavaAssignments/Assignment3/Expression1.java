/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the 
        given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) */



package Assignment3;

public class Expression1 
{
public static void main(String[] args) 
	{
	int x=8;
	int y = (int) (Math.pow(x, 2) + 3 * x -7);
	System.out.print(y);
	}
}
