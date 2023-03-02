package creational_patterns.singleton_pattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class SingletonPattern {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);
        service.execute(()->{
            Singleton trainee1 = Singleton.createInstance();
                trainee1.setName("TOM");
                trainee1.displayName();
        });
        
        service.execute(()->{
            Singleton trainee2 = Singleton.createInstance();
                trainee2.displayName();
        });

        service.execute(()->{
            Singleton trainee3 = Singleton.createInstance();
                trainee3.displayName();
        });
        service.shutdown();
        

    }

}