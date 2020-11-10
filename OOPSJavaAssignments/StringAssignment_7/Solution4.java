package StringAssignment_7;
import java.util.*;
public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();//,s1="";
		char ch[] = s.toCharArray();
		int j, i, l = ch.length, c = 0;
		for (i = 0; i < l; i++) {
			for (j = 0; j < l; j++) {
				if (ch[i] == ch[j])
					c++;
			}
			if (c == 1) {
			//	s1=s1+ch[i];
				System.out.println(ch[i]);
			break;

			}

			c = 0;
		}
		System.out.println("No single char found");
	}
}
