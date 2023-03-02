package behavioural_patterns.strategy_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class CompanyContext{
    private CompanyStrategy companyStrategyObject;

    CompanyContext(CompanyStrategy compStrategy){
        this.companyStrategyObject = compStrategy;
    }

    public void displayRating(){
        this.companyStrategyObject.displayName();
        System.out.println(" has Good Rating");
    }
}