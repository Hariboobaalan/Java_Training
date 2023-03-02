package behavioural_patterns.command_pattern;

public class DoorOpenCommand extends Command{
    private final Door door;
    public DoorOpenCommand(Door door){
        this.door = door;
    }
    @Override
    public void execute() {
        door.openDoors();
    }
    
}
