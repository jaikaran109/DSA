package Exam_4thSem;


//You are given a 0-indexed array of string words and two integers left
//and right.
//A string is called a vowel string if it starts with a vowel character
//and ends with a vowel character where vowel characters are 'a', 'e',
//        'i', 'o', and 'u'.
//
//Return the number of vowel strings words[i] where i belongs to the
//inclusive range [left, right].
//Example 1:
//Input: words = ["are", "amy", "u"], left = 0, right = 2
//Output: 2
//Explanation:
//        - "are" is a vowel string because it starts with 'a' and ends with
//e'.
//
//        - "amy" is not a vowel string because it does not end with a vowel.
//- "u" is a vowel string because it starts with 'u' and ends with 'u'.
//The number of vowel strings in the mentioned range is 2.
//Example 2:
//Input: words = ["hey", "aeo", "mu", "ooo", "artro"], left = 1, right = 4
//Output: 3
//Explanation:
//        - "aeo" is a vowel string because it starts with 'a' and ends with
//'o'.
//        - "mu" is not a vowel string because it does not start with a vowel.
//- "ooo" is a vowel string because it starts with 'o' and ends with
//'o'.
//        - "artro" is a vowel string because it starts with 'a' and ends with
//
//The number of vowel strings in the mentioned range is 3.
//Constraints:
//
//        1 <= words. length <= 1000
//        1 <= words[i].length <= 10
//        words[i] consists of only lowercase English letters.
//        0 <= left <= right < words. length.



import java.util.*;
public class CountVowelStrings {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int count = 0;
        String[] str = new String[size];
        for(int i =0 ; i < size ; i++){
            str[i] = input.next();
        }
        int left = input.nextInt();
        int right = input.nextInt();
        for(int i = left ; i <= right ; i++){
            int n = str[i].length() - 1;
            if((str[i].charAt(0) == 'a' || str[i].charAt(0) == 'e' || str[i].charAt(0) == 'i' || str[i].charAt(0) == 'o' || str[i].charAt(0) == 'u' || str[i].charAt(0) == 'A' ||str[i].charAt(0) == 'E' || str[i].charAt(0) == 'O' || str[i].charAt(0) == 'I' || str[i].charAt(0) == 'U')
                    &&
                    (str[i].charAt(n) == 'a' || str[i].charAt(n) == 'e' || str[i].charAt(n) == 'i' || str[i].charAt(n) == 'o' || str[i].charAt(n) == 'u' || str[i].charAt(n) == 'A' ||str[i].charAt(n) == 'E' || str[i].charAt(n) == 'O' || str[i].charAt(n) == 'I' || str[i].charAt(n) == 'U')) count++;
        }
        System.out.println(count);
    }
}


//Time Complexity: O(n * m)
