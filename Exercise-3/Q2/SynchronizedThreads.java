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
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Create object for SynchronizedThreads class
        SynchronizedThreads object = new SynchronizedThreads();

        // Execute the thread to print Open Paranthesis
        executorService.execute(()->
        {
            object.openParanthesis();   
        }
        );
        // Execute the thread to print hyphen
        executorService.execute(()->
        {
            for(int counter=0;counter<6;counter++){
                object.hyphen();   
            }
        }
        );
        // Execute the thread to print Message
        executorService.execute(()->
        {
            object.displayMessage();   
        }
        );
        // Execute the thread to print hyphen
        executorService.execute(()->
        {
            for(int counter=0;counter<6;counter++){
                object.hyphen();   
            }
        }
        );
        // Execute the thread to print close Paranthesis
        executorService.execute(()->
            {
                object.closeParanthesis();   
            }
        );
        // Shutdown ExecutorService
        executorService.shutdown();
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
