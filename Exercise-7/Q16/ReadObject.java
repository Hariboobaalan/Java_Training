package Q16;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class ReadObject {
    
    static String filePath;

    public static void readObject() throws Exception {
        try (FileInputStream inputStream = new FileInputStream(filePath);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            
                    
            Date dateObject = (Date) objectInputStream.readObject();
            
            System.out.println("The read date object is = "+dateObject);
        }
    }
}