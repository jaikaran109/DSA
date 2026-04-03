package Exam_4thSem;


//A phrase is a palindrome if, after converting all uppercase letters
//into lowercase letters and removing all non-alphanumeric characters,
//it reads the same forward and backward. Alphanumeric characters
//include letters and numbers.
//Given a string s, return true if it is a palindrome, or false
//otherwise.
//
//        Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//Input: s = "race a car"
//Output: false
//
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric
//characters.
//
//Since an empty string reads the same forward and backward, it is a
//palindrome.


import java.util.*;
public class ValidPalindrome {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String ans = str.toLowerCase().replaceAll("[^a-z0-9]","");

        for(int i = 0 ; i < ans.length() / 2 ; i++){
            if(ans.charAt(i) != ans.charAt(ans.length() - i -1)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}



// TC : O(n)
