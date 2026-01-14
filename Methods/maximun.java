package Methods;


//Write a function to find the maximum of two numbers


import java.util.*;
public class maximun {
	
	static int Max(int x , int y) {
		if(x >= y) return x;
		else return y;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.print(Max(a,b));

	}

}
