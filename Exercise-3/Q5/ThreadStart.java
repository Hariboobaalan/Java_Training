package Q5;

public class ThreadStart {
    public static void main(String[] args) {
        MyClass classObject = new MyClass();
        classObject.start();
        classObject.start();
    }
}

class MyClass extends Thread{
    @Override
    public void run() {
        System.out.println("Thread triggered.");
    }
}