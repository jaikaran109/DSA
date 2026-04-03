package String;

//count freq of a specific character

import java.util.*;

public class checkFrequency {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		char ch = input.next().charAt(0);
		int count = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.print(count);

	}

}
