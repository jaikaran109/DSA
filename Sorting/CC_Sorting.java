package Sorting;
import java.util.*;
public class CC_sorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr =new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		 int i = 0;
	        while (i < size) {
	            int correctIndex = arr[i] - 1;

	            if(arr[i] != arr[correctIndex]) { 
	            	int temp = arr[correctIndex]; 
	            	arr[correctIndex] = arr[i]; 
	            	arr[i] = temp; 
	            	}else {
	                i++;
	            }
	        }
		System.out.print(Arrays.toString(arr));

	}

}
