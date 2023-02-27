package Q8;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class ThreadClass {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {

        // Create s StringBuffer object with value 'A'
        StringBuffer sBuffer = new StringBuffer("A");

        // Create 3 instances of MyClass
        MyClass myClassInstance1 = new MyClass(sBuffer);
        MyClass myClassInstance2 = new MyClass(sBuffer);
        MyClass myClassInstance3 = new MyClass(sBuffer);

        // Call the run method of each of the instances
        myClassInstance1.run();
        myClassInstance2.run();
        myClassInstance3.run();
    }
}


// Class named MyClass that extends Thread class
class MyClass extends Thread{
    StringBuffer stringBuffer;

    /**
     * Parameterized constructor
     * @param sBuffer
     * */
    MyClass(StringBuffer sBuffer){
        this.stringBuffer = sBuffer;
    }

    // Overriding the method run of Thread class
    @Override
    public void run() {
        synchronized(this){
            for(int iteratorVariabe=0;iteratorVariabe<100;iteratorVariabe++){
                System.out.println(this.stringBuffer);
            }
            this.stringBuffer.setCharAt(0, (char) (this.stringBuffer.charAt(0) + 1));
        }
    }
}