package Binary_Search;

import java.util.*;
public class LC_Q744 {
	
	static char nextGreatestLetter(char[] letters , char target) {
		int low = 0 , high = letters.length - 1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(letters[mid] > target) high = mid - 1;
			else low = mid + 1;
		}
		return letters[low % letters.length];  // samjho non decreasing me sorted h agr koi letter nhi exist krta h to low = letters.length hoga to agr hm same number
												// ka modulo same number se lenge to 0th index return ho jayega
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		char[] arr = new char[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.next().charAt(0);
		}
		char x  = input.next().charAt(0);
		char ans = nextGreatestLetter(arr,x);
		System.out.print(ans);
	}

}






//						L E E T C O D E
//class Solution {
//    public char nextGreatestLetter(char[] letters, char target) {
//
//        if(target >= letters[letters.length - 1]) return letters[0];
//
//        int low = 0 , high = letters.length - 1;
//        while(low <= high){
//            int mid = low + (high - low)/2;
//            if(letters[mid] > target) high = mid - 1;
//            else low = mid + 1;
//        }
//        return letters[low];
//        // return letters[low%letters.length] -- remove the 4th line 
//    }
//}
