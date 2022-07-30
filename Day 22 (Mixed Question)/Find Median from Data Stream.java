class MedianFinder {
    PriorityQueue<Integer> maxheap,minheap;
    int size;
    public MedianFinder() {
        //Left Part
        maxheap=new PriorityQueue<>(Collections.reverseOrder());
        //Right Part
        minheap=new PriorityQueue<>();
        size=0;
    }
    
    public void addNum(int num) {
        int balance=maxheap.size()-minheap.size();
        if(balance==0){
            if(size==0 || (double)num<=findMedian())
                maxheap.add(num);
            else if((double)num>findMedian()){
                minheap.add(num);
            }
        }
        else if(balance==1){
            if((double)num>findMedian())
                minheap.add(num);
            else{
                minheap.add(maxheap.poll());
                maxheap.add(num);
            }
        }
        else if(balance==-1){
            if((double)num<=findMedian())
                maxheap.add(num);
            else{
                maxheap.add(minheap.poll());
                minheap.add(num);
            }
        }
        size=size+1;
        
        
    }
    
    public double findMedian() {
        if(size%2==1){
            if(maxheap.size()>minheap.size())
                return (double)maxheap.peek();
            else
                return (double)minheap.peek();
        }
        else{
            return (double)(minheap.peek()+maxheap.peek())/2;
        }
    }
}