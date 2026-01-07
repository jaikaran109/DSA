package Array;


//take array input


import java.util.*;
public class findTarget {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int target = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		
		for(int i = 0 ; i < size ; i++) {
			if(target == arr[i]) {
				System.out.print(arr[i]+" ");
				break;
			}
			else {
				System.out.print("Not Found");
				break;
			}
		}

	}

}
