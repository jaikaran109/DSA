package Methods;

//Print a given name in a function

import java.util.*;
public class PrintName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		printMyName(name);          //Calling

	}
	
	public static void printMyName(String name) {
		System.out.print(name);
		return ;
	}

}
