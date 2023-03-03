package exercise8;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.sql.*;

public class InsertAndDisplay{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Creating a connection to the database.
        Connection connection = JDBCConnector.makeConnection();
        try{
            Statement statement = connection.createStatement();
            int query1Flag = statement.executeUpdate("insert into pradeep values(001,'Ram',12)");
            int query2Flag = statement.executeUpdate("insert into pradeep values(002,'Ravi',16)");
            int query3Flag = statement.executeUpdate("insert into pradeep values(003,'Raghu',21)");
            
            System.out.println("Query1 = "+query1Flag);
            System.out.println("Query2 = "+query2Flag);
            System.out.println("Query3 = "+query3Flag);

            // Executing the query and storing the result in the resultSet object.
            ResultSet resultSet = statement.executeQuery("select * from pradeep");

            // Iterating through the result set and printing the values.
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) +" | "+resultSet.getString(2)+" | "+resultSet.getInt(3));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}