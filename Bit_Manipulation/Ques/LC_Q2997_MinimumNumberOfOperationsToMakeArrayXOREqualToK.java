class Solution {
    public int minOperations(int[] nums, int k) {
        int xorOfAll = 0;
        for(int i = 0 ; i < nums.length ; i++){
            xorOfAll ^= nums[i];
        }

        int xorWithK = xorOfAll ^ k;
        int flips = 0;
        while(xorWithK != 0){
            if((xorWithK & 1) == 1) flips++;
            xorWithK >>= 1;
        }
        return flips;
    }
}


// Dekho isme tm sare numbers ka xor nikal lo and then check kro ki K and allxors ke set bits me diff diff places pe kitna diff aa rha means xorOfAll = 5 nd k = 2 then the diff is 3 soo we ve to flip 3 bits 

// ab isi kaam ko krne ka easy tarika tm sare jo xor the usko K ke saath bhi xor kr do jisse finalXOR me jisne set bit honge unka count hmara ans hoga bcz jb tm xorOfAll ka K ke saath kroge to bss diff bits means jinko flip krna tha vo hi set honge to unko count krne se hmko ans mil jayega 
