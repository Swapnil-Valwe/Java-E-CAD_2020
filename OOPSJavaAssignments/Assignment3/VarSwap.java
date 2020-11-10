package Assignment3;

import java.util.Scanner;

public class VarSwap {

    public static void main(String[] args)
    {
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first var: ");
        x=sc.nextDouble();
        System.out.print("Input the second var: ");
        y=sc.nextDouble();
        
        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("The swapped vars are: " +x+ " and " + y);
        sc.close();
    }

}
