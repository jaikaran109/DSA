class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            } else if (c == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }
}







// class Solution {
//     public int maxDepth(String s) {
//         int count = 0;
//         int max = 0;
//         Stack<Character> st = new Stack<>();
//         for(char ch : s.toCharArray()){
//             if(ch == '('){
//                 count++;
//                 st.push(ch);
//                 max = Math.max(count,max);
//             }else if(ch == ')'){
//                 count--;
//             }
//         }
//         return max;
//     }
// }