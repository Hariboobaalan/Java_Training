class QuadraticFunction{
    int a;
    int b;
    int c;
    QuadraticFunction(){
        this.a=1;
        this.b=1;
        this.c=1;
    }
    QuadraticFunction(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    public void setValues(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int computeValue(int x){
        return this.a*x*x + this.b*x + this.c;
    }
}
public class Q24 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        QuadraticFunction q1 = new QuadraticFunction();
        QuadraticFunction q2 = new QuadraticFunction(1, 2, 3);
        System.out.println("a= "+q2.getA()+" ; b= "+q2.getB()+" ; c= "+q2.getC());
        System.out.println(q1.computeValue(3));
    }
}
