package behavioural_patterns.command_pattern;

public class ButtonPanel {
	Command commands[] = new Command[5];

	public ButtonPanel() {
		for (int i = 0; i < 5; i++) {
			commands[i] = new DummyCommand();
		}
	}

	public void executeCommand(int slot) {
		commands[slot].execute();
	}

	public void assignCommand(int slot, Command command) {
		commands[slot] = command;
	}
}