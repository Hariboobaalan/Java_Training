package Q5;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * CountObjects is a class that has a static variable count that is incremented every time a new object
 * of CountObjects is created.
 */
class CountObjects{
    static int count=0;
    CountObjects(){
        count++;
    }
}
public class CalculateNoOfObject {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Creating a new object of CountObjects and assigning it to c1.
        CountObjects c1 = new CountObjects();
        CountObjects c2 = new CountObjects();
        System.out.println("No. Of Objects = "+CountObjects.count);
    }
}
