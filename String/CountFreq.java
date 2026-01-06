package String;


//Count Frequency of Each Character


import java.util.*;
public class CountFreq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str =  input.next();   //input
		
		boolean[] visited = new boolean[str.length()];  // visited array ye array track krta h konsa already count ho gya h
										// initially sare false h
		
		for(int i = 0 ; i < str.length() ; i++) { 
			if(visited[i])   //already h to skip kr dega
				continue;
			
			int count = 0;
			
			for(int j = i+1 ; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					visited[j] = true;
					count++;
				}
				
			}
		}
		
			

	}

}
