package Q5;

/** @author Hariboobaalan
 *  @version 1.0
 */
// Import the external interface from ExternalPackage
import Q5.ExternalPackage.Question5;

// Declare MyClass that implements the interface and Overrides the methods.
class MyClass implements Question5{
    @Override
    public void method1() {
        System.out.println("Method 1 called");
    }
    @Override
    public void method2() {
        System.out.println("Method 2 called");
    }
    @Override
    public void method3() {
        System.out.println("Method 3 called");
    }
}

public class PackageExample1{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}