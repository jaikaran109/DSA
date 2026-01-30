package Conditionals;


//Factorial Program In Java


import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int ans = 1;
		while(n > 0) {
			ans *= n;
			n--;
		}
		System.out.print(ans);

	}

}
