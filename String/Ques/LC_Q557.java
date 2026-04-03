class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < words.length ; i++){
            StringBuilder ans = new StringBuilder(words[i]);
            res.append(ans.reverse());
            if(i < words.length - 1) res.append(" ");
        }
        return res.toString();
    }
}


// String[] words =  s.split(" ");
//         String[] ans = new String[words.length];
//         for(int i = 0 ; i < words.length ; i++){
//             ans[i] = "";
//             for(int j = words[i].length() - 1 ; j >= 0 ; j--){
//                 ans[i] += words[i].charAt(j);
//             }
//         }
//         String res = "";
//         for(int i = 0 ; i < ans.length ; i++){
//             res = res + ans[i];
//             if(i < ans.length - 1) res += " ";
//         }
//         return res;
