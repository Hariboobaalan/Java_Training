package creational_patterns.factory_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class Android  extends Phone {
    @Override
    public void displayBrand() {
        System.out.println("Brand = Moto");
    }
    @Override
    public void displayOS() {
        System.out.println("OS = Stock Android");
    }
    @Override
    public void displayProcessor() {
        System.out.println("Processor = Snapdragon");
    }
}