package Q16;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * X is a class that has a method called do1.
 */
class X{
    void do1(){
        System.out.println("Do1");
    }
}

/**
 * Y is a class that extends X and adds a do2 method.
 */
class Y extends X{
    void do2(){
        System.out.println("Do2");
    }
}

public class Chrome {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y1 = new Y();
        //(Y)x2.do2();
        // The above statement causes error because..
        // First it calls the method and explicits typecasts..

        // To fix it, we must typecast first and call..
        ((Y)x2).do2();
    }
    
}
