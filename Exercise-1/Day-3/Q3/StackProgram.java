package Q3;
/** @author Hariboobaalan
 *  @version 1.0
 */

import Q4.Stack;
import Q4.StackInterface;


// Defining a class FixedStack that implements Stack
class FixedStack extends Stack{

    FixedStack(int size) {
        super(size);
        //TODO Auto-generated constructor stub
    }
}

//  Defining a class DynamicStack that implements Stack
class DynamicStack implements StackInterface{
    private int top;
    private int[] stack;
    private int capacity;
    DynamicStack(int size){
        this.capacity=size;
        this.stack = new int[size];
        this.top=-1;
    }
    @Override
    public int pop() {
        if(this.top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return this.stack[this.top--];
    }

    @Override
    public void push(int x) {
        if(this.capacity-1 == this.top){
            System.out.println("Stack overflow");
            int[] newStack = new int[2*this.stack.length];
            for(int i=0;i<=this.top;i++){
                newStack[i]=this.stack[i];
            }
            this.stack = newStack;
        }
        this.stack[++top]=x;
    }

    public void display(){
        for(int i=0;i<=top;i++){
            System.out.print(this.stack[i]+" ");
        }
        System.out.println();
    }
}

public class StackProgram {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Fixed stack");
        FixedStack fStack = new FixedStack(3);
        fStack.push(5);
        fStack.push(10);
        fStack.push(20);
        fStack.pop();
        fStack.display();

        System.out.println("Dynamic stack");
        DynamicStack dStack = new DynamicStack(3);
        dStack.push(10);
        dStack.push(20);
        dStack.push((30));
        dStack.push(40);
        dStack.display();
        dStack.pop();
        dStack.display();


    }
}
