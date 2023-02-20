package Q13;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * The class Test is an abstract class that has a method display() that prints "Hello World" to the
 * console
 */
abstract class Test{

    public void display(){
        System.out.println("Hello World");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Object for abstract class cannot be created. Because it is just an idea
        // And it is not complete. It must be extended and completed first.
        // Test t1 = new Test();

        // However we can create like this, by extending and giving the implemtation
        // Anonymous class
        Test t2 = new Test() {
            @Override
            public void display() {
                System.out.println("Hello guys");
            }
        };
        t2.display();
    }
}
