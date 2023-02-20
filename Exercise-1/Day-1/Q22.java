import javax.crypto.spec.RC2ParameterSpec;

class Test{
    public int pub = 10;
    private int pri = 20;
    protected int pro = 30;
    int def = 40;

    public void displayPublic(){
        System.out.println("Public Method invoked");
    }

    private void displayPrivate(){
        System.out.println("Private Method Invoked");
    }

    protected void displayProtected(){
        System.out.println("Protected Method Invoked");
    }
    void displayDefault(){
        System.out.println("Default Method Invoked");
    }

}

public class Q22 {
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println("Public member "+t.pub);
        t.displayPublic();
        
        System.out.println("Protected member "+t.pro);
        t.displayProtected();
        
        System.out.println("Default member "+t.def);
        t.displayDefault();
        
        System.out.println("Private member "+t.pri);
        t.displayPrivate();
    }
    
}
