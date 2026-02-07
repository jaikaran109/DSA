class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        int n = command.length();
        for (int i = 0; i < n; i++) {
            char ch = command.charAt(i);
            if (ch == 'G') {
                ans.append('G');
            }
            else if (ch == '(') {
                if (i + 1 < n && command.charAt(i + 1) == ')') {
                    ans.append('o');
                    i++;
                }
                else {
                    ans.append("al");
                    i += 3;
                }
            }
        }
        return ans.toString();
    }
}
