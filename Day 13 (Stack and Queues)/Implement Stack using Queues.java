class MyStack {
      Queue<Integer> q1;
      Queue<Integer> q2; 

    /** Initialize your data structure here. */
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>(); 
        
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(q1.isEmpty()){
            q1.add(x);
        }
        else{
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(x);
        }
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
      if(!q1.isEmpty())  
       return q1.remove();
      else{
         while(q2.size()>1) 
          q1.add(q2.remove());
         Queue<Integer> temp=q1; 
          q1=q2; 
          q2=temp; 
          
      }  
        return q1.remove(); 
    }
    
    /** Get the top element. */
    public int top() {
       if(!q1.isEmpty()) 
        return q1.peek();
       else{
           while(q2.size()>1) 
           q1.add(q2.remove());
         Queue<Integer> temp=q1; 
          q1=q2; 
          q2=temp; 
       }
        return q1.peek(); 
    }
    ```
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty(); 
    }
}