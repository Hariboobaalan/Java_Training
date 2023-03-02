package creational_patterns.prototype_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class Staff{
    public static void deliverIdCard(int idNumber, String employeeName){
        Prototype inchargePerson = Prototype.createCloneInstance();
        inchargePerson.printIdCard(idNumber,employeeName);
        inchargePerson.displayIdCard();
    }
}