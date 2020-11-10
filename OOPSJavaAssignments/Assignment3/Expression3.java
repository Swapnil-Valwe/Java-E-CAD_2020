/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given 
 *      expression and initialize variables by any random value.
 C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
*/


package Assignment3;

public class Expression3 {
		public static void main(String[] args) {
			int x = 15;
			int y = 20;
			int z = x++ - --y - --x + x++;
			System.out.println("The value of x: "+x);
			System.out.println("The value of y: "+y);
			System.out.println("The value of z: "+z);
		}
}
