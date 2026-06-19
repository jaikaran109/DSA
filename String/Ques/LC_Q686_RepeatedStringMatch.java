class Solution {
    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int ans = 0;

        while(sb.length() < b.length()){
            sb.append(a);
            ans++;
        }

        if(sb.toString().contains(b))
            return ans;

        sb.append(a);

        if(sb.toString().contains(b))   // if size same ho jaye to while loop break ho jayega phir hm ek aur add krenge 
            return ans + 1;             // eg. sb = "abcd"      ans = 1     sb.length() = 8
                                        // sb = "abcdabcd"  ans = 2          b.length()  = 8 loop breaks
                                        // "abcdabcd".contains("cdabcdab") -- false , to ab yha ek aur append krenge

        return -1;
    }
}
