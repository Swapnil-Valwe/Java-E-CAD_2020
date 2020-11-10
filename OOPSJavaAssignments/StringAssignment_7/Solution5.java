package StringAssignment_7;
import java.util.Scanner;
public class Solution5 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s=sc.nextLine(),s1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(s1.length()+" ");
			s1="";	
		}
			else
				s1=s1+s.charAt(i);
			
			}
	}
}
