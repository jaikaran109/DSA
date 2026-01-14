package Methods;


//Write a function that reverses a number.


import java.util.*;
public class reverse {
	static int reverseNumber(int n) {
		int ans = 0 ;
		while(n > 0) {
			ans = ans * 10 + n % 10;
			n /= 10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.print(reverseNumber(x));

	}

}
