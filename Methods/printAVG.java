package Methods;


//Enter 3 Numbers from the user & make a function to print their average


import java.util.*;
public class printAVG {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		calculateAVG(a,b,c);

	}
	public static void calculateAVG(int n1 , int n2 , int n3) {
		int avg = (n1+n2+n3)/3;
		System.out.print(avg);
	}

}

