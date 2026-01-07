package Array;



//Find the maximum & minimum number in an array of integers.


import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MINMinMax.java_VALUE;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("Largest number is : " + max);
	    System.out.println("Smallest number is : " + min);


	}

}
