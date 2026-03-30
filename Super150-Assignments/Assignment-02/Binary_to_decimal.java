package Number_System;


//BinaryToDecimal


import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int binary_num = sc.nextInt();
		int pow = 1;
		int ans = 0;
		while(binary_num > 0) {
			int rem = binary_num % 10;
			ans +=(rem*pow);
			binary_num /= 10;
			pow *= 2;
		}
		System.out.println(ans);

	}

}
