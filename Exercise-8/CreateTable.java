package exercise8;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.sql.*;

public class CreateTable{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Creating a connection to the database.
        Connection connection = JDBCConnector.makeConnection();
        try{
            Statement statement = connection.createStatement();
            int query1Flag = statement.executeUpdate("create table pradeep(empno int, name varchar(20), deptno int)");
            System.out.println(query1Flag);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}