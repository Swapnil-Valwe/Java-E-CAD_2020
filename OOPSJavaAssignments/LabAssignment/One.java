package LabAssignment;
import java.util.Scanner;

class Student{
	int rollno;
	String name;
	int mark;
	Scanner sc;
	
	 void set_data()
	 {
		 	sc = new Scanner(System.in);
			System.out.println("Enter the Roll number: ");
			rollno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name: ");
			name=sc.nextLine();
			//sc.nextLine();
			System.out.println("Enter the Mark: ");
			mark=sc.nextInt();
	 }
	
	void display_data()
	{
	System.out.println("Roll Number: "+rollno);	
	System.out.println("Name      : "+name);	
	System.out.println("Mark      : "+mark);	
	}
	 
	}

public class One
{

	public static void main(String[] args)
	{
	
		Student s1=new Student(), s2=new Student();
		s1.set_data();
		s2.set_data();
		s1.display_data();
	    s2.display_data();
		
}

}
