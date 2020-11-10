package Assignment1;
import java.util.Scanner;
public class Question19 {
      public static void main(String args[])
    {
        int a, q, i=1, j;
        int bin_num[] = new int[100];
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        a = sc.nextInt();
		
        q = a;
		
        while(q != 0)
        {
            bin_num[i++] = q%2;
            q = q/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
            sc.close();
        }
        System.out.print("\n");
       
    }
}