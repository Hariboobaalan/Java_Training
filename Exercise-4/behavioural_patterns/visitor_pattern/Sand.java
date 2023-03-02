package behavioural_patterns.visitor_pattern;

public class Sand implements HousePart{
    @Override
    public void accept(HousePartVisitor housePartVisitor) {
        housePartVisitor.visit(this);
    }
}
