package structural_patterns.bridge_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */
public class BridgePattern {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        Paint myPaint1 = new AcrylicPaint(new RedColor());
        Paint myPaint2 = new WaterPaint(new BlueColor());
        myPaint1.type();
        myPaint2.type();
    }
}