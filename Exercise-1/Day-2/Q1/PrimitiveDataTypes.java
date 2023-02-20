package Q1;
import java.util.Arrays;

/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */
class Balloon{
    String color = "Red";
}

public class PrimitiveDataTypes {
    /**
     * 
     * @param args
     * @return null
     */
    
    public static void main(String[] args) {
        
        
        int num = 10;
        System.out.println("Primitive num ="+num);
        passByValue(num);
        
        int[] array = {1,2,3,4,5};
        System.out.println("Array before passing = "+Arrays.toString(array));
        passByReference(array);
        
        
        Balloon b = new Balloon();
        System.out.println("Balloon current color = "+b.color);
        changeColor(b);
        System.out.println("Balloon new color = "+b.color);
    }


    public static void passByValue(int a){
        a=20;
        System.out.println("Primitive num in method = "+a);
    }
    
    
    public static void passByReference(int[] array){
        array[0]=99;
        System.out.println("Array "+Arrays.toString(array));
    }
    
    
    public static void changeColor(Balloon b){
        b.color = "Blue";
    }
}