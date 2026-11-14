class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if(nums.length == 1 || nums.length == 2 ) return nums.length;

        int ans = 1;
        while(ans <= nums.length){
            ans *= 2;
        }
        return ans;
    }
}



// in ps - permutation means 1 se n tk hi hoga and here n is the last number nd lasrgest of nums


// isme trick h 
// sare cases me next 2^n hi ans hooga

// Note :- next 2n is the number greater than the last num , means max of Array

// LOGIC
// suppose 3 numbers h -- > ans - 2^3
// to XOR ke case me kbhi bhi extra bit nhi create hoti means if number 1 to 5 h to ye sari values 3 bit me represent ho skti h 
// to ab to 1 se lekr 5 tk kitne bhi diff combinations try kr loge to bhi jo ans h vo max 3 bit me hi rhegi
// like 1 2 4 ka xor loge to 7 aa jayega jo 3 bit me max number h , 1 4 5 kroge to 0 aa jayega jo min number h 3 bit me 
// aise hi tm min value means 0 se lekr max of nums tk ke sare values generate kr skte ho 
// Soo , jo max possible unique xor aa skte h vo next 2^n tk hi aa skte h 
