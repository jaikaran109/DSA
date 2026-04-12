class Solution {
    public int calPoints(String[] oper) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < oper.length ; i++){
            switch(oper[i]){
                case "+":
                    int n1 = stack.pop() , n2 = stack.peek();
                    stack.push(n1);
                    stack.push(n1+n2);
                    break;

                case "C" :
                    stack.pop();
                    break;

                case "D" :
                    stack.push(2*stack.peek());
                    break;

                default :
                    stack.push(Integer.parseInt(oper[i]));

            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum ;
    }
}