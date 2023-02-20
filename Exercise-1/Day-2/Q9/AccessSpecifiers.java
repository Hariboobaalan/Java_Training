package Q9;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * A class named A has three fields, publicNumber, privateNumber, and protectedNumber, and three
 * methods, publicMethod, privateMethod, and protectedMethod
 */
class A{
    public int publicNumber = 1;
    private int privateNumber = 2;
    protected int protectedNumber =3;

    public void publicMethod(){
        System.out.println("Public method called");
    }

    private void privateMethod(){
        System.out.println("Private mthod called");
    }
    protected void protectedMethod(){
        System.out.println("Protected method called");
    }
}

/**
 * B is a subclass of A, and B can access all of A's members.
 */
class B extends A{
    public void displayMembersOfA(){
        System.out.println("Public Number = "+publicNumber);
        System.out.println("Private Number = "+privateNumber);
        System.out.println("Protected Number = "+protectedNumber);
        publicMethod();
        protectedMethod();
        privateMethod();
    }
}

public class AccessSpecifiers {
    public static void main(String[] args) {
        B obj = new B();
        obj.displayMembersOfA();
    }
}