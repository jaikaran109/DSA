class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        Stack<Integer> temp = new Stack<>();

        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}
