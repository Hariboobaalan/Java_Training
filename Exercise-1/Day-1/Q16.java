import java.util.Scanner;

public class Q16 {
    static void getIndicesAndCount(int[] array, int n){
        int count=0;
        System.out.println("Indices of "+n);
        for(int i=0;i<array.length;i++){
            if(array[i]==n){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\nCount of "+n+" = "+count);

    }
    public static void main(String[] args) {
        int[] array = {2,1,0,2,2,2,5,6,7,8,2,9,2};
        Scanner sc = new Scanner(System.in);
        int n = 2;
        getIndicesAndCount(array,n);
        sc.close();
    }
}
