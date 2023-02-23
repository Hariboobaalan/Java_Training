package Q7;

import java.util.Scanner;

class Number{
    public static boolean isNumber(String numberString){
            try{
                Integer.parseInt(numberString);
                return true;
            }catch(Exception e){
                return false;
            }
    }
}

class Result{
    public void calculateResult(String numerator,String divisor) throws NumberExceptions{
        if(!Number.isNumber(numerator)){
            throw new NonIntegerException("Input is Not a Integer");
        }
        else if(divisor.equals("0")){
            throw new DivideByZeroException("Division by zero or poor Input");
        }
        System.out.println("Result = "+Integer.parseInt(numerator)/Integer.parseInt(divisor));
    }
}

public class ArithmeticExceptionSample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String numerator,divisor;
        Result result = new Result();
        while(true){
            try{
                System.out.println("Enter numerator value:");
                numerator = scan.next();
                if(numerator.equals("q") || numerator.equals("Q")){
                    System.exit(0);
                }
                System.out.println("Enter divisor value:");
                divisor = scan.next();
                result.calculateResult(numerator,divisor);
            }
            catch(NumberExceptions ne){
                ne.handlerCall();
            }
        }
    }
}