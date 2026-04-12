//Given a string of balanced expression s, check if it contains a redundant parenthesis or not. A set of parenthesis
//are redundant if the same sub-expression is surrounded by unnecessary or multiple brackets.
//Note: Expression may contain +,-, *, and / operators. Given expression is valid and there are no white spaces
//present.
//
//        Examples:
//
//Input: s = "((a+b))"
//Output: true
//Explanation: ((a+b)) can reduced to (a+b).
//
//Input: s = "(a+(b)/c)"
//Output: true
//Explanation: (a+(b)/c) can reduced to (a+b/c) because b is surrounded by () which is redundant.
//
//        Input: s = "(a+b+(c+d))"
//Output: false
//Explanation:(a+b+(c+d)) doesn't have any redundant or multiple brackets.
//
//Constraints:
//        1<|s| ≤105





class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '+' || c == '-' || c == '*' || c == '/') {
                stack.push(c);
            } else if (c == ')') {
                boolean hasOperator = false;
                while (stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }
                if (!hasOperator) return true;
                stack.pop(); // Remove '('
            }
        }
        return false;
    }
}
