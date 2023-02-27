package Q4;

/** @author Hariboobaalan
 *  @version 1.0
 */


 /** Import required packages
  */
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DigitalClock {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create Thread Pool
        ExecutorService es = Executors.newFixedThreadPool(3);
        // Create object for Clock class
        Clock myClock = new Clock();

        // Execute the thread to Update time
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
        // Execute the thread to display date and time
        es.execute(()->{
            synchronized(myClock){
                while(true){
                    myClock.displayTime();
                }
            }
        });
        // Shutdown ExecutorService
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

    // Method for clock to update the time
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
    
    // Method to display the date and time
    synchronized public void displayTime(){
        System.out.println("Date => ("+this.day+"/"+this.month+"/"+this.year+")");
        System.out.println("Time (HH:MM:SS) => ("+this.hour+":"+this.minute+":"+this.second+")");
        notify();
        try{
            wait();
        }catch(Exception e){} 
    }
}