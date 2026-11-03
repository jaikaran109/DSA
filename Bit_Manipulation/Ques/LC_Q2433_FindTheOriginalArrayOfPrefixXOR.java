class Solution {
    public int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        int prev = 0;
        ans[0] = pref[0];
        for(int i = 1 ; i < pref.length ; i++){
            ans[i] = pref[i] ^ pref[i-1];
        }
        return ans;
    }
}



//  a ^ b = c then a ^ c = b and b ^ c = a.
// dekho uper wala soln by mistake tukka lg gya although implementation and logic is simple 

// for 5 - 5 is ans
// for 2 - pref[2] ^ pref[i-1] means 2 xor 5 , koi bhi number ka xor means c uske aur last wale number ka xor hota h
// for 0 - 0 ^ 2
// for 3 - 3 ^ 0
// for 1 - 1 ^ 3
