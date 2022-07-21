class MyQueue
{
   QueueNode front, rear;
   
   //Function to push an element into the queue.
void push(int a)
{
       // Your code here
       if(front==null)
       {
           front=rear=new QueueNode(a);
       }
       else
       {
           QueueNode node =new QueueNode(a);
           rear.next=node;
           rear=node;
       }
}

   //Function to pop front element from the queue.
int pop()
{
       // Your code here
       if(front==null)
       {
           return -1;
       }
       int data= front.data;
       if(front==rear)
       {
           front=rear=null;
       }
       else
       {
           front=front.next;
       }
       return data;
}
}