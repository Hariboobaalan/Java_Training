package Q6;

/** @author Hariboobaalan
 *  @version 1.0
 */
// Import the class from the ExternalPackage
import Q6.ExternalPackage.Question6;

// Create subclass for the baseclass.
class DerivedClass extends Question6{
    public void getProtectedMethod(){
        protectedMethod();
    }
}

// Try to access the protectedMethod
public class PackageExample2 {
    public static void main(String[] args) {
        Question6 obj1 = new Question6();
        obj1.protectedMethod();

        DerivedClass obj2 = new DerivedClass();
        obj2.getProtectedMethod();
    }
}
