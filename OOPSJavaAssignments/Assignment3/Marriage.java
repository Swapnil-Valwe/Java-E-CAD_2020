package Assignment3;
import java.util.*;
public class Marriage 
{
	public static void main (String[] args) 
	{
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			
			System.out.println("Enter sex: M/F");
			int sex = sc.next().charAt(0);
		
			if(sex == 'F')  
		{
				
			if (age>=18) 
			{
			System.out.println("You are eligible for marriage.");
			}
			
			else 
			{
				System.out.println("You are not eligible for marriage.");
			}
		}
			
	
			if(sex == 'M')
		{
				if(age>=21) 
				{
				System.out.println("You are eligible for marriage.");
				}
			
				else {
					System.out.println("You are not eligible for marriage");
					}
		}
			sc.close();
		
	}
}
