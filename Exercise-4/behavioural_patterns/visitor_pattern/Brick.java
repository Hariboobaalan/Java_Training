package behavioural_patterns.visitor_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class Brick implements HousePart{
    @Override
    public void accept(HousePartVisitor housePartVisitor) {
        housePartVisitor.visit(this);
    }
}
