// Number of Steps to Reduce a Number to Zero

class Solution {
    public int numberOfSteps(int num) {
        return helper(num , 0);
    }
    private int helper(int num , int c){
        if(num == 0) return c;
        if(num % 2 == 0) return helper(num / 2 , ++c);
        return helper(num - 1 , ++c);  // c++ mt krna kyuki isme func call ho rha h to baar baar c me 0 pass hoga 
    }
}
