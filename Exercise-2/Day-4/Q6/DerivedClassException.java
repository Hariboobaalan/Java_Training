package Q6;

class BaseClass{
    BaseClass() throws Exception{
        throw new Exception();
    }
}

class DerivedClass extends BaseClass{
    DerivedClass() throws Exception{
        try{
            
        }
        catch(Exception e){
            System.out.println("Hi");
        }
    }
}

public class DerivedClassException {
    public static void main(String[] args) {
        DerivedClass derClass = new DerivedClass();
    }   
}