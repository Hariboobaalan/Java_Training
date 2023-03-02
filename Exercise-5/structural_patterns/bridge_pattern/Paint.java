package structural_patterns.bridge_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public abstract class Paint {
    Color color;
    Paint(Color color){
        this.color = color;
    }
    public abstract void type();
}
