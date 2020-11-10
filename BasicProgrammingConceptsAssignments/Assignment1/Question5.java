package Assignment1;
import java.util.Scanner;  

class Question5 
{
  public static void main(String[] args) 
	{
    	int x, y, product;
    	Scanner sc = new Scanner(System.in); 
    	System.out.print("Input first number: ");
    	x = sc.nextInt(); 

    	System.out.print("Input second number: ");
    	y = sc.nextInt(); 

    	product = x * y;
    	System.out.println("Product is: "+ x + " * " + y + " = " + product); 
    	sc.close();
	}
} 
