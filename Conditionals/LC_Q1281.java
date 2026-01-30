package Conditionals;
import java.util.*;
public class LC_Q1281 {
	
	static int substractProductAndSum(int x) {
		int a = x;
		int mul = 1;
		int sum = 0;
		while(a > 0) {
			mul *= a % 10;
			sum += a % 10;
			a /= 10;
		}
		return mul - sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(substractProductAndSum(n));

	}

}


//        L E E T C O D E       S O L U T I O N
//class Solution {
//    public int subtractProductAndSum(int n) {
//        int x = n;
//        int mul = 1;
//        int sum = 0;
//        while(x > 0){
//            mul *= x % 10;
//            sum += x % 10;
//            x /= 10;
//        }
//        return mul - sum;
//    }
//}
