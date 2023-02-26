package Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedThreads {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        SynchronizedThreads object = new SynchronizedThreads();
        es.execute(()->
            {
                object.openParanthesis();   
            }
        );
        es.execute(()->
            {
                for(int counter=0;counter<6;counter++){
                    object.hyphen();   
                }
            }
        );
        es.execute(()->
            {
                object.displayMessage();   
            }
        );
        es.execute(()->
            {
                for(int counter=0;counter<6;counter++){
                    object.hyphen();   
                }
            }
        );
        es.execute(()->
            {
                object.closeParanthesis();   
            }
        );
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
