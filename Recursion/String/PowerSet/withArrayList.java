// Power set means all the subsets(subsequences)
// Ex : str = "abc"
// PowerSet = {"",a,b,c,ab,ac,bc,abc}

import java.util.*;
public class PowerSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        List<String> list = new ArrayList<>();
        subsets("", str, 0,list);
        System.out.println(list);
    }

    private static void subsets(String ans , String s , int idx , List<String> list){
        if(idx == s.length()) {
            if(ans.length() != 0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans + ch, s, idx +  1 , list); // pick
        subsets(ans, s, idx+1 , list); // skip
    }
}
