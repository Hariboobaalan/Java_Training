package Q2;

/** @author Hariboobaalan
 *  @version 1.0
 */

 /** Import required packages
  */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedThreads {
    /**
     * 
     * @param args
     * @return null
     */

    public static void main(String[] args) {
        // Create Thread Pool
        ExecutorService es = Executors.newFixedThreadPool(3);

        // Create object for SynchronizedThreads class
        SynchronizedThreads object = new SynchronizedThreads();

        // Execute the thread to print Open Paranthesis
        es.execute(()->
        {
            object.openParanthesis();   
        }
        );
        // Execute the thread to print hyphen
        es.execute(()->
        {
            for(int counter=0;counter<6;counter++){
                object.hyphen();   
            }
        }
        );
        // Execute the thread to print Message
        es.execute(()->
        {
            object.displayMessage();   
        }
        );
        // Execute the thread to print hyphen
        es.execute(()->
        {
            for(int counter=0;counter<6;counter++){
                object.hyphen();   
            }
        }
        );
        // Execute the thread to print close Paranthesis
        es.execute(()->
            {
                object.closeParanthesis();   
            }
        );
        // Shutdown ExecutorService
        es.shutdown();
    }

    synchronized public void openParanthesis(){
        System.out.print("[");
    }
    synchronized public void hyphen(){
        System.out.print("-");
    }
    synchronized public void displayMessage(){
        System.out.print("Message");
    }
    synchronized public void closeParanthesis(){
        System.out.println("]");
    }
}
