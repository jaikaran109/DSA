package Pattern;

//* * * * 
//* * * 
//* * 
//* 


import java.util.*;
public class DownwardPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = n ; i > 0 ; i--) {
			for(int j = i ; j > 0 ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
