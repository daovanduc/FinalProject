package FinalProect.Test.TestPro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    private static String DB_URL = "jdbc:postgresql://127.0.0.1:5432/Foods";
    private static String USER_NAME = "postgres";
    private static String PASSWORD = "Duc12345";

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(DB_URL,
                    USER_NAME, PASSWORD);
           Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM foods.\"VietNam\"");
            rs.absolute(1);
            System.out.println(rs.getInt(1) + " :: " + rs.getString(2)
                   + " :: " + rs.getInt(3));
            conn.close();
        } catch (Exception ex) {
            System.out.println("Connect failure!");
            ex.printStackTrace();
        }
    }
}