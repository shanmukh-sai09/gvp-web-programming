import java.sql.*;
import java.util.*;

public class DeleteData {
    public static void main(String[] args) throws Exception {
        DBConnection.loadDriver();
        Connection conn = DBConnection.connect();
        Statement st = conn.createStatement();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = sc.nextLine();

        String query = "delete from users where username = '" + username + "'";
        int value = st.executeUpdate(query);

        if(value > 0) {
            System.out.println("user deleted");
        } else {
            System.out.println("user not deleted");
        }

        sc.close();
        st.close();
        conn.close();
    }
}
