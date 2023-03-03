package behavioural_patterns.command_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class CommandPattern {
	/**
     * 
     * @param args
     * @return null
     */
	public static void main(String[] args) {
		ButtonPanel panel = new ButtonPanel();
		Door door = new Door();
		Light light = new Light();

		DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);
		DoorCloseCommand doorCloseCommand = new DoorCloseCommand(door);
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);


		panel.assignCommand(0, doorOpenCommand);
		panel.assignCommand(1, doorCloseCommand);
		panel.assignCommand(2,lightOnCommand);
		panel.assignCommand(3,lightOffCommand);

		panel.executeCommand(0);
		panel.executeCommand(1);
		panel.executeCommand(2);

		panel.executeCommand(4);
	}
}

// The inner implementation part is abstracted from the user.