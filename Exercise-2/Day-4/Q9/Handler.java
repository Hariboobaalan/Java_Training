package Q9;

abstract class HandlerAbstract {
    public abstract void handle(NegativeNumberException ne);
    public abstract void handle(NotInRangeException nire);
}

public class Handler extends HandlerAbstract{
    public void handle(NegativeNumberException ne){
        System.out.println("Number is a negative number");
    }
    public void handle(NotInRangeException nire){
        System.out.println("Number not in range of 0 - 100.");
    }
}

