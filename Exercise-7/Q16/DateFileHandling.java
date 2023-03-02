package Q16;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.util.Date;

public class DateFileHandling {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) throws Exception {
        // Creating a new Date object.
        Date todayDate = new Date();

        // Set the file path for Writing Object and Reading Object
        WriteObject.filePath = "./Q16/objectFile.txt";
        ReadObject.filePath = "./Q16/objectFile.txt";

        // Write Object to the destination file.
        WriteObject.writeObject(todayDate);
        System.out.println("Objects successfully written to .txt file");
        
        // Read object from the file
        System.out.println("Reading Objects from .txt file");
        ReadObject.readObject();
    }
}