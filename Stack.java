public class Stack
{
	int limit_size=9;
	int top= -1;
	int size =0;
	int [] Arr= new int [limit_size];

	public void push(int e)
	{
		
		if(size==0)
		{
			Arr[0]=e;
			top=0;
		}
		else
		{
			 Arr[top+1]=e;
			top++;

		}
		size=size+1;
	}
	public int pop()
	{
		if(size==0)
		{
			System.out.println("The stack is empty");
		}
		else
		{
			top= Arr[top-1];
			size=size-1;
		}
		return Arr[top+1];
			

	}
	

	public int size()
	{
		return size;
	}
	
	public int top()
	{
		if (top==-1)
		{
			return 0;
		}

			return Arr[top];
		
	
	}
	public boolean isEmpty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

