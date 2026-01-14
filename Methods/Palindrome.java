package Methods;


//Write a function to check if a number is palindrome.


import java.util.*;
public class Palindrome {

	static boolean palin(int x) {
		int y = x;
		int ans = 0;
		while(y > 0) {
			ans = ans * 10 + y % 10;
			y /= 10;
		}
		if(x == ans) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(palin(n));
	}

}
