package Q7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Count object = new Count();
        es.execute(()->{
            for(;Count.number<101;Count.number++){
                object.countNumbers();
            }
        });
        es.execute(()->{
            for(int iterationVariable=0;iterationVariable<9;iterationVariable++){
                object.displayMessage();
            }
            System.exit(0);
        });
        es.shutdown();
    }
}

class Count{
    static int number=1;
    synchronized public void countNumbers(){
        System.out.print(number+" ");
        if(number%10==0){
            notify();
            try{
                wait();
            }catch(Exception e){}
        }
        try {
            // Thread.sleep(1000);
        } catch (Exception e) {}
    }
    synchronized public void displayMessage(){
        System.out.println("\nCounted ten numbers");
        try{
            notify();   
            wait();
        }catch(Exception e){}
    }
}