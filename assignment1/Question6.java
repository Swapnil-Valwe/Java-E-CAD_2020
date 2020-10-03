package assignment1;
import java.util.Scanner;  

class Question6 
{
  public static void main(String[] args) 
	{
    	int x, y, product, sum, sub, Divide, Mod;
    	Scanner Obj = new Scanner(System.in); 
    	System.out.println("Type a number:");
    	x = Obj.nextInt(); 

    	System.out.println("Type another number:");
    	y = Obj.nextInt(); 

    	product = x * y;
	sum = x + y;
	sub = x - y;
	Divide = x / y;
	Mod= x % y;
    	System.out.println("Product is: "+product); 
	System.out.println("Sum is: "+sum);
	System.out.println("Sub is: "+sub);
	System.out.println("Division is: "+Divide);
	System.out.println("Remainder is: "+Mod);
	}
} 
