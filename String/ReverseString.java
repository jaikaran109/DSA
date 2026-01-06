package String;

// Reverse String without using reverse()

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		StringBuilder gtr = new StringBuilder();
		
		String str = input.nextLine();
		
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
			gtr.append(str.charAt(i));
		}
		
		System.out.print(gtr.toString());
	}

}
