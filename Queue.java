
public class Queue {

	int capacity=5;
	int arr[]=null;
	int front=0;
	int rear=-1;
	Queue()
	{
		this.arr=new int[capacity];
	}
	Queue(int capacity)
	{
		this.capacity=capacity;
		this.arr=new int[capacity];
	}
	public void equeue(int data)
	{
		if(!isFull())
		{
			arr[++rear]=data;
			System.out.println(data +" added inside queue");
		}
		
	}
	public void dequeue()
	{
		if(!isEmpty())
		{
			int data=rear();
			for(int i=front;i<rear;i++)
			{
				arr[i]=arr[i++];
			}
			rear--;
			System.out.println(data +" dequed from queue");
		}
	}
	public boolean isEmpty()
	{
		if(rear == -1)
		{
			System.out.println("Queue is  Empty , Add data to queue");
			return true;
		}
		return false;
	}
	public int rear()
	{
		if(isEmpty())
		{
		   System.out.println("Queue is empty");
		}
		return arr[rear];
	}
	public int front()
	{
		if(isEmpty())
		{
		   System.out.println("Queue is empty");
		}
		return arr[front];
	}
	public boolean isFull()
	{
		if(rear+1 ==capacity)
		{
			System.out.println("Queue is full,can't add data");
			return true;
		}
		return false;
	}
	public int size()
	{
		return rear+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(3);
		q.equeue(10);
		q.equeue(20);
		q.equeue(30);
		q.equeue(40);
		System.out.println("Current rear value is :"+q.rear());
		System.out.println("Current front value is :"+q.front());
		q.isFull();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.isEmpty();
	}
}
