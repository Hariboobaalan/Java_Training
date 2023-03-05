package Q14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** @author Hariboobaalan
 *  @version 1.0
 */


public class FileCopier {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) throws IOException {

        // read the file char by char and write it to destination file.
        try (
                FileReader fileReader = new FileReader("./Q14/test.txt");
                FileWriter fileWriter = new FileWriter("./Q14/MyNewFile.txt");) {
            int EOF;
            while ((EOF = fileReader.read()) != -1) {
                fileWriter.write(EOF);
            }
            System.out.println("File Copied Successfully");
        }
    }
}
