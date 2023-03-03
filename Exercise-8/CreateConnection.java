package exercise8;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.sql.*;

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