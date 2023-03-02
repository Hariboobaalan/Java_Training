package Q15;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileCopy {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) throws Exception {

        // read the file line by line using BufferedReader and write it to destination file using PrintWriter.
        try (
                BufferedReader fileReader = new BufferedReader(new FileReader("./Q15/test.txt"));
                PrintWriter fileWriter = new PrintWriter(new FileWriter("./Q15/MyNewFile.txt"));) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                fileWriter.write(line);
            }
            System.out.println("File Copied Successfully");
        }
    }
}