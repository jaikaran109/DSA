package String;

import java.util.*;

public class containsCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		char ch = input.next().charAt(0);
		if(str.indexOf(ch) != -1) {  // if not present then it returns -1
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}

	}

}
