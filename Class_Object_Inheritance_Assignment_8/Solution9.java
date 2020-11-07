package Class_Object_Inheritance_Assignment_8;
import java.util.Scanner;


abstract class Processor{
	int data;
    void showData(int data)
    {
    	System.out.println("Your entered value is : "+data);
    }
    
	abstract void process();
	
}

class Factorial extends Processor
{
	public Factorial(int data)
	{
		super.data=data;
		showData(data);
	}
	
	void process()
	{
		int i,fact=1;  
		int number=this.data;    
		  for(i=1;i<=number;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact); 
		  System.out.println();
	}
	
}
class Circlee extends Processor
	{
		public Circlee(int data)
		{
			super.data=data;
			showData(data);
		}
		
		void process()
		{
			 int r=this.data;
		     double pi = 3.14, area;
		     area = pi * r * r;
		     System.out.println("Area of circle:"+area);
		     System.out.println();
		}
		
	}

public class Solution9 {

	public static void main(String[] args) {
		while(true) {
		System.out.println("Enter 1. for to find Factorial      : \nEnter 2. for to find Area of Circle : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1 :
		{
		System.out.println("Enter the value for to find factorial");
		int data=sc.nextInt();
		Processor f=new Factorial(data);
		f.process();
		}
		break;
		case 2 :
		{
		System.out.println("Enter the value for fond area of circle");
		int data1=sc.nextInt();
		Processor c =new Circlee(data1);
		c.process();
		}
		break;
		
	
		}
			
		}
			
	}

}