package creational_patterns.prototype_pattern;

public class Staff{
    public static void deliverIdCard(int idNumber, String employeeName){
        Prototype inchargePerson = Prototype.createCloneInstance();
        inchargePerson.printIdCard(idNumber,employeeName);
        inchargePerson.displayIdCard();
    }
}