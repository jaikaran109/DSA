class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < temp.length; i++){
            while(!st.isEmpty() && temp[st.peek()] < temp[i]){
                res[st.peek()] = i - st.pop();
            }
            st.push(i);
        }
        
        return res;



        // int[] res = new int[temp.length];
        // for(int i = 0 ; i < temp.length ; i++){
        //     res[i] = 0;
        //     for(int j = i + 1 ; j < temp.length ; j++){
        //         if(temp[j] > temp[i]){
        //             res[i] = j - i;
        //             break;
        //         }
        //     }
        // }
        // return res;
    }
}