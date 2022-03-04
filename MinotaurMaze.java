import java.io.FileNotFoundException;

public class MinotaurMaze {
	public static int N = 20;
	public static boolean cakePresent = true;
	public static int counter, count = 0;
	public static int visited[] = new int[N];
	public static void main (String[] args)
	{
		

		while (count < 20)
		{
			int rand = (int)Math.floor(Math.random()*(N)+1);
			if (count == 0)
			{
				counter = rand;
				count++;
				System.out.println("Person " + counter + " is the counter.");
			}
			RunnableDemo guest = new RunnableDemo(Integer.toString(rand));
      		guest.start();
		}
	}
}
class RunnableDemo extends MinotaurMaze implements Runnable {
   private Thread t;
   private String threadName;
   private int guestNum;
   
   RunnableDemo( String name) {
      threadName = name;
      guestNum = Integer.parseInt(threadName);
      //System.out.println("Person " +  threadName + " is picked.");
   }
   
   public void run() {
      //System.out.println("Person " +  threadName );
      try {
         if (guestNum == counter)
         {
         	if (cakePresent == false)
         	{
         		cakePresent = true;
         		count++;
         		System.out.println("Count has been updated to " + count);
         		Thread.sleep(1);
         	}
         }
         else
         {
         	if (cakePresent == true && visited[guestNum - 1] == 0)
         	{
         		cakePresent = false;
         		visited[guestNum - 1] = 1;
         		System.out.println("Person " + threadName + " has eaten the cake.");
         	}
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
   }
   
   public void start () {
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}
