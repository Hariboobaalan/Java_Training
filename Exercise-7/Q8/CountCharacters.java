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

        int count = 0;
        try{
            Scanner scanner = new Scanner(System.in);

            // Checking if there is a next input, and adding the length of the input to the count variable.
            while (scanner.hasNext()) {
                count += scanner.next().length();
            }
            scanner.close();
        }finally{
            System.out.println("Number of characters entered = "+count);
        }
    }
}