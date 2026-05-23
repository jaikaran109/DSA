class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        StringBuilder ans = new StringBuilder();
        boolean flag = true;
        if(num < 0) flag = false;
        if(num < 0){
            num *= -1;
        }
        while(num != 0){
            int rem = num % 7;
            num /= 7;
            ans.append(rem);
        }
        if(!flag){
            ans.append("-");
        }
        return ans.reverse().toString();
    }
}
