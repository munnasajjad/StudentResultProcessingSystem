/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRPSystem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rasel
 */
public class TestCon {

    Connection connection = null;
    String driverName = "com.mysql.jdbc.Driver";
    static String URL = "jdbc:mysql://localhost:3306/StudentResult";
    static String USER = "root";
    static String PASSWORD = "";

    public TestCon() {
    }

    public Connection doConnection() throws ClassNotFoundException, SQLException {

        Class.forName(driverName);
        connection = DriverManager.getConnection(URL, USER, PASSWORD);

        return connection;
    }
}
