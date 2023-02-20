package Q4;

/** @author Hariboobaalan
 *  @version 1.0
 */

// Declare interfaces Test1, Test2, Test3
interface Test1{
    public void test1Method1();
    public void test1Method2();
}

interface Test2{
    public void test2Method1();
    public void test2Method2();
}

interface Test3{
    public void test3Method1();
    public void test3Method2();
}

// Declare a interface TestFinal that extends Test1,Test2,Test3
interface TestFinal extends Test1,Test2,Test3{
    public void testFinalMethod();
}

class NewBaseClass{

}

class NewDerivedClass extends NewBaseClass implements TestFinal{
    @Override
    public void test1Method1() {
        System.out.println("Test 1 Method 1 called");
    }
    @Override
    public void test1Method2() {
        System.out.println("Test 1 Method 2 called");
    }
    @Override
    public void test2Method1() {
        System.out.println("Test 2 Method 1 called");
    }
    @Override
    public void test2Method2() {
        System.out.println("Test 2 Method 2 called");
    }
    @Override
    public void test3Method1() {
        System.out.println("Test 3 Method 1 called");
    }
    @Override
    public void test3Method2() {
        System.out.println("Test 3 Method 2 called");
    }
    @Override
    public void testFinalMethod() {
        System.out.println("Test Final Method called");
    }

    public void methodForInterface1(Test1 t1){
        t1.test1Method1();
        t1.test1Method2();
    }

    public void methodForInterface2(Test2 t2){
        t2.test2Method1();
        t2.test2Method2();
    }

    public void methodForInterface3(Test3 t3){
        t3.test3Method1();
        t3.test3Method2();
    }

    public void methodForInterfaceFinal(TestFinal tf){
        tf.testFinalMethod();
    }    
} 

public class InterfaceExample1 {
    public static void main(String[] args) {
        NewDerivedClass ndc = new NewDerivedClass();
        ndc.methodForInterface1(ndc);
        ndc.methodForInterface2(ndc);
        ndc.methodForInterface3(ndc);
        ndc.methodForInterfaceFinal(ndc);
    }
}
