class MinStack {
    class Pair<T, M>{
        T top ;
        M min ;
        Pair(T top, M min){
            this.top = top;
            this.min = min;
        }
    }
    Stack <Pair <Integer, Integer> > s;
    public MinStack() {
        s = new Stack <>();
    }
    public void push(int value) {
        if(s.isEmpty()){
            s.push(new Pair<>(value, value));
        }
        else{
            int mini = Math.min(value, s.peek().min);
            s.push(new Pair<> (value, mini));
        }
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().top;
    }
    
    public int getMin() {
        return s.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */