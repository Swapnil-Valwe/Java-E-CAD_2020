package Interface_Inheritance_Assignment_6;
interface Company{
	public abstract  void payment();
	
}
class Employees{
	String emp_name="Jack";
	void print()
	{
		System.out.println("I am an Employee..");
	}
}

class Salary extends Employees implements Company{
	String emp_salary="50000";
	public void payment()
	{
		System.out.println("My salary is recieved...Thank you!!");
	}
}

public class SalaryDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s= new Salary();
		System.out.println(s.emp_name);
		s.print();
		System.out.println(s.emp_salary);
		s.payment();

	}

}
