package Q8;

abstract class HandlerAbstract {
    public abstract void handle(NonIntegerException nie);
}

public class Handler extends HandlerAbstract{
    @Override
    public void handle(NonIntegerException nie) {
        System.out.println("Input is not an Integer");
    }
}