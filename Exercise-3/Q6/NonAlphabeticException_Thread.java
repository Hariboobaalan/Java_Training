package Q6;

/** @author Hariboobaalan
 *  @version 1.0
 */


 /** Import required packages
  */
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonAlphabeticException_Thread {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create object for MyClass
        MyClass myClassObject = new MyClass();
        // Create Thread Pool
        ExecutorService es = Executors.newFixedThreadPool(2);

        // Execute the thread to get Input
        es.execute(()->{
            synchronized(myClassObject){
                myClassObject.getInput();
            }
        });

        // Execute the thread to display message if Exception
        es.execute(()->{
            synchronized(myClassObject){
                while(true){
                    myClassObject.displayMessageIfException();
                }
            }
        });
        // Shutdown ExecutorService
        es.shutdown();
    }
}

class MyClass{
    private char character;
    Scanner sc = new Scanner(System.in);

    // Method to get Input using Scanner
    public void getInput(){
        while(sc.hasNext()){
            character = sc.next().charAt(0);
            if(!Character.isAlphabetic(character)){
                notify();
                try{
                    wait();
                }catch(Exception e){}
            }
        }
    }

    // Method to display Exception message
    public void displayMessageIfException(){
        System.out.println("The Input '"+this.character+"' is not a alphabet");
        notify();
        try{
            wait();
        }catch(Exception e){}
    }
}