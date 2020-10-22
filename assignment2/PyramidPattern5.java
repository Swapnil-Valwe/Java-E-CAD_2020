package Assignment2;
import java.util.*;
public class PyramidPattern5 {
	
	  public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter value");
		  int num=sc.nextInt();
	            for(int i=num; i>=1; i-- )
	            {
	            for(int j=1; j<=i*2; j++)
	            {
	              System.out.print(" ");
	            }
	            for(int j=i; j<=num; j++){//print right part of Piramid
	            System.out.print(j+" ");
	            }
	            for(int j=num-1; j>=i; j--)
	            {
	            System.out.print(j+" "); 
	            }
	             System.out.println();
	           sc.close();
	            }
	        
	  }
	}


