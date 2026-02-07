package String;

public class Operators {

	public static void main(String[] args) {
		System.out.println('a' + 'b');  // -- give sum of ASCII values
		System.out.println("a" + "b");  // -- ab 
		System.out.println((char)('a'+   3)); // -- d - ASCII value of a + 3 = d

		System.out.println("a" +1);
		// this is same as after a few steps: "a" + "1"
		// integer will be converted to Integer that will call toString()

	}
	 
}
