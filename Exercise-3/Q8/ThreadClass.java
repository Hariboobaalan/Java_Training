package Q8;


public class ThreadClass {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("A");
        MyClass myClassInstance1 = new MyClass(sBuffer);
        MyClass myClassInstance2 = new MyClass(sBuffer);
        MyClass myClassInstance3 = new MyClass(sBuffer);
        myClassInstance1.run();
        myClassInstance2.run();
        myClassInstance3.run();
    }
}

class MyClass extends Thread{
    StringBuffer stringBuffer;
    MyClass(StringBuffer sBuffer){
        this.stringBuffer = sBuffer;
    }
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