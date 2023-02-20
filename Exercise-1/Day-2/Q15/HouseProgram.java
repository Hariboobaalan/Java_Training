package Q15;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * Door is a class that has a static variable called doorCost.
 */
class Door{
    static int doorCost;
}

/**
 * A Window is a class that has a static variable called windowCost.
 */
class Window{
    static int windowCost;
}

/**
 * The class House has two objects of class Door and Window. It also has two integer variables noOfDoor
 * and noOfWindows. It has two methods calculateCost and displayCost
 */
class House{
    Door door1 = new Door();
    Window window1 = new Window();
    int noOfDoor = 2;
    int noOfWindows = 7;

    /**
     * 
     * @param totalDoorCost
     * @param totalWindowCost
     */
    public void calculateCost(int totalDoorCost, int totalWindowCost){
        door1.doorCost = totalDoorCost/noOfDoor;
        window1.windowCost = totalWindowCost/noOfWindows;
    }

    public void displayCost(){
        System.out.println("Door cost = "+door1.doorCost);
        System.out.println("Window cost = "+window1.windowCost);
    }
}

public class HouseProgram {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        House home1 = new House();
        home1.calculateCost(100,70);
        home1.displayCost();
    }
}