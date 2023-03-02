package behavioural_patterns.visitor_pattern;

public class VisitorPattern {
    public static void main(String[] args) {
        HousePart house = new House();
        house.accept(new HousePartSupplierVisitor());
    }
}


/*
 * Visitor lets you define a new operation without changing the classes of the elements on which it operates.
 * It is to define a new operation without introducing the modifications to an existing object structure.
 */