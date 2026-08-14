// Power set means all the subsets(subsequences)
// Ex : str = "abc"
// PowerSet = {"",a,b,c,ab,ac,bc,abc}

import java.util.*;
public class PowerSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        subsets("", str, 0);
    }

    private static void subsets(String ans , String s , int idx){
        if(idx == s.length()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans + ch, s, idx + 1); // pick
        subsets(ans, s, idx+1); // skip
    }
}
