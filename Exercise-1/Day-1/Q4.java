import java.util.Scanner;

public class Q4 {
    static boolean isPrime(int n){
        for(int i=2;i<n/2+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();
        System.out.println(isPrime(num)?"It is a Prime Number":"It is not a Prime Number");
        scanner.close();
    }
}
