package behavioural_patterns.visitor_pattern;

public class Brick implements HousePart{
    @Override
    public void accept(HousePartVisitor housePartVisitor) {
        housePartVisitor.visit(this);
    }
}
