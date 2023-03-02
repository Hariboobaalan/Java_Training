package behavioural_patterns.strategy_pattern;

public interface CompanyStrategy{
    public void displayName();
}

class Sirius implements CompanyStrategy{
    @Override
    public void displayName() {
        System.out.println("Sirius - a CDW Company");
    }
}

class Zoho implements CompanyStrategy{
    @Override
    public void displayName() {
        System.out.println("ZOHO Company");
    }
}

class Amazon implements CompanyStrategy{
    @Override
    public void displayName() {
        System.out.println("Amazon Company");
    }
}
