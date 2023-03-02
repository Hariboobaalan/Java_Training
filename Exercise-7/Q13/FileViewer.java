package Q13;

/** @author Hariboobaalan
 *  @version 1.0
 */
import java.io.FileInputStream;
import java.io.FileReader;

public class FileViewer {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) throws Exception {
        System.out.println("FileViewer using FileInputStream ...");

        // Read the File using FileInputStream
        try (
                FileInputStream inputStream = new FileInputStream("./Q13/test.txt");) {
            int reading;
            
            // a byte array as buffer to store the input stream bytes.
            byte[] readArray = new byte[128];

            // read the file as bytes and convert to string and display it.
            while ((reading = inputStream.read(readArray)) != -1) {
                String content = new String(readArray, 0, reading);
                System.out.println(content);
            }
        }

        System.out.println("FileViewer using FileReader ...");

        // Read the File using FileInputStream
        try (
                FileReader inputStream = new FileReader("./Q13/test.txt");) {
            int reading;

            // a char array as buffer to store the input stream chars.
            char[] readArray = new char[128];

            // read the file and convert to string and display it.
            while ((reading = inputStream.read(readArray)) != -1) {
                String content = new String(readArray, 0, reading);
                System.out.println(content);
            }
        }
    }
}