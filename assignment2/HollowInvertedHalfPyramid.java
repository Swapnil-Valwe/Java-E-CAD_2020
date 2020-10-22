package Assignment2;

import java.util.Scanner;

public class HollowInvertedHalfPyramid {
	public static void main(String args[])
	  {
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter value");
		  num=sc.nextInt();
		  int m=num;
		  for(int i=1; i<=num; i++)
		  {
			for(int j=num; j>=i; j--)
	                {
	                    if(j==1 || j==m || i==1 || i==j )
	                    {
	                        System.out.print("*");
	                    }
	                    else
	                    {
	                        System.out.print(" ");
	                    }
	                }
	                System.out.println(" ");
	                sc.close();
		  }
		  
	  }

}
