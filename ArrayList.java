
public class ArrayList {

	int arr[]=null;
	int capacity=5;
	int size=0;
	ArrayList()
	{
		this.arr=new int[capacity];
	}
	ArrayList(int capacity)
	{
		this.capacity=capacity;
		this.arr=new int[capacity];
	}
	public void add(int data)
	{
		if(size == capacity)
		{
			System.out.println("Array overflow capacity increased");
			capacity =capacity + (capacity >> 1);
			int newArr []=new int [capacity];
			for(int i=0;i<arr.length;i++)
			{
				newArr[i]=arr[i];
			}
			this.arr=newArr;
		}
		arr[size++]=data;
	}
	public int indexOf(int data)
	{
		int index=-1;
		for(int i=0;i<size;i++)
		{
			if(arr[i] == data)
			{
				index=i;
				break;
			}
		}
		return index;
	}
	public int lastIndexOff(int data)
	{
		int index=-1;
		for(int i=size-1;i>0;i--)
		{
			if(arr[i] == data)
			{
				index=i;
				break;
			}
		}
		return index;
	}
	public void removeObj(int data)
	{
		remove(indexOf(data));
	}
	public void add(int data,int index)
	{
		if(index > capacity-1 || index < 0)
		{
			System.out.println("Index is out of range");
			return;
		}
		for(int i=size;i>index;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[index]=data;
		size++;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public boolean contains(int data)
	{
		return (indexOf(data) !=-1);
	}
	public void clear()
	{
		size=0;
	}
	
	public void remove(int index)
	{
		if(index > capacity-1 || index < 0)
		{
			System.out.println("Index is out of range");
			return;
		}
		for(int i=index;i<size;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
	}
	@Override
	public String toString()
	{
		StringBuilder result=new StringBuilder();
		result.append("[");
		for(int a=0;a<size;a++)
		{
			result.append(a).append(",");
		}
		if(result.length() > 1)
		{
		  result.deleteCharAt(result.length()-1);
		}
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(110);
		al.remove(10);
		al.add(78, 9);
		al.removeObj(60);
		al.add(10);
		System.out.println("Index position of given data ="+al.lastIndexOff(10));
		System.out.println("Index position of given data ="+al.indexOf(100));
		System.out.println(al.toString());
		System.out.println(al.contains(50));
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al.toString());
	}
    
}
