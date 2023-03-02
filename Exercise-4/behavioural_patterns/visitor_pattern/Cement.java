package behavioural_patterns.visitor_pattern;

public class Cement implements HousePart{
    @Override
    public void accept(HousePartVisitor housePartVisitor) {
        housePartVisitor.visit(this);
    }
}
