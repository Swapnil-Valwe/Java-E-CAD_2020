package LabAssignment;
import java.util.Scanner;

class SimpleIntrest
{
double principle_amount;
double time;
static double intrest_rate=12;

public void getDetail() 
{
  try (Scanner sc = new Scanner(System.in)) {
	System.out.print("Enter the principle_amount :: ");
	 principle_amount = sc.nextDouble();
	 System.out.print("Enter Time Period in years:: ");
	 time = sc.nextDouble();
}

}

public void display()
{
	 System.out.println(" Principle Amount    = " + principle_amount);
 System.out.println(" Time                = " + time);
 System.out.println(" Fixed Intrest Rate = " +intrest_rate);
 System.out.println(" Simple Intrest     = " +((principle_amount*time*intrest_rate)/100));
}

 }
class Five{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);	 
 System.out.println("Enter the value for number of Simple Interest  that you count:");
 int n=sc.nextInt();
 
 
 SimpleIntrest si[] = new SimpleIntrest[n];
 for(int i=0; i<n; i++) 
 {
     si[i] = new SimpleIntrest();
     si[i].getDetail();
 }
   System.out.println("");
   for(int i=0; i<n; i++)
   {
     si[i].display();
  }
  
   sc.close();
}
}

