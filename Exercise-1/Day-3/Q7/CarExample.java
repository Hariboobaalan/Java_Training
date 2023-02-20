package Q7;
import Q7.vehicle.fourwheeler;


/** @author Hariboobaalan
 *  @version 1.0
 */

// Import the abstract class from the external package
// Create class car that extends the abstract class.
class Car extends fourwheeler{
    void display(){
        System.out.println("Car class diaply method invoked");
    }
}
public class CarExample {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.display();
    }
}
