package creational_patterns.prototype_pattern;

public class Prototype implements Cloneable{
    private static Prototype instance;
    private int employeeId;
    private String employeeName;

    private Prototype(){
        System.out.println("Prototype Constructor Called..");
    }

    synchronized public static Prototype createCloneInstance(){
        if(instance==null){
            return createSingleton();
        }else{
            return instance.createClone();
        }
    }

    synchronized private static Prototype createSingleton(){
        if(instance == null){
            instance = createInstance();
        }
        return instance;
    }

    synchronized private static Prototype createInstance(){
        return new Prototype();
    }
    synchronized private Prototype createClone(){
        try{
            return (Prototype) super.clone();
        }catch(Exception e){
            return null;
        }
    }

    public void printIdCard(int employeeId, String employeeName){
        this.employeeId= employeeId;
        this.employeeName=employeeName;
    }
    
    public void displayIdCard(){
        System.out.println("ID: "+this.employeeId+" | Name: "+this.employeeName);
    }
}