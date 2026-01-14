package Methods;


// Arm Strong NUmber


import java.util.*;
public class Armstrong {
	
	
	static boolean calc(int a) {
		
		int count = 0;
		int temp = a;
		
		
		while(temp > 0) {
			count++;
			temp /= 10;
		}
		
		temp = a;
		int ans = 0;
		
		for(int i = 1 ; i <= count ; i++) {
			ans += (int)Math.pow(temp % 10, count);
			temp /= 10;
		}
		return a == ans;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(calc(n));
	}

}
