package Methods;


//Write a function to print all prime numbers from 1 to n.


import java.util.*;
public class alllPrime {
	static void primes(int n) {
		if(n < 2) {
			System.out.print("Invalid Number");
			return ;
		}
		else{
			for(int i = 2 ; i <= n ; i++) {
				boolean flag = false;
				for(int j = 2 ; j*j <= i ; j++) {
					if(i % j == 0) {
						flag = true;
						break;
					}
				}
				if(!flag) System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		primes(x);
	}

}
