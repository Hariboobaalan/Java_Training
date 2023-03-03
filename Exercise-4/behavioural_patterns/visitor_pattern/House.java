package behavioural_patterns.visitor_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class House implements HousePart{

    HousePart[] houseComponents;

    public House(){
        houseComponents=new HousePart[] {new Brick(),new Sand(),new Cement()};
    }

    @Override
    public void accept(HousePartVisitor housePartVisitor) {
        for(HousePart hPart: houseComponents){
            hPart.accept(housePartVisitor);
        }
        housePartVisitor.visit(this);
    }
}
