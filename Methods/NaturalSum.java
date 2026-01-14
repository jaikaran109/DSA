package Methods;


//Write a recursive function to find sum of first n natural numbers.


import java.util.*;
public class NaturalSum {
	static int sum(int n) {
	    
	    if (n == 0)
	        return 0;

	    return n + sum(n - 1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.print(sum(x));
	}

}
