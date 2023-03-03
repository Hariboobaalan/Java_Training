package Q7;

/** @author Hariboobaalan
 *  @version 1.0
 */


 /** Import required packages
  */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create Thread Pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // Create object for Count class
        Count object = new Count();

        // Execute the thread to Count numbers from 1 to 100
        executorService.execute(()->{
            for(;Count.number<101;Count.number++){
                object.countNumbers();
            }
        });

        // Execute the thread to display Message after printing every 10 numbers
        executorService.execute(()->{
            for(int iterationVariable=0;iterationVariable<9;iterationVariable++){
                object.displayMessage();
            }
            System.exit(0);
        });
        // Shutdown ExecutorService
        executorService.shutdown();
    }
}

class Count{
    static int number=1;

    // Method to print the numebers
    synchronized public void countNumbers(){
        System.out.print(number+" ");
        if(number%10==0){
            notify();
            try{
                wait();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }

    // Method to print the Message after counting every 10 numbers
    synchronized public void displayMessage(){
        System.out.println("\nCounted ten numbers");
        try{
            notify();   
            wait();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}