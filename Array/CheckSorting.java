package Array;


//Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//       {3, 4, 6, 2} is not sorted in ascending order.


import java.util.*;
public class CheckSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		boolean isAscending = true;
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			if(arr[i] > arr[i+1])
				isAscending = false;
		}
		
		if(isAscending)
			System.out.print("The array is sorted in ascending order");
		else
			System.out.print("The array is not sorted in ascending order");
	}

}
