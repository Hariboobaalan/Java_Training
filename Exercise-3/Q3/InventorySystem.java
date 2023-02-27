package Q3;

/** @author Hariboobaalan
 *  @version 1.0
 */

 /** Import required packages
  */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventorySystem {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create object for Inventory class
        Inventory inventoryObject = new Inventory();
        // Create Thread Pool
        ExecutorService es = Executors.newFixedThreadPool(2);

        // Execute the thread to produce item
        es.execute(()->{
            for(int iterationVariable=1;iterationVariable<=5;iterationVariable++){
                inventoryObject.produce(iterationVariable);
            }
        });

        // Execute the thread to consume item
        es.execute(()->{
            for(int iterationVariable=1;iterationVariable<=5;iterationVariable++){
                inventoryObject.consume(iterationVariable);
            }
        });

        // Shutdown ExecutorService
        es.shutdown();
    }
}

class Inventory{
    // Flag variable to indicate Item status
    static boolean flag=false;

    //  method to produce item
    synchronized public void produce(int itemId){
        if(flag){
            try{
                wait();
            }catch(Exception e){}
        }
        flag=!flag;
        System.out.println("Item"+itemId+" Produced");
        notify();
    }

    // Method to consume item
    synchronized public void consume(int itemId){
        if(!flag){
            try{
                wait();
            }catch(Exception e){}
        }
        flag=!flag;
        System.out.println("Item"+itemId+" consumed");
        notify();
    }
}