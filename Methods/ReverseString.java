package Methods;


//Write a recursive function to reverse a string.


import java.util.*;
public class ReverseString {
	
	static String reverse(String str) {
	    if (str.length() == 0)
	        return str;
	    return reverse(str.substring(1)) + str.charAt(0);     //String ka first character hata deta hai --   "abcd".substring(1) → "bcd"
 
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String gtr = input.next(); 
		System.out.print(reverse(gtr));

	}

}
