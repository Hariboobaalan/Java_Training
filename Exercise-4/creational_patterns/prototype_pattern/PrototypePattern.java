package creational_patterns.prototype_pattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class PrototypePattern {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(()->{
            Staff.deliverIdCard(1,"Ram");
        });
        
        service.execute(()->{
            Staff.deliverIdCard(2,"Ravi");
        });

        service.execute(()->{
            Staff.deliverIdCard(3,"Hari");
        });
        service.shutdown();
    }
}