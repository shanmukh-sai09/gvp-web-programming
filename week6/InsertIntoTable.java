import java.sql.*;
import java.util.*;

public class InsertIntoTable {
    public static void main(String args[]) throws Exception {
        DBConnection.loadDriver();
        Connection conn = DBConnection.connect();
        Statement st = conn.createStatement();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter mobile: ");
        long mobile = sc.nextLong();  
        System.out.println("Enter DOB: ");
        String dob = sc.next();
        
        sc.close();

        String query = "insert into users values('" + username + "', '" + email + "', " + mobile + ", ' " + dob + "')";
        int value = st.executeUpdate(query);
        
        if(value >= 0) {
            System.out.println("row inserted");
        } else {
            System.out.println("row not inserted");
        }

        st.close();
        conn.close();
    }
}
