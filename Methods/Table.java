package Methods;


// write a function to print table of N


import java.util.*;
public class Table {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		calculateTable(n);
	}
	public static void calculateTable(int a) {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(a + " * "+ i +" = " +a*i);
		}
		return;
	}

}
