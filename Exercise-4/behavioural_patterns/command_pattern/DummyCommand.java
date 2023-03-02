package behavioural_patterns.command_pattern;

public class DummyCommand extends Command {
	@Override
	public void execute() {
		System.out.println("This is a Dummy Slot");
	}
}