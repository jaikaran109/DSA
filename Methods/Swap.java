package Methods;


// Swap using functions


import java.util.*;
public class swap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println(x+" "+y); // values are passed by value so any changes does not affect original value
		
		
		

		//Code to change
		int[] arr = {x,y};
		
		swapp(x,y,arr);
	}
	static void swapp(int a , int b , int[] arr1) {
		int c = a; // passed by value
		a = b;
		b = c;
		// this changes will only be valid in this function scope only
		System.out.println(a+" "+b);
		
		
		
		// code
		int temp = arr1[0];  // passed by reference
		arr1[0] = arr1[1];
		arr1[1] = temp;
		System.out.println(arr1[0] + " " + arr1[1]);
	}
	
	
	
	
	
	
	

}
