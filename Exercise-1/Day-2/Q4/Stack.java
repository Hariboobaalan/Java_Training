package Q4;

// Defining a class FixedStack that implements Stack
public class Stack implements StackInterface{
    int top;
    int[] stack;
    protected Stack(int size){
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
        for(int i=0;i<=top;i++){
            System.out.print(this.stack[i]+" ");
        }
        System.out.println();
    }
}
