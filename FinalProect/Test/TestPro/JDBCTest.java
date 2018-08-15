package FinalProect.Test.TestPro;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class JDBCTest {
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String JDBC_DATABASE_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DATABASE_NAME = "Foods";
    private static final String JDBC_URL = JDBC_DATABASE_URL + DATABASE_NAME;
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "Duc12345";

    public static User[] selectAllUsers(){
        List<User> users = new ArrayList<User>();


        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT *  FROM foods.\"VietNam\"" );
            while (rs.next()) {
                User user = new User();


                user.setID(rs.getInt("ID"));
                user.setName(rs.getString("Name"));
                user.setPrice(rs.getString("Price"));
                users.add(user);
                System.out.println(user);
            }
            JFrame frame = new JFrame();
            frame.setSize(500,350);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            JTable table;


            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException se) {
            System.err.println(se.getMessage());
        }
        User[]usersArray = new User[users.size()];
        return usersArray;
    }


    private static Connection getConnection()
    {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(JDBC_URL, DATABASE_USER, DATABASE_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(2);
        }
        return conn;
    }

    public static void main(String[] args) {
        selectAllUsers();


    }



    /*public static User PhoGa() {
        User user = new User();


        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT *  FROM foods.\"VietNam\" WHERE \"ID\" = 1" );
            while (rs.next()) {

                user.setID(rs.getInt("ID"));
                user.setName(rs.getString("Name"));
                user.setPrice(rs.getString("Price"));
                System.out.println(user.getID());
                System.out.println(user.getName());
                System.out.println(user.getPrice());
            }

            rs.close();
            statement.close();
            connection.close();
        } catch (SQLException se) {
            System.err.println(se.getMessage());
        }
        return user ;
    }
        private static Connection getConnection()
        {
            Connection conn = null;
            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(JDBC_URL, DATABASE_USER, DATABASE_PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                System.exit(1);
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(2);
            }
            return conn;
        }

    public static void main(String[] args) {
        PhoGa();
    }
    */

}




