package Q11;

import java.io.File;

/** @author Hariboobaalan
 *  @version 1.0
 */


public class ListDirectoryAndFile {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {

        // Creating a new file object with the name of the first argument.
        File fileObject = new File(args[0]);

        // Check whether the directory is a object.
        if (fileObject.isDirectory()) {
            for (String fileName : fileObject.list()) {
                System.out.println(fileName);
            }
        }
    }
}