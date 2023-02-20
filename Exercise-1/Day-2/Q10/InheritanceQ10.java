package Q10;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * A class named A with a constructor that prints "Class A Constructor called" when called
 */
class A{
    A(){
        System.out.println("Class A Constructor called");
    }
}

/**
 * B is a class that has a constructor that prints out a message.
 */
class B{
    B(){
        System.out.println("Class B constructor called");
    }
}

/**
 * C is a class that extends A and has an object of type B.
 */
class C extends A{
    B objectB = new B();
}

public class InheritanceQ10 {
    public static void main(String[] args) {
        C objectC = new C();
    }
}