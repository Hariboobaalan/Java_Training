package Q4;

public class OwnException {
    public static void main(String[] args) throws Exception{
        try{
            MyException myException = new MyException();
            myException.throwMyException();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
