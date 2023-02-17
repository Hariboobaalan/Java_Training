/**
 * DefaultValues
 */
public class Q2 {

    static byte b;
    static short s;
    static int i;
    static float f;
    static long l;
    static double d;
    static boolean bool;
    static char c;
    
    public static void main(String[] args) {
        
        System.out.println("Default value of byte: "+b);
        System.out.println("Default value of short: "+s);
        System.out.println("Default value of int: "+i);
        System.out.println("Default value of float: "+f);
        System.out.println("Default value of long: "+l);
        System.out.println("Default value of double: "+d);
        System.out.println("Default value of boolean: "+bool);
        System.out.println("Default value of char: "+c);
        
    }
    static{
        System.out.println("static block is executed");
    }
}