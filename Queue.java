public class Queue
{
	int array[], rear, len, front, first;
	

	public Queue(int e)
	{
		len = 0;
		rear = -1;
		front = -1;
		first = -1;
		array = new int[e];
	}
	public boolean isEmpty()
	{
		if (len == 0) 
		{
			return true;	
		}
		return false;

	}

	public int len()
	{
		return len;
	}

	public int first()
	{
		if (isEmpty()) 
		{
			return 0;	
		}
		else
		{
			return array[front];
		}
	}
	public void enqueue(int e)
	{
		if (isEmpty())
		 {
			array[0] = e;
			front = 0;
			rear = 0;
			first = array[0];
		}
		else
		{
			array[rear + 1] = e;
			rear = rear + 1;
		}
		len = len + 1;
	}
	public int dequeue()
	{
		if (isEmpty())
		 {
			return 0;
		}
		else
		{
			front = front + 1; 
		}
		len = len - 1;
		return array[front-1];
	}
}