package exercise8;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.sql.*;

public class InsertValues{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Creating a connection to the database.
        Connection connection = JDBCConnector.makeConnection();
        try{
            Statement statement = connection.createStatement();

            // Inserting values into the table pradeep.
            int query1Flag = statement.executeUpdate("insert into pradeep values(001,'Ram',12)");
            int query2Flag = statement.executeUpdate("insert into pradeep values(002,'Ravi',16)");
            int query3Flag = statement.executeUpdate("insert into pradeep values(003,'Raghu',21)");
            System.out.println("Query1 = "+query1Flag);
            System.out.println("Query2 = "+query2Flag);
            System.out.println("Query3 = "+query3Flag);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}