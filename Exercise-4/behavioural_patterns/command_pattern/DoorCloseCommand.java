package behavioural_patterns.command_pattern;

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
