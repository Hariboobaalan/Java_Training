package behavioural_patterns.strategy_pattern;

public class StrategyPattern {
    public static void main(String[] args) {
        CompanyContext goodCompany = new CompanyContext(new Sirius());
        goodCompany.displayRating();
    }
}

// modularity
// Remove If-Else
//Define a family of algorithms, and encapsulate them 
//Strategy lets the algorithm vary independently from clients that use it.
// Open Close principle is achieved.