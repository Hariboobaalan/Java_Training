package Q6;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonAlphabeticException_Thread {
    public static void main(String[] args) {
        MyClass myClassObject = new MyClass();
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(()->{
            synchronized(myClassObject){
                myClassObject.getInput();
            }
        });
        es.execute(()->{
            synchronized(myClassObject){
                while(true){
                    myClassObject.displayMessageIfException();
                }
            }
        });
        es.shutdown();
    }
}

class MyClass{
    private char character;
    Scanner sc = new Scanner(System.in);
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
    public void displayMessageIfException(){
        System.out.println("The Input '"+this.character+"' is not a alphabet");
        notify();
        try{
            wait();
        }catch(Exception e){}
    }
}