import java.util.Scanner;

public class Q5 {
    static void average(int n){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=sc.nextInt();
        }
        System.out.println(sum/n);
        sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        average(n);
    }
}
