class MyQueue {

    ArrayList<Integer> stackPush;
    int stackPushTop = -1;
    ArrayList<Integer> stackPop;
    int stackPopTop = -1;

    public MyQueue() {
        stackPush = new ArrayList<>();
        stackPop = new ArrayList<>();
    }
    
    public void push(int x) {
        while(stackPopTop >= 0){
            stackPush.add(stackPop.get(stackPopTop));
            stackPushTop++;
            stackPop.remove(stackPopTop--);
        }

        stackPush.add(x);
        stackPushTop++;

        while(stackPushTop >= 0){
            stackPop.add(stackPush.get(stackPushTop));
            stackPopTop++;
            stackPush.remove(stackPushTop--);
        }
    }
    
    public int pop() {
        if(stackPopTop == -1) return 0;

        int num = stackPop.get(stackPopTop);
        stackPop.remove(stackPopTop--);

        return num;
    }
    
    public int peek() {
        if(stackPopTop == -1) return 0;
        return stackPop.get(stackPopTop);
    }
    
    public boolean empty() {
        return stackPopTop == -1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */