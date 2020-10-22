package Assignment3;

import java.util.Scanner;

public class GreatestIfElse 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	int num1, num2 , num3;
	
	System.out.println("Enter 1st number: ");
	num1=sc.nextInt();
	
	System.out.println("Enter 2nd number: ");
	num2=sc.nextInt();
	
	System.out.println("Enter 3rd number: ");
	num3=sc.nextInt();

    if( num1 >= num2 && num1 >= num3)
        System.out.println(num1+" is the largest Number");

    else if (num2 >= num1 && num2 >= num3)
        System.out.println(num2+" is the largest Number");

    else
        System.out.println(num3+" is the largest Number");
    sc.close();
	}
}
