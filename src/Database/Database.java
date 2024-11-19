
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String SERVER_NAME = "DESKTOP-ORLB431\\SQLEXPRESS";
    private static final String PORT = "1433";
    private static final String DATABASE_NAME = "QLTV";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123456";

    
    public static Connection getConnection() {
        Connection connection = null;

        try {
            String jdbcUrl = "jdbc:sqlserver://" + SERVER_NAME + ":" + PORT + ";database=" + DATABASE_NAME
                    + ";encrypt=true;trustServerCertificate=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            connection = DriverManager.getConnection(jdbcUrl, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } 
}
