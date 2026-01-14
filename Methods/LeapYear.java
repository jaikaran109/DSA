package Methods;


//Write a function to check whether a year is leap year.


import java.util.*;
public class LeapYear {
	static boolean LY(int n) {
		if((n % 100 != 0 && n % 4 == 0) || n % 400 == 0) return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print(LY(year));
	}

}
