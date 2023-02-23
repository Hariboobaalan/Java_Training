package Q9;

public abstract class NumberExceptions extends Exception{
    public abstract void handlerCall();
}

class NegativeNumberException extends NumberExceptions{
    String message;
    NegativeNumberException(String message){
        this.message=message;
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
class NotInRangeException extends NumberExceptions{
    String message;
    NotInRangeException(String message){
        this.message=message;
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