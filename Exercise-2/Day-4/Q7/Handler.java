package Q7;

abstract class HandlerAbstract {
    public abstract void handle(DivideByZeroException dz);
    public abstract void handle(NonIntegerException nie);
    public abstract void handle(NegativeNumberException ne);
    public abstract void handle(NotInRangeException nire);
}

public class Handler extends HandlerAbstract{
    @Override
    public void handle(DivideByZeroException dz) {
        System.out.println("Division by Zero or Poor Input.");
    }
    @Override
    public void handle(NonIntegerException nie) {
        System.out.println("Number is not an Integer");
    }
    public void handle(NegativeNumberException ne){
        System.out.println("Number is a negative number");
    }
    public void handle(NotInRangeException nire){
        System.out.println("Number not in range of 0 - 100.");
    }
}

