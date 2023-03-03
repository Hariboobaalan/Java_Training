package behavioural_patterns.command_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class DoorCloseCommand extends Command{
    private final Door door;
    public DoorCloseCommand(Door door){
        this.door = door;
    }
    @Override
    public void execute() {
        door.closeDoors();
    }

}
