package Interface_Inheritance_Assignment_6;
interface School{
	public abstract  void display();
	
}
class Teacher implements School
{
	public void display()
	{
		System.out.println("I am Teacher in school.");
	}
}
class Student implements School
{
	public void display()
	{
		System.out.println("I am Student in school.");
	}
}
public class Student_TeacherDetails{

	public static void main(String[] args) {
		Student s=new Student();
		s.display();
		
		Teacher t=new Teacher();
		t.display();

	}

}
