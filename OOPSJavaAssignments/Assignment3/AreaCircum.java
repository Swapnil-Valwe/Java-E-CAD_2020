/*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
 Then calculate and print the area and circumference of the circle.*/

package Assignment3;

import java.util.*;
class AreaCircum
{
    public static void main(String[] args)
    {
        double R, Circum, Area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the Radius of the: ");
        R=sc.nextDouble();
       
        Circum = 2 * Math.PI * R;
        Area = Math.PI * Math.pow(R, 2);
        
        System.out.println("The Circumference of the Circle is: " + Circum);
        System.out.println("The Area of the Circle is: " + Area);
       sc.close();
      
    }
}
