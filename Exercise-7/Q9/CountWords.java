package Q9;

import java.util.Scanner;

/** @author Hariboobaalan
 *  @version 1.0
 */


public class CountWords {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        // Checking if there is a next input, if there is a next input then increment the count by 1.
        while (scanner.hasNext()) {
            scanner.next();
            count += 1;
        }
        // Display the count.
        System.out.println(count);
        scanner.close();

    }
}