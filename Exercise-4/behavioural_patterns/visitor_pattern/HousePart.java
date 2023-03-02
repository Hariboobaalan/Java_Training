package behavioural_patterns.visitor_pattern;

public interface HousePart {
    public void accept(HousePartVisitor housePartVisitor);
}
