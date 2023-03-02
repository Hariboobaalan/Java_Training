package creational_patterns.singleton_pattern;

public class SingletonPattern {
    public static void main(String[] args) {
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton trainee1 = Singleton.createInstance();
                trainee1.setName("TOM");
                trainee1.displayName();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton trainee2 = Singleton.createInstance();
                trainee2.displayName();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton trainee3 = Singleton.createInstance();
                trainee3.displayName();
            }
        }).start();

    }

}