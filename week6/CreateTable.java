import java.sql.*;

public class CreateTable {
    public static void main(String args[]) throws Exception {
        DBConnection.loadDriver();
        Connection conn = DBConnection.connect();
        System.out.println("Connection establish");

        Statement st = conn.createStatement();
        int value = st.executeUpdate("create table users(username varchar2(20), email varchar2(30), mobile number(10), dob date)");
        if(value == 0) {
            System.out.println("table created...");
        } else {
            System.out.println("table not created");
        }
    }
}
