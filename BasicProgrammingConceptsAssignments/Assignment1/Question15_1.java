package Assignment1;
import java.util.Scanner;
class Question15_1
        
{
    public static void main(String[] args) 
      {
           int x, y;
           Scanner in = new Scanner(System.in);

           System.out.println("Input the first number: ");
           x = in.nextInt();
           System.out.println("Input the second number: ");
           y = in.nextInt();

           x=x+y;
           y=x-y;
           x=x-y;

           System.out.println(" Swapped values are:" + x + " and " + y);
           in.close(); 
       }
}



