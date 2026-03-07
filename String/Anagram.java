package Exam_4thSem;


//Given two strings s and t, return true if t is an anagram of s, and
//false otherwise.
//        Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//Input: s = "rat", t = "car"
//Output: false
//Constraints:
//        1 <= s.length, t.length <= 5 * 104
//        s and t consist of lowercase English letters.


import java.util.*;
public class anagram {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        if(s.length() != t.length()){
            System.out.println("Naaaaaaaahhhhhhhh");
            return;
        }
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int num : arr){
            if(num != 0){
                System.out.println("Naaaaaaaahhhhhhhh");
                return;
            }
        }
        System.out.println("Yeaaaaaaaahhhhhhhhhhhh");
    }
}


// Time Complexity : O(n)

