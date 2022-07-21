class MyQueue {

   int front, rear;
   int n = 100005;
int arr[] = new int[n];

   MyQueue()
{
 front=-1;
 rear=-1;
}

//Function to push an element x in a queue.
void push(int x)
{
    // Your code here
    if((rear+1)% n == front) {
        return;
    }
    
    if(front == -1) {
        front = 0;
    }
    
    rear = (rear+1)%n;
    arr[rear] = x;
}

   //Function to pop an element from queue and return that element.
int pop()
{
 // Your code here
 if(front == -1) {
     return -1;
 }
 
 int result = arr[front];
 
 if(front == rear) {
     front = -1;
     rear = -1;
 } else {
     front = (front+1)%n;
 }
 
 return result;
} 

}