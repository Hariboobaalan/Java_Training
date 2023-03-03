package behavioural_patterns.memento_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */
// Import required packages.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MementoPattern {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) throws Exception {

        // Create new Player object
        Player myPlayer = new Player();
        System.out.println("Life Remaining = "+myPlayer.life);

        // Save the state of the Player object
        new WriteObject().saveState(myPlayer);

        while(myPlayer.life>=0){
            myPlayer.gotAttacked();
        }
        System.out.println("Life Remaining = "+myPlayer.life);
        

        //restore the state of the object 
        myPlayer = (new ReadObject()).restoreState();        
        System.out.println("Life Remaining = "+myPlayer.life);
    }
}

class Player implements Serializable {
    int life = 5;
    public void gotAttacked() {
        System.out.println("Player Life reduced...");
        this.life-=1;
    }
}

// Class with a Method to write the object to a file
class WriteObject {
    public void saveState(Player myPlayer) throws Exception {
        System.out.println("Saving State...");
        try(ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("./behavioural_patterns/memento_pattern/gamestat.dat"))){
            outStream.writeObject(myPlayer);
        }
    }
}


// Class with a Method to read the object from a file
class ReadObject {
    public Player restoreState() throws Exception {
        System.out.println("Got respawn ... Restoring HealthState...");
        try(ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("./behavioural_patterns/memento_pattern/gamestat.dat"))){
            return (Player) inStream.readObject();
        }
    }
}


// Serialization is the process of converting an object into a stream of bytes to store the object or transmit it through network, a database, or a file. 
//Its main purpose is to save the state of an object in order to be able to recreate it when needed. 
//The reverse process is called deserialization.