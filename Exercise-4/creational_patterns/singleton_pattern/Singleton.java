package creational_patterns.singleton_pattern;

public class Singleton{
    private static Singleton instance;
    String name;
    private Singleton(){
        System.out.println("Trainer Created");
    }

    synchronized public static Singleton createInstance(){
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