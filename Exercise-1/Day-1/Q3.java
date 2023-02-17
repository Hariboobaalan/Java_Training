import java.util.Scanner;

public class Q3 {
    static void simpleInitialize(){
        byte b = 17;
        short s = 35;
        int i = 12;
        float f = 45f;
        long l = 322_543_134L;
        double d = 435_434_131_153.432d;
        boolean bool  = true;
        char c = 'A';
    }
    static void inputInitialize(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte b = sc.nextByte();
        System.out.println("Enter a short value: ");
        short s = sc.nextShort();
        System.out.println("Enter a int value: ");
        int i = sc.nextInt();
        System.out.println("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.println("Enter a long value: ");
        long l = sc.nextLong();
        System.out.println("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.println("Enter a boolean value: ");
        boolean bool  = sc.hasNextBoolean();
        System.out.println("Enter a char value: ");
        char c = sc.next().charAt(0);
        sc.close();
    }

    static void implicitTypeCasting(){
        byte b=12;
        System.out.println("Implicit Type Casting (byte to double)");
        System.out.println("byte = "+b);
        short s = b;
        System.out.println("short = "+b);
        int i = s;
        System.out.println("int = "+s);
        long l = s;
        System.out.println("long = "+l);
        float f = l;
        System.out.println("float = "+f);
        double d= f;
        System.out.println("double = "+d);

    }

    static void explicitTypeCasting(){
        System.out.println("Explicit Type Casting from double to byte");
        double d = 342_341.0d;
        System.out.println("double = "+d);
        float f = (float)d;
        System.out.println("float = "+f);
        long l = (long)f;
        System.out.println("long = "+l);
        int i = (int) l;
        System.out.println("int = "+i);
        short s = (short) i;
        System.out.println("short = "+s);
        byte b = (byte)s;
        System.out.println("byte = "+b);
    }
    public static void main(String[] agrs) {
        
        simpleInitialize();
        inputInitialize();
        implicitTypeCasting();
        explicitTypeCasting();
    }
}
