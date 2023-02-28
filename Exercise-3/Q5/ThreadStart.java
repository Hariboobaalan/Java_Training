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
        ThreadDemo classObject = new ThreadDemo();

        // Start the thread
        classObject.start();
        
        // Start the thread
        classObject.start();
    }
}

// Class MyClass that extends Thread Class
class ThreadDemo extends Thread{

    // Overriding the method run from Thread class
    @Override
    public void run() {
        System.out.println("Thread triggered.");
    }
}

/*
 * From my observation, It is understood that,
 * The start() method is used to create a new Thread and it inturn internally calls the run() method.
 * Also, a Thread can only be start once.
 * We cannot start a thread more than once.
 * 
 */