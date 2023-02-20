package Q7;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

class Test{
    String text;
    /**
     * 
     * @param text
     */
    Test(String text){
        this.text=text;
    }
}

/**
 * The final keyword is used to declare that the reference of the object cannot be changed
 */
public class ChangeStateOfObject {
    public static void main(String[] args) {
        final Test obj = new Test("Hello");
        // Here we are declaring that obj can only hold
        //   the reference to one object only.
        // The holding reference cannot be changed.
        // However the value in that reference can be changed.
        System.out.println(obj.text);
        obj.text="World";
        System.out.println(obj.text);
    }
}
