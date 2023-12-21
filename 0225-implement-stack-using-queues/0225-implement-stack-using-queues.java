class MyStack {

    private ArrayList<Integer> queue;
    int high = -1;

    public MyStack() {
        queue = new ArrayList<>();    
    }
    
    public void push(int x) {
        queue.add(x);
        high++;
    }
    
    public int pop() {
        if(high == -1) return 0;

        int num = queue.get(high);
        queue.remove(high--);
        return num;
    }
    
    public int top() {
        if(high == -1) return 0;
        
        return queue.get(high);
    }
    
    public boolean empty() {
        return high == -1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
