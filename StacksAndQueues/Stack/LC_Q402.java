class Solution {
    public String removeKdigits(String num, int k) {
        if (k == num.length())
            return "0";
        Stack<Integer> st = new Stack<>();
        for (char ch : num.toCharArray()) {

            int x = ch - '0';
            while (!st.isEmpty() && st.peek() > x && k > 0) {
                st.pop();
                k--;
            }

            st.push(x);
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }
        while (ans.length() == num.length() || k > 0) {
        
                ans.deleteCharAt(ans.length() - 1);
                k--;
            }
        
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }

        return ans.toString();
    }
}
