package Q10;

import java.io.File;

/** @author Hariboobaalan
 *  @version 1.0
 */


public class FileHandling {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) throws Exception {

        // Creating a input/source file object called sourceFile.
        File sourceFile = new File("./Q10/test.txt");

        // Creating a destination file object called destFile.
        File destFile = new File("./Q10/myNewFile.txt");


        // Flag to decide whether the file has been renamed or not.
        boolean flag = sourceFile.renameTo(destFile);

        // If flag is true, then file is renamed, else rename is Unsuccessful.
        if (flag) {
            System.out.println("The File is renamed successfully");
        } else {
            System.out.println("Rename Unsuccessful");
        }

        System.out.println("Size of the file = " + destFile.length());

        // flag to check the file has been deleted or not.
        // flag = destFile.delete();

        // If flag is true, then file is deleted, else delete is Unsuccessful.
        if (flag) {
            System.out.println("File deleted Successfully");
        } else {
            System.out.println("File Deletion Unsuccessful");
        }
    }
}