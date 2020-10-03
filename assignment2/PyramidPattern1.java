package assignment2;
import java.util.Scanner;

class PyramidPattern1
{
    public static void main(String[] args)
    {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of rows needed in the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing Pyramid **");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
