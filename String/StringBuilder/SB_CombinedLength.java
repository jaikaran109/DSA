package String;


//Take an array of Strings input from the user & find the cumulative (combined)
//length of all those strings.



import java.util.*;
public class SB_CombineLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		String[] str = new String[size];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < size ; i++) {
			str[i] = input.next();
			sb.append(str[i]);
		}
		
		System.out.print(sb.length());

	}

}
