package Array;
import java.util.*;
public class LC_Q81 {
	
	static boolean search(int[] nums , int target) {
		for(int i = 0 ; i < nums.length ; i++) {
			if(target == nums[i]) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt(); 
		}
		int x = input.nextInt();
		System.out.print(search(arr,x));

	}

}
