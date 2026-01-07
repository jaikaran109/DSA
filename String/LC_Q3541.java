
//3541. Find Most Frequent Vowel and Consonant
//
//Hint
//
//You are given a string s consisting of lowercase English letters ( 'a' to
//
//Your task is to:
//
//. Find the vowel (one of
//
//. Find the consonant (all other letters excluding vowels) with the maximum frequency.
//
//Return the sum of the two frequencies.
//
//Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of
//them. If there are no vowels or no consonants in the string, consider their frequency as 0.
//
//The frequency of a letter x is the number of times it occurs in the string.
//
//'u' ) with the maximum frequency.
//
//Example 1:
//
//Input: s = "successes"
//
//Output: 6
//
//Explanation:
//
//. The vowels are: (1u'
//
//. The consonants are:
//
//. The output is 2 + 4 = 6.
//
//'s'
//
//(frequency 4),
//
//(frequency 2). The maximum frequency is 4.
//
//(frequency 1), ('e' (frequency 2). The maximum frequency is 2.
//
//'c'
		

class Solution {
    public int maxFreqSum(String s) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'u' || s.charAt(i) == 'o' || s.charAt(i) == 'e' || s.charAt(i) == 'i'){
                ++arr1[s.charAt(i) - 'a'];
            }else{
                ++arr2[s.charAt(i) - 'a'];
            }
        }

        int max1 = 0;
        for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] > max1) {
            max1 = arr1[i];
            }
        }

        int max2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > max2) {
                max2 = arr2[i];
            }
        }
        return max1 + max2;
    }
}
