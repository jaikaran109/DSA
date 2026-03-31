package Recursion;


// print factorial of a Number N


import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 1;
		int i = 1;
		fact(i,n,ans);

	}
	public static void fact(int i ,int n , int ans) {
		if(i == n) {
			ans *= i;
			System.out.print(ans);	 
			return;
		}
		ans *= i;
		fact(i+1,n,ans);
	}

}
