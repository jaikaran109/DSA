package String;

public class SB_Basics {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		//Char at index 0
		System.out.println(sb.charAt(0));
		
		//set char at index 0
		sb.setCharAt(0,'P');
		System.out.println(sb);
		
		//insert char
		sb.insert(2,'n');
		System.out.println(sb);
		
		//delete the 'n'
		sb.delete(2,4);
		System.out.println(sb);
		
		
		
		//append
		StringBuilder sb1 = new StringBuilder("H");
		sb1.append("e");
		sb1.append("l");
		sb1.append("l");
		sb1.append("o");
		System.out.println(sb1);
	}

}
