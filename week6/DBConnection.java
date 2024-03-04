import java.sql.*;

public class DBConnection {
    static Class loadDriver() throws ClassNotFoundException {
        return Class.forName("oracle.jdbc.driver.OracleDriver");
    }

    static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "tiger");
    }
}