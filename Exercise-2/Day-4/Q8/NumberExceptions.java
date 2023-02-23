package Q8;

public abstract class NumberExceptions extends Exception{
    public abstract void handlerCall();
}

class NonIntegerException extends NumberExceptions{
    String message;
    NonIntegerException(String message){
        this.message = message;
    }
    @Override
    public void handlerCall() {
        new Handler().handle(this);
    }
    @Override
    public String toString() {
        return message;
    }
}