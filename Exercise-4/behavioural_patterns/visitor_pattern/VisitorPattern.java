package behavioural_patterns.visitor_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class VisitorPattern {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        HousePart house = new House();
        house.accept(new HousePartSupplierVisitor());
    }
}


/*
 * Visitor lets you define a new operation without changing the classes of the elements on which it operates.
 * It is to define a new operation without introducing the modifications to an existing object structure.
 */