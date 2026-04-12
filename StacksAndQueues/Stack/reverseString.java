package Assessment_05;
import java.util.*;
public class reverseString {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            st.push(str.charAt(i));
        }
        String ans = "";
        while(!st.isEmpty()){
            ans += st.pop();
        }
        System.out.println(ans);
    }
}
