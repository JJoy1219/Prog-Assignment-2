import java.io.FileNotFoundException;

public class MinotaurVase {
	public static int N = 20;
	public static boolean roomVacant = true;
	public static int visited[] = new int[N];
	public static void main (String[] args)
	{
		

		for (int i = 0; i < 1000; i++)
		{
			int rand = (int)Math.floor(Math.random()*(N)+1);
			RunnableDemo guest = new RunnableDemo(Integer.toString(rand));
      		guest.start();
		}
	}
}

class RunnableDemo extends MinotaurVase implements Runnable {
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
         int randTime = (int)Math.floor(Math.random()*(10)+1);
         Thread.sleep(randTime);
         if (roomVacant == true)
         {
            roomVacant = false;
            System.out.println("Guest " + threadName + " is in the room.");
            Thread.sleep(5);
            roomVacant = true;
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
