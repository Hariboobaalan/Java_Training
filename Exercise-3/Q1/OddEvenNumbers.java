package Q1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenNumbers{
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        OddEvenNumbers object = new OddEvenNumbers();
        es.execute(()->{
            Thread.currentThread().setName("Even Numbers Thread");
            object.printNumbers(2);
        });
        es.execute(()->{
            Thread.currentThread().setName("Odd Numbers Thread");
            object.printNumbers(1);
            
        });
        es.shutdown();

    }

    synchronized public void printNumbers(int number){
        System.out.println(Thread.currentThread().getName());
        for(;number<=100;number+=2){
            System.out.print(number+" ");
        }
        System.out.println();
    }
}