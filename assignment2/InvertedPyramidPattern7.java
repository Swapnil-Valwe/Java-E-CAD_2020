package Assignment2;

import java.util.Scanner;

public class InvertedPyramidPattern7 {
	  public static void main(String args[])
	  {
		  int num;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter value");
		  num=sc.nextInt();
		  for(int i=num; i>0; i--)
		  {
			  for(int j=0; j<=num-i; j++)
			  {
				  System.out.print(" ");
			  }
			  for(int j=0;j<(i*2)-1;j++)
			  {
				  System.out.print(i);
				  
			  }
			   System.out.println();
			   sc.close();
		  }
		  
	  }

}
