package exercise8;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

/** @author Hariboobaalan
 *  @version 1.0
 */


public class CreateConnection {
    /**
     * @param args
     */
    public static void main(String[] args) {


        // Creating a connection to the database.
        Connection connection = JDBCConnector.makeConnection();
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from pradeep;");

            // Iterating through the result set and printing the result.
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" | "+resultSet.getString(2)+" | "+resultSet.getInt(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}