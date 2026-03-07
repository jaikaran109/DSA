package Exam_4thSem;


//Given an input string s, reverse the order of the words.
//A word is defined as a sequence of non-space characters. The words in
//s will be separated by at least one space.
//Return a string of the words in reverse order concatenated by a single
//space.
//
//Note that s may contain leading or trailing spaces or multiple spaces
//between two words. The returned string should only have a single space
//separating the words. Do not include any extra spaces.
//Example 1:
//Input: s = "the sky is blue"
//Output: "blue is sky the"
//Example 2:
//Input: s = " hello world "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or
//trailing spaces.
//Example 3:
//Input: s = "a good example"
//
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a
//single space in the reversed string.
//Constraints:
//        1 <= s.length <= 104
//s contains English letters (upper-case and lower-case), digits, and
//spaces ' ' .


import java.util.*;
public class reverseWord {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] arr = str.trim().split("\\s+");
        String ans = "";
        for(int i = 0 ; i < arr.length / 2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(i == arr.length - 1) ans += arr[i];
            else ans += arr[i] + " ";
        }
        System.out.println(ans);
    }
}


//Time Complexity ( O(n) )
//Space Complexity ( O(n) )



//String[] arr = str.trim().split("\\s+");
//StringBuilder ans = new StringBuilder();
//for (int i = arr.length - 1; i >= 0; i--) {
//        ans.append(arr[i]);
//        if (i != 0) ans.append(" "); // Aakhri word ke baad space nahi chahiye
// }
// return ans.toString();
