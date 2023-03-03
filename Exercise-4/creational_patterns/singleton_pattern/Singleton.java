package creational_patterns.singleton_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class Singleton{
    private static Singleton instance;
    String name;
    private Singleton(){
        System.out.println("Trainer Created");
    }

    synchronized public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void setName(String name){
        this.name = name;
    }
    public void displayName(){
        System.out.println("Name is "+this.name);
    }
}
// Ensures that only one instance of a class is created and Provide a global access point to the object.
