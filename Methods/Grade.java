package Methods;


//Write a function that returns the grade based on marks.


import java.util.*;
public class Grade {
	static String status(int x) {
		if(x <= 25) return "Grade D";
		else if(x <= 45) return "Grade C";
		else if(x <= 75) return "Grade B";
		else return "Grade A";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int marks = input.nextInt();
		System.out.print(status(marks));

	}

}
