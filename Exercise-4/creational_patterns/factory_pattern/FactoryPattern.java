package creational_patterns.factory_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.util.Scanner;

public class FactoryPattern {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Phonetype (Android / IPhone):");
        String phoneType = scan.nextLine();
        PhoneFactory pFactory = new PhoneFactory();
        Phone myPhone = pFactory.purchasePhone(phoneType);
        myPhone.displayOS();
        myPhone.displayBrand();
        myPhone.displayProcessor();
        scan.close();
    }
}

// Through this we can create association between classes.
// Hiding the implementation part.
// Open Close Principle is achieved.