package assignment1;
import java.util.Scanner;  

class Question5 
{
  public static void main(String[] args) 
	{
    	int x, y, product;
    	Scanner myObj = new Scanner(System.in); 
    	System.out.println("Type a number:");
    	x = myObj.nextInt(); 

    	System.out.println("Type another number:");
    	y = myObj.nextInt(); 

    	product = x * y;
    	System.out.println("Product is: " + product); 
	}
} 
