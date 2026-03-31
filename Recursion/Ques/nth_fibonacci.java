package Recursion;


// Find Nth fibonacci number


import java.util.*; 
public class nth_fibonacci {

	static int fibo(int n) {
		
		if(n < 2) return n;
		
		return fibo(n - 1) + fibo(n - 2);
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(fibo(n));

	}

}
