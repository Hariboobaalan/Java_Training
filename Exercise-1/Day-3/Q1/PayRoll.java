package Q1;

/** @author Hariboobaalan
 *  @version 1.0
 */

// Declaring an interface called Employee.
interface Employee {
    public void displaySalary();
}

// creating interface Sales Extending the Employee interface.
interface Sales extends Employee{
    default void displayRole(){
        System.out.println("Sales Role");
    }
}

// Extending the Employee interface.
interface Prod extends Employee{
    default void displayRole(){
        System.out.println("Production Role");
    }
}

/**
 * SalesPerson has a role of Sales.
 */
class SalesPerson implements Sales{
    @Override
    public void displaySalary(){
        System.out.println("750");
    }
}

/**
 * SalesManager is a Sales
 */
class SalesManager implements Sales{
    @Override
    public void displaySalary(){
        System.out.println("1000");
    }
}

/**
 * SalesTerritoryManager has a role of Sales.
 */
class SalesTerritoryManager implements Sales{
    @Override
    public void displaySalary(){
        System.out.println("2000");
    }
}

/**
 * Worker is a class that implements the Prod interface.
 */
class Worker implements Prod{
    @Override
    public void displaySalary(){
        System.out.println("1000");
    }
}

/**
 * The PayRoll class creates instances of the SalesPerson, SalesManager, SalesTerritoryManager, and
 * Worker classes and calls the displayRole() and displaySalary() methods on each of them
 */
public class PayRoll{
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        SalesPerson sp1 = new SalesPerson();
        sp1.displayRole();
        sp1.displaySalary();
        SalesManager sm1 = new SalesManager();
        sm1.displayRole();
        sm1.displaySalary();
        SalesTerritoryManager stm1 = new SalesTerritoryManager();
        stm1.displayRole();
        stm1.displaySalary();
        Worker w1 = new Worker();
        w1.displayRole();
        w1.displaySalary();
    }
}