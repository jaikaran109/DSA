package Array;
import java.util.*;
public class LC_Q27 {
	
	static int removeElement(int[] nums,int val) {
		int n = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] != val) {
				nums[n] = nums[i];
				n++;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		int n = input.nextInt();
		System.out.print(removeElement(arr,n));

	}

}
