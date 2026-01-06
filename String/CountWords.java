package String;


// count words in a sentence 


import java.util.*;

public class CountWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

        // Trim extra spaces and split by one or more spaces
        String[] words = str.trim().split("\\s+");       //   ----   \\s+ == Whether there is 1 space or 10 spaces → it will treat them as one.

        System.out.println("Number of words: " + words.length);
		

	}

}

