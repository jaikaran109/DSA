package String;


// Check Sentence is Palindromic or not 


import java.util.*;
public class PalindromicSentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toLowerCase();
		str = str.replaceAll("[^a-z0-9]", ""); // ye lowercase aur digits ke aalava sb replace kr dega "" se  
		String gtr = "";
		for(int i = str.length() - 1 ; i >= 0; i--) {
			gtr += str.charAt(i);
		}
		if(gtr.equals(str))
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}
