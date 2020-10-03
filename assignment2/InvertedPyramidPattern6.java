package assignment2;
class InvertedPyramidPattern6
{
    public static void main(String args[])
    {
        int sp=10;
        for (int i=9; i>=1; i--)
        {
            for(int k=9; k<=sp; k++)
            {
                System.out.print(" ");    
            }
            sp++;
            for (int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
