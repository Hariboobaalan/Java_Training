package creational_patterns.factory_pattern;

public class PhoneFactory{
    public Phone purchasePhone(String phoneType){
        if(phoneType.equals("IPhone")){
            return new IPhone();
        }
        else if(phoneType.equals("Android")){
            return new Android();
        }
        else{
            return null;
        }
    }
}