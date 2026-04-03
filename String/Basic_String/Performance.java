package String;

public class Performance {

	public static void main(String[] args) {
		
		
//		String series = "";      // -- new object created
//		for(int i = 0 ; i  < 25 ; i++) {
//			 char ch = (char)('a' + i);
//			 series += ch;
//		}
//		System.out.println(series);
//		// Time Complexity = O(N2)
//		// 1 + 2 + 3 + 4 + 5 ........+N = N(N+1)/2
		
		
		
		
		StringBuilder str = new StringBuilder();  // -- mutable
		for(int i = 0 ; i < 26 ; i++) {
			char ch = (char)('a' + i);
			str.append(ch);
		}
		System.out.println(str);
		// Time Complexity = O(N)
		
		System.out.println(str.deleteCharAt(0));
		
		System.out.println(str.reverse());
	}

}


