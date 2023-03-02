package structural_patterns.bridge_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class AcrylicPaint extends Paint{
    AcrylicPaint(Color color) {
        super(color);
    }

    @Override
    public void type() {
        super.color.doColor();
        System.out.println("Acrylic Paint");
    }
}
