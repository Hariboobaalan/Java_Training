package creational_patterns.prototype_pattern;

public class PrototypePattern {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Staff.deliverIdCard(1,"Ram");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Staff.deliverIdCard(2,"Ravi");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Staff.deliverIdCard(3,"Hari");
            }
        }).start();
    }
}