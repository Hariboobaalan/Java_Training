package behavioural_patterns.visitor_pattern;

public class HousePartSupplierVisitor implements HousePartVisitor{
    @Override
    public void visit(Brick brick) {
        System.out.println("Brick Supply");
    }
    @Override
    public void visit(Cement cement) {
        System.out.println("Cement Supply");
    }
    @Override
    public void visit(Sand sand) {
        System.out.println("Sand Supply");
    }
    @Override
    public void visit(House house) {
        System.out.println("Display House");
    }
}
