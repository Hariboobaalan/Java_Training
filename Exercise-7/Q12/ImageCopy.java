package Q12;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) throws Exception {

        // Read the image using FileInputStream
        try (
                FileInputStream inputStream = new FileInputStream("./Q12/image.png");
                FileOutputStream outputStream = new FileOutputStream("./Q12/imageCopy.png");) {
            int EOF;

            // a byte array as buffer to store the input stream bytes.
            byte[] buffer = new byte[1024];

            // Copy the image as bytes from source to destination
            while ((EOF = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer);
            }
            System.out.println("Image Copied Successfully");
        }
    }
}