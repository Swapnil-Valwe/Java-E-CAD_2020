package Assignment3;

import java.util.Scanner;

public final class Farenheit {
	public static void main(String[] args) {
		double f,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("The temperature in Farenheit is: ");
		f=sc.nextDouble();
		
		c=(f-32)*5/9;
		System.out.print("The Temperature in celcius is: "+c);
		sc.close();
		
	} 

}
