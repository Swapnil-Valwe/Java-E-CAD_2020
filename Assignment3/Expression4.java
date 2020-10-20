/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given 
 * expression and initialize variables by any random value.
    D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/




package Assignment3;

public class Expression4 {
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		boolean z = x && y || !(x || y);
		System.out.print(z);
	}
}
