package behavioural_patterns.command_pattern;

public class LightOnCommand extends Command{
    private final Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.onLights();
    }
}
