package Conditionals;


// Armstrong Number In Java


import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = n;
		int count = 0;
		while(x > 0) {
			count++;
			x /= 10;
		}
		x = n;
		int arm = 0;
		while(x > 0) {
			arm += (int)Math.pow(x % 10, count);
			x /= 10;
		}
		if(arm == n) System.out.print("Armstrong");
		else System.out.print("Not Armstrong");
	}

}
