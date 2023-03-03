package behavioural_patterns.command_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class LightOffCommand extends Command{
    private final Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.offLights();
    }
}
