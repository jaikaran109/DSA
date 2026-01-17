package Array;
import java.util.*;
public class LC_Q344 {
	
	static void reverseString(char[] s) {
		for(int i = 0 ; i < s.length/2 ; i++) {
			int high = s.length - i - 1;
			char temp = s[i];
			s[i] = s[high];
			s[high] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char[] ch = new char[size];
		for(int i = 0 ; i < size ; i++) {
			ch[i] = input.next().charAt(0);
		}
		reverseString(ch);
		System.out.print(Arrays.toString(ch));
	}

}
