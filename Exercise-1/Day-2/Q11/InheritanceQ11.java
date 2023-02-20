package Q11;

/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */


/**
 * A is a class that has a constructor that takes an integer as a parameter.
 */
class A{
    A(int paramA){
        System.out.println("Class A Constructor param = "+paramA);
    }
}

/**
 * Class B has a constructor that takes an integer as a parameter.
 */
class B{
    B(int paramB){
        System.out.println("Class B constructor param = "+paramB);
    }
}

/**
 * Class C extends class A and class B, and has a constructor that takes an integer as a parameter.
 */
class C extends A{
    C(int paramC){
        // We must explicitly call the super class constructor.
        A objectA = new A(paramC);
        B objectB = new B(paramC);
        System.out.println("Class C constructor param = "+paramC);
    }
}

public class InheritanceQ11 {
    public static void main(String[] args) {
        C objectC = new C(10);
    }
}