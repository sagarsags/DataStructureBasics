package stackimplement;

public class StackImplement {

	int arr[]=null;
	int  capacity=5;
	int top=-1;
	
	
	StackImplement()
	{
		arr=new int[capacity];
	}
	StackImplement(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
	}
	
	public void push(int data)
	{
		if(!isSatckFull())
		{
		   arr[++top]=data;
		  System.out.println("Data inserted in stack is :"+data);
		}
	}
	public void pop()
	{
		if(!isEmpty())
		{
		  int data=arr[top--];
		  System.out.println("Data removed from stack is :"+data);
		}
	}
	public boolean isEmpty()
	{
		if( top == -1)
		{
			System.out.println("Satck is empty please add data");
			return true;
			
		}
		return false;		
	}
	public boolean isSatckFull()
	{
		if(top+1 == capacity)
		{
			System.out.println("Satck is full increase stack size");
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplement sti=new StackImplement(3);
		   sti.push(20);
		   sti.push(30);
		   sti.push(40);
		   sti.isSatckFull();
		   sti.pop();
		   sti.pop();
		   sti.pop();
		   sti.isEmpty();
	}

}
