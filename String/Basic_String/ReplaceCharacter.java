package String;

// replace a with @

import  java.util.*;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String  str = input.nextLine();
		String result = str.replace('a', '@').replace('A', '@');
		System.out.print(result);

	}

}
