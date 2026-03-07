package Exam_4thSem;


//Write a function to find the longest common prefix string amongst an
//array of strings.
//If there is no common prefix, return an empty string "".
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//Input: strs = ["dog", "racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//        Constraints:
//
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters if it is non-empty.


import java.util.*;
public class CommonPrefix {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String[] arr = new String[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = input.next();
        }
        String result = getLongestCommonPrefix(arr);

        if (result.isEmpty()) {
            System.out.println("Khali hai bhai");
        } else {
            System.out.println( result);
        }
    }
    private static String getLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;

        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
}



// TC : O(n*m)
