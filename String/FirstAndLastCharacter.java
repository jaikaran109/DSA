package String;
import java.util.*;
public class FirstAndLastChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.print(str.charAt(0));
		System.out.print(str.charAt(str.length() - 1));

	}

}
