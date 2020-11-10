package Class_Object_Inheritance_Assignment_8;
import java.util.Scanner;
class Student{
	String name;
	int roll_No;
	void set_Data(String name,int roll_No) 
	{

		this.name = name;
		this.roll_No = roll_No;
	}
	void show_Data()
	{
		System.out.println("Name of Student     : "+name);
		System.out.println("Roll No. of Student : "+roll_No);
	}
}
public class Solution1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of Student:");
		String n=sc.nextLine();
		System.out.println("Enter the Roll No. of Student:");
		int r=sc.nextInt();
		sc.close();
		Student s=new Student();
		s.set_Data(n, r);
		s.show_Data();

	}

}
