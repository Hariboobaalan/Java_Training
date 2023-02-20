package Q12;

/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * Wipro is an abstract class that has a method called displayCompanyType().
 */
abstract class Wipro{
    abstract public void displayCompanyType();
}

/**
 * {@link WiproInfotech}, {@link WiproBPO}, {@link WiproInfotech} are Wipro that specializes in technologies.
 */
class WiproTechnologies extends Wipro{
    @Override
    public void displayCompanyType(){
        System.out.println("Wipro Technologies");
    }
}

class WiproInfotech extends Wipro{
    
    @Override

    public void displayCompanyType(){
        System.out.println("Wipro Infotech");
    }
}

class WiproBPO extends Wipro{
    @Override
    public void displayCompanyType(){
        System.out.println("Wipro BPO");
    }
}

public class WiproInheritance{
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Wipro[] wiproArray = new Wipro[3];
        wiproArray[0]= new WiproTechnologies();
        wiproArray[1] = new WiproInfotech();
        wiproArray[2] = new WiproBPO();
        
        for(Wipro w: wiproArray){
            w.displayCompanyType();
        }
    }
}
