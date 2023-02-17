import javax.crypto.spec.RC2ParameterSpec;

class Test{
    public int pub = 10;
    private int pri = 20;
    protected int pro = 30;
    int def = 40;
}

public class Q22 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("Public member "+t.pub);
        System.out.println("Protected member "+t.pro);
        System.out.println("Default member "+t.def);
        System.out.println("Private member "+t.pri);
    }
    
}
