import java.util.Arrays;
import java.util.Scanner;
/*
 * @a
 */
public class Q6 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int newSize = scanner.nextInt();
        int[] newArray = Arrays.copyOf(array, newSize);
        System.out.println(Arrays.toString(newArray));
        scanner.close();
    }
}
