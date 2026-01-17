package Array;


//Count even and odd numbers in an array


import java.util.*;
public class EvenOdd {
	
	static void count(int[] nums) {
		int oddCount = 0;
		int evenCount = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] % 2 == 0) evenCount++;
			else oddCount++;
		}
		System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		count(arr);
	}

}
