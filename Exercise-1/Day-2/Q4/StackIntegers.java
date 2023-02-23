package Q4;
import java.util.Scanner;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

public class StackIntegers {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack stack = new Stack(N);
        for(int i=0;i<N;i++){
            stack.push(sc.nextInt());
        }
        stack.display();
        System.out.println("Popped element = "+ stack.pop());
        System.out.println("Popped element = "+ stack.pop());
        stack.display();
        sc.close();
    }
}
