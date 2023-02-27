package Q1;

/** @author Hariboobaalan
 *  @version 1.0
 */

 /** Import required packages
  */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenNumbers{
    /**
     * 
     * @param args
     * @return null
     */
    
    public static void main(String[] args) {
        // Create Thread Pool
        ExecutorService es = Executors.newFixedThreadPool(2);

        // Create object for OddEvenNumbers class
        OddEvenNumbers object = new OddEvenNumbers();

        // Execute the thread to print Even Numbers
        es.execute(()->{
            Thread.currentThread().setName("Even Numbers Thread");
            object.printNumbers(2);
        });
        
        // Execute the thread to print Odd Numbers
        es.execute(()->{
            Thread.currentThread().setName("Odd Numbers Thread");
            object.printNumbers(1);
            
        });

        // Shutdown ExecutorService
        es.shutdown();

    }

    synchronized public void printNumbers(int number){
        
        // Print name of currentThread
        System.out.println(Thread.currentThread().getName());

        // Print values
        for(;number<=100;number+=2){
            System.out.print(number+" ");
        }
        System.out.println();
    }
}