package Methods;


//Write a function that counts digits in a number.


import java.util.*;
public class CountDigits {
	
	static int digits(int n) {
		int count = 0;
		while(n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.print(digits(x));

	}

}
