package String;

import java.util.*;

public class countVowel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str =input.next();
		int count = 0 ;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == 'a'  ||str.charAt(i) ==  'e' ||str.charAt(i) ==  'i' ||str.charAt(i) ==  'o' ||str.charAt(i) ==  'u') {
				count++;
			}
		}
		System.out.print(count);

	}

}
