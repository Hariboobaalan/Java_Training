package Q3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventorySystem {
    public static void main(String[] args) {
        Inventory inventoryObject = new Inventory();
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.execute(()->{
            for(int iterationVariable=1;iterationVariable<=5;iterationVariable++){
                inventoryObject.produce(iterationVariable);
            }
        });

        es.execute(()->{
            for(int iterationVariable=1;iterationVariable<=5;iterationVariable++){
                inventoryObject.consume(iterationVariable);
            }
        });

        es.shutdown();
    }
}

class Inventory{
    static boolean flag=false;
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