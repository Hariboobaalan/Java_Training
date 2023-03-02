package behavioural_patterns.visitor_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public interface HousePart {
    public void accept(HousePartVisitor housePartVisitor);
}
