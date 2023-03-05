package exercise8;

import java.sql.Connection;
import java.sql.DriverManager;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class JDBCConnector {
    static Connection connection=null;
    public static Connection makeConnection() {
        try {
            // Loading the driver class.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connecting to the database.
            connection = DriverManager.getConnection("jdbc:mysql://localhost/exercise8", "root", "rootroot");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}