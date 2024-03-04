import java.sql.*;

public class UpdateData {
    public static void main(String[] args) throws Exception {
        DBConnection.loadDriver();
        Connection conn = DBConnection.connect();
        Statement st = conn.createStatement();

        String query = "update users set mobile = '9878986756' where username = 'xyz'";
        int value = st.executeUpdate(query);
        if(value >= 0) {
            System.out.println("row updated");
        } else {
            System.out.println("row not updated");
        }

        st.close();
        conn.close();
    }
}
