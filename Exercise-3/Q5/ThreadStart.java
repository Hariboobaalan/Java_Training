package Q5;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class ThreadStart {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create object for MyClass
        MyClass classObject = new MyClass();

        // Start the thread
        classObject.start();
        
        // Start the thread
        classObject.start();
    }
}

// Class MyClass that extends Thread Class
class MyClass extends Thread{

    // Overriding the method run from Thread class
    @Override
    public void run() {
        System.out.println("Thread triggered.");
    }
}