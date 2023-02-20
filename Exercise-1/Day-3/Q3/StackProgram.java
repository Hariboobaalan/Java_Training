package Q3;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.util.Arrays;

// Defining the interface Stack.
interface Stack{
    public void push(int x);
    public int pop();
}

// Defining a class FixedStack that implements Stack
class FixedStack implements Stack{
    private int top;
    private int[] stack;
    FixedStack(int size){
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
        if(((this.stack).length)-1 == this.top){
            System.out.println("Stack overflow");
            return;
        }
        this.stack[++top]=x;
    }

    public void display(){
        System.out.println(Arrays.toString(this.stack));
    }
}

//  Defining a class DynamicStack that implements Stack
class DynamicStack implements Stack{
    private int top;
    private int[] stack;
    DynamicStack(int size){
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
        if(((this.stack).length)-1 == this.top){
            System.out.println("Stack overflow");
            int[] newStack = new int[2*this.stack.length];
            for(int i=0;i<this.top;i++){
                newStack[i]=this.stack[i];
            }
            this.stack = newStack;
        }
        this.stack[++top]=x;
    }

    public void display(){
        System.out.println(Arrays.toString(this.stack));
    }
}

public class StackProgram {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        FixedStack fStack = new FixedStack(3);
        fStack.push(5);
        fStack.push(10);
        fStack.pop();
        fStack.display();

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
