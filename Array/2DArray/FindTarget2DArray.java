package Array;


//take array input


import java.util.*;
public class findTarget2DArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int cols = input.nextInt();
		int[][] arr = new int[rows][cols];
		
		//input
		//rows
		for(int i = 0 ; i < rows ; i++) {
			//columns
			for(int j = 0 ; j < cols ; j++) {
				arr[i][j] = input.nextInt();
			}		
		}
		int target= input.nextInt();		
		
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < cols ; j++) {
				
			
				if(target == arr[i][j]) {
					System.out.print(arr[i][j]+" ");
					System.out.print(i+" "+j);
					break;
				}
			}
		}
//		else {
//			System.out.print("Not Found");
//			break;
//		}

	}

}
