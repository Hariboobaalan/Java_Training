package behavioural_patterns.command_pattern;

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
