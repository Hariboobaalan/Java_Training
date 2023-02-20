package Q6;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

 /**
  * The static block is executed before the main method
  */
 public class StaticInitializationOrder {
    static{
        System.out.println("Static Block initialized");
    }
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Main method called");
    }
    
}