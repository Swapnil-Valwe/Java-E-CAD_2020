package Assignment3;
import java.util.Scanner;

public class GrossSalary
{
 public static void main(String args[]) 
 {
  float basic, da, hra, da1, hra1, Gross;
 
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter Basic Salary Of Employee: ");
  basic=sc.nextFloat();

  System.out.println("Enter DA Of Employee: "); 
  da1=sc.nextFloat();
 
  System.out.println("Enter HRA Of Employee: ");
  hra1=sc.nextFloat();

  da = (da1 * basic) / 100;
  hra = (hra1 * basic) / 100;

  Gross = basic + da + hra;

  System.out.println("Gross Salary Of Employee: "+Gross);
  sc.close();
  }
}