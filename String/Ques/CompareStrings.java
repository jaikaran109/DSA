package String;



import java.util.*;
public class CompareStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		String b = input.next();
		
		if(a.equals(b))
			System.out.println("They are the same String");
		else
			System.out.println("They are different String");
			
	}

}
