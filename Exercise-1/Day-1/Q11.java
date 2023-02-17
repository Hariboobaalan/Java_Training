public class Q11 {
    static void displayNumberMatrix(){
        int num=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        displayNumberMatrix(); 
    }
}

// ! 2D array?