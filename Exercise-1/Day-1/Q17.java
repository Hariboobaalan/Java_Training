/**
 * Q17
 */
public class Q17 {
    final static int i = 5;
    
    public void test(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        //i=10; //Const(final) cannot be modified
        Q17 q = new Q17();
        q.test();

    }
}