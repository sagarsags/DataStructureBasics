
public class CircularQueue {

	int capacity =3;
    int arr[]=null;
    int size=0;
    int front=0;
    int rear=-1;
    CircularQueue()
    {
    	this.arr=new int[capacity];
    }
    CircularQueue(int capacity)
    {
    	this.capacity=capacity;
    	this.arr=new int[capacity];
    }
    public void equeue(int data)
    {
    	if(size == capacity)
    	{
    		System.out.println("Queue is full,can't inserted data");
    		return;		
    	}
    	rear = (rear + 1 ) % capacity;
    	arr[rear]=data;
    	size++;
    	System.out.println(data + " data is queued inside queue");
    }
    public void dequeue()
    {
    	if(isEmpty())
    	{
    		System.out.println("Queue is Empty ");
    		return;
    	}
    	int data=arr[front];
    	front = (front + 1) % capacity;
    	size--;
    	System.out.println(data + "  dequeued data ");
    }
    public int size()
    {
    	return size;
    }
    public boolean isEmpty()
    {
    	return size == 0;
    }
    public boolean isFull()
    {
    	return size == capacity;
    }
    public void displayData()
    {
    	System.out.println("Queue data");
    	System.out.print("[");
    	for(int i=0;i<arr.length;i++)
    	{
    		
    		System.out.print(" "+arr[i]+" ");
    		if(i == arr.length-1)
    		{
    			System.out.print("]");
    		}
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CircularQueue cq=new CircularQueue();
      cq.equeue(10);
      cq.equeue(20);
      cq.equeue(30);
      System.out.println(cq.isFull());
      cq.displayData();
      cq.dequeue();
      cq.dequeue();
      System.out.println("Current size of queue "+cq.size());
      cq.equeue(40);
      cq.equeue(50);
      cq.displayData();
      cq.dequeue();
      cq.dequeue();
      cq.dequeue();
      System.out.println(cq.isEmpty());
      
      
	}

}
