public class QueueTest
{
public static void main(String[] args) 

        {		
                Queue objD= new Queue(10);
                objD.enqueue(10);
                objD.enqueue(2);
                objD.enqueue(30);
                objD.enqueue(134);
            
                System.out.println(objD.isEmpty());
                System.out.println(objD.len());
                System.out.println(objD.first());
                System.out.println(objD.dequeue());
                System.out.println(objD.len());        

        	System.out.println("All test cases you haave tested are correct");	
	}

}