package String;


//Input a string from the user. Create a new string called 'result' in which you
//will replace the letter 'e' in the original string with letter 'i'.
//
//Example :
//
//original = "eabcdef' ; result = "iabcdif"
//
//Original = "xyz" ; result = "xyz"


import java.util.*;
public class SB_ReplaceLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == 'e') {
				sb.append('i');
			}else {
				sb.append(str.charAt(i));
			}
		}
		
		System.out.print(sb.toString());

	}

}
