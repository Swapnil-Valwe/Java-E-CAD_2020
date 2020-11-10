/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage.
   Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. 
   Use concatenation operator here.*/




package Assignment3;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		int a, c, b, d, e, P, T;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the English marks out of 100: ");
		a=sc.nextInt();
		System.out.println("Enter the Maths marks out of 100: ");
		b=sc.nextInt();
		System.out.println("Enter the History marks out of 100: ");
		c=sc.nextInt();
		System.out.println("Enter the EVS marks out of 100: ");
		d=sc.nextInt();
		System.out.println("Enter the Science marks out of 100: ");
		e=sc.nextInt();
		
		T=a+b+c+d+e;
		P=T*100/500;
		System.out.println("The total score out of 500 is: "+T);
		System.out.println("Percentage marks = "+P+"%");
		sc.close();
		
	}
}
