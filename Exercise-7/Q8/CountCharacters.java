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
        Scanner scanner = new Scanner(System.in);
        try{

            // Checking if there is a next input, and adding the length of the input to the count variable.
            while (scanner.hasNext()) {
                count += scanner.next().length();
            }
        }finally{
            System.out.println("Number of characters entered = "+count);
            scanner.close();
        }
    }
}