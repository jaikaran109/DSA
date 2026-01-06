package String;

import java.util.*;
public class LC_Q3760 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		boolean[] x = new boolean[26];
		int count = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if(!x[str.charAt(i) - 'a']) {
				count++;
				x[str.charAt(i) - 'a'] = true;;
			}
		}
		System.out.print(count);

	}

}
