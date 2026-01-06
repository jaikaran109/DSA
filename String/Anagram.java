package String;


//check Anagram


import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		int[] arr1 = new int[26];
		int[] arr2 = new int[26];
		
		if(str1.length() != str2.length()) {
			System.out.print("Not Anagram");
			return;
		}
		
		for(int i = 0 ; i < str1.length(); i++) {
			++arr1[str1.charAt(i) - 'a'];
			++arr2[str2.charAt(i) - 'a'];
		}
		
		
		for(int i = 0 ; i < 26 ; i++) {
			if(arr1[i] != arr2[i]) {
				System.out.print("Not Anagram");
				return;
			}
		}
		
		
		System.out.print("Anagram");

	}

}
