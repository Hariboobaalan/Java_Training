package Q4;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Clock myClock = new Clock();
        es.execute(()->{
            synchronized(myClock){
                while(true){
                    LocalDateTime ldt = LocalDateTime.now();
                    myClock.updateTime(ldt);
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){}
                }
            }
        });
        es.execute(()->{
            synchronized(myClock){
                while(true){
                    myClock.displayTime();
                }
            }
        });
        es.shutdown();
    }
}

class Clock{
    private int hour;
    private int minute;
    private int second;
    private int day;
    private int month;
    private int year;

    synchronized public void updateTime(LocalDateTime ldt){
        this.hour = ldt.getHour();
        this.minute = ldt.getMinute();
        this.second = ldt.getSecond();
        this.day = ldt.getDayOfMonth();
        this.month = ldt.getMonthValue();
        this.year = ldt.getYear();
        try{
            notify();
            wait();
        }catch(Exception e){}
    }
    
    synchronized public void displayTime(){
        System.out.println("Date => ("+this.day+"/"+this.month+"/"+this.year+")");
        System.out.println("Time (HH:MM:SS) => ("+this.hour+":"+this.minute+":"+this.second+")");
        notify();
        try{
            wait();
        }catch(Exception e){} 
    }
}