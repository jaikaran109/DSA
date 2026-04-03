package String;

//Remove all spaces from a string.

import java.util.*;
public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		String str = input.nextLine();
		
		String res = str.replace(" ", "");
		
		System.out.print(res);

	}

}
