import java.util.Scanner;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class CountCharacters {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        // Checking if there is a next input, and adding the length of the input to the count variable.
        while (scanner.hasNext()) {
            count += scanner.next().length();
        }
        System.out.println("Display the count");
        System.out.println(count);
        scanner.close();
    }
}