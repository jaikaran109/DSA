class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int len = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
}



// class Solution {
//     public int lengthOfLastWord(String s) {
//         s = s.trim();   
//         String[] words = s.split(" ");
//         return words[words.length - 1].length();
//     }
// }
