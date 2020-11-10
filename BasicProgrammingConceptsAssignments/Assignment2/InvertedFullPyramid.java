package Assignment2;
class InvertedFullPyramid
{
    public static void main(String args[])
    {
        int sp=5;
        for (int i=6; i>=1; i--)
        {
            for(int k=1; k<=sp; k++)
            {
                System.out.print("  ");    
            }
            sp++;
            for (int j=1; j<=i; j++)
            {
                System.out.print("  * ");
            }
            System.out.println();
        }
    }
}
