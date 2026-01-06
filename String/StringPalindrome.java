package String;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int n = str.length() - 1 ;
		boolean flag = true;
		for(int i = 0 ; i <= str.length() / 2 ; i++) {
			if(str.charAt(i) != (str.charAt(n - i))) {
				flag = false;
				break;
			}
		}
		if(flag == true) {
			System.out.print("Palindrome");
		}else {
			System.out.print("Not Palindrome");
		}
	}
}
