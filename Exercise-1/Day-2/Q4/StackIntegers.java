package Q4;

import java.util.Scanner;
import java.util.Stack;


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
        
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            stack.add(sc.nextInt());
        }
        System.out.println(stack);
        sc.close();
    }
}
