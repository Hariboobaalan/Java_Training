package structural_patterns.bridge_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class WaterPaint extends Paint {
    WaterPaint(Color color) {
        super(color);
    }

    @Override
    public void type() {
        super.color.doColor();
        System.out.println("Water Paint");
    }
}