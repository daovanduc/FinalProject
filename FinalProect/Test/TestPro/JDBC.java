package FinalProect.Test.TestPro;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Vector;

public class JDBC {
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String JDBC_DATABASE_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DATABASE_NAME = "Foods";
    private static final String JDBC_URL = JDBC_DATABASE_URL + DATABASE_NAME;
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "Duc12345";

    public JDBC() {
        Connection connection = null;
        ResultSet rs = null;
        Statement statement = null;
        try{
            connection = getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT *  FROM foods.\"VietNam\"" );
            ResultSetMetaData rsmt = rs.getMetaData();
            int c = rsmt.getColumnCount();
            Vector column = new Vector(c);
            for(int i = 1;i<=c; i++){
                column.add(rsmt.getColumnName(i));
            }
            Vector data = new Vector();
            Vector row = new Vector();
            while(rs.next()){
                row = new Vector(c);
                for(int i = 1 ; i<=c;i++ ) {
                    row.add(rs.getString(i));

                }data.add(row);
            }
                JFrame frame = new JFrame();
                frame.setSize(500,350);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel = new JPanel();
                JTable table = new JTable(data,column);
                JScrollPane jsp = new JScrollPane(table);
                panel.setLayout(new BorderLayout());
                panel.add(jsp,BorderLayout.CENTER);
                frame.setContentPane(panel);
                frame.setVisible(true);




        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"ERROR");
        }finally {
            try {
                statement.close();
                rs.close();
                connection.close();

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"ERROR CLOSE");
            }
        }

}

    private static Connection getConnection() {
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
}