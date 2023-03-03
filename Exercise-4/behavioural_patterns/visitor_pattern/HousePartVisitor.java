package behavioural_patterns.visitor_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public interface HousePartVisitor {
    public void visit(House house);
    public void visit(Brick brick);
    public void visit(Cement cement);
    public void visit(Sand sand);
}

// Eg: This HousePart visitor is literally like a Civil Engineer.
// who has contact to Cement, Brick & Sand supplies.