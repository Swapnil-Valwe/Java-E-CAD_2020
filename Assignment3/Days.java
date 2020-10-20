package Assignment3;

import java.util.Scanner;

public class Days {
public static void main(String[]args) {
	int d, y, m;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of days: ");
	d=sc.nextInt();
	y=d/365;
	m=y%d;
	System.out.print("Years: "+y+" and Months: "+m);
	sc.close();
	
}
}
