package Q5;

import Q4.MyException;

public class MyClass {
    public void throwExceptionMethod() throws Exception{
        new MyException().throwMyException();
    }
}