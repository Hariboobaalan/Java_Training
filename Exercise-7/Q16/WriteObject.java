package Q16;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class WriteObject {
    static String filePath;

    public static void writeObject(Date dateObject) throws Exception {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(dateObject);
        }
    }
}