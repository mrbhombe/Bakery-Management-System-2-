/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohan
 */import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductAdd {

    private static final String url = "jdbc:mysql://localhost:3306/bakery?zeroDateTimeBehavior=convertToNull";
    private static final String user = "root";
    private static final String password = "";

    private static final String sql = "insert into tbl_product(pname, pqty, pimg,pprice,pdesc) values(?,?,?,?,?)";

    public static int uploadFile(String pname, String pqty, InputStream pimg, String pprice, String pdesc) {
        int row = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection connection = DriverManager
            .getConnection(url, user, password);
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement(sql)) {

            preparedStatement.setString(1, pname);
            preparedStatement.setString(2, pqty);
            if (pimg != null) {
                // fetches input stream of the upload file for the blob column
                preparedStatement.setBlob(3, pimg);
            }
            preparedStatement.setString(4, pprice);
            preparedStatement.setString(5, pdesc);

            // sends the statement to the database server
            row = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
           
        }
        return row;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
