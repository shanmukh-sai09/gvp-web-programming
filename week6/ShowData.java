import java.sql.*;
import java.util.*;

public class ShowData {
    public static void main(String[] args) throws Exception {
       DBConnection.loadDriver();
       Connection conn = DBConnection.connect();
       Statement st = conn.createStatement();
       
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter table name: ");
       String tableName = sc.nextLine();

       String query = "select * from " + tableName;
       ResultSet result = st.executeQuery(query);
       ResultSetMetaData meta = result.getMetaData();

       int numberOfColumns = meta.getColumnCount();
       for(int i = 1; i <= numberOfColumns; i++) {
            System.out.print(meta.getColumnName(i) + "\t");
       }
       System.out.println();

       while (result.next()) {
            for(int i = 1; i <= numberOfColumns; i++) {
                System.out.print(result.getString(i) + "\t");
            }
            System.out.println();
       }

       sc.close();
       st.close();
       conn.close();
    }
}