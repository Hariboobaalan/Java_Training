package Q1;

import java.io.UncheckedIOException;

public class ExceptionHandlingTest{
    
    static void throwExceptionMethod(){
        throw new UncheckedIOException(null);
    }
    public static void main(String[] args) {
        throwExceptionMethod();
    }
}