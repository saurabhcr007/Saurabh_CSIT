class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
// We basically use 2 stacks for this problem, input stack for storing the values given to us, and output for storing those values in FIFO way
    public MyQueue() {
        // No need to change anything in this method
    }
    
    public void push(int x) {
        // We will just push the value into the input stack
        input.push(x);
    }
    
    public int pop() {
        // If we have still not shifted values from input stack
        if(output.isEmpty()){
            shiftStacks();
        }
        // call the stack.pop() function
        return output.pop();
    }
    
    public int peek() {
        // If we have still not shifted values from input stack
        if(output.isEmpty()){
            shiftStacks();
        }
        // call the stack.peek() function
        return output.peek();
    }
    
    public boolean empty() {
        // If both the stacks are empty, that would mean there is no value there ofc
        return input.isEmpty() && output.isEmpty();
    }
    // This function shifts the values inside the output stack in FIFO manner
    public void shiftStacks(){
        while(!input.isEmpty()){
            output.push(input.pop());
        }
    }
}