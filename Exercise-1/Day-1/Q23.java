class Test1{
    protected int pro = 10;
}

public class Q23 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println("Protected member before alteration "+t.pro);
        t.pro = 30;
        System.out.println("Protected member value after alteration: "+t.pro);
    }
}
