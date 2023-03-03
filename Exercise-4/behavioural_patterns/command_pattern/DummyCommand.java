package behavioural_patterns.command_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class DummyCommand extends Command {
	@Override
	public void execute() {
		System.out.println("This is a Dummy Slot");
	}
}