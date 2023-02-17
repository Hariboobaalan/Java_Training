protected class base{
    // A class can be declared onlty public, abstract and final.
    String Method(){
        return "Wow";
    }
}
class Derived{
    public void useD(){
        base z = new base();
        System.out.println("base says,"+z.Method());
    }
}
public class Q25 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.useD();
    }
}
