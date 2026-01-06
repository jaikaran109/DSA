package String;


//Count the number of uppercase, lowercase, digits, 
//and special characters.

import java.util.*;
public class countDiffCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int upper = 0;
		int lower = 0;
		int special = 0 , digit = 0;
		
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			if ( ch >= 'A' && ch <= 'Z') upper++;
			else if(ch >= 'a' && ch <= 'z') lower++;
			else if(ch >= '0' && ch <= '9') digit++;
			else special++;
		}
		System.out.println(upper);
		System.out.println(digit);
		System.out.println(special);
		System.out.println(lower);
	}
}
