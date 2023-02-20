package Q3;
import java.util.Date;


/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * Employee is a class that has a Date object as a member variable.
 */
class Employee{
    Date doj;
    Employee(){
        this.doj = new Date();
    }
}

/**
 * Worker is a type of Employee.
 */
class Worker extends Employee{

}

/**
 * A SalesPerson is an Employee.
 */
class SalesPerson extends Employee{

}

/**
 * A SalesManager is an Employee.
 */
class SalesManager extends Employee{

}

/**
 * A SalesTerritoryManager is a SalesManager.
 */
class SalesTerritoryManager extends SalesManager{

}

public class PayRoll {
    /**
     * 
     * @param args
     * @return null
     */

    public static void main(String[] args) {

        // Creating a new object of type Worker.
        Worker worker1 = new Worker();
        SalesPerson salesperson1 = new SalesPerson();
        SalesManager salesManager1 = new SalesManager();
        SalesTerritoryManager salesTerritoryManager1 = new SalesTerritoryManager();
        System.out.println("Worker1 DOJ = "+ worker1.doj);
        System.out.println("SalesPerson1 DOJ = "+ salesperson1.doj);
        System.out.println("SalesManager1 DOJ = "+ salesManager1.doj);
        System.out.println("SalesTerritoryManager1 DOJ = "+ salesTerritoryManager1.doj);
    }
}