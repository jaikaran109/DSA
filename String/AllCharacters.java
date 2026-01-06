package String;

import java.util.*;

public class PrintAllCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		for(int i = 0 ; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

}
