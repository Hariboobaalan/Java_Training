package creational_patterns.factory_pattern;
/** @author Hariboobaalan
 *  @version 1.0
 */

public class IPhone extends Phone {
    @Override
    public void displayBrand() {
        System.out.println("Brand = IPhone");
    }
    @Override
    public void displayOS() {
        System.out.println("OS = iOS");
    }
    @Override
    public void displayProcessor() {
        System.out.println("Processor = A16");
    }
}
