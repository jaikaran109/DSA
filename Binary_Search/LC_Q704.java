package Binary_Search;
import java.util.*;
public class LC_Q704 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int target = input.nextInt();
		
		
		int[] arr = new int[size];
		for(int i = 0 ; i < size; i++) {
			arr[i] = input.nextInt();
		}
		
		//by binary search
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(arr[mid] == target)
				System.out.println(mid);
			else if(arr[mid] > target)
				high = mid - 1;
			else 
				low = mid + 1;
		}
		

	}

}
