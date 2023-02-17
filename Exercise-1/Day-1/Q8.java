import java.util.Scanner;

public class Q8 {
    static int getIndex(int[] array, int n){
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {2,5,4,1,6,3,9,7,8,0};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Index = "+getIndex(array,n));
        sc.close();
    }
}
