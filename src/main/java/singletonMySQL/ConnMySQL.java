package singletonMySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMySQL {

    private static  Connection connection = null;
    private String driver;
    private String URL;
    private String user;
    private String password;

    private ConnMySQL(){

        String URL = "jdbc:mysql://localhost:3300/test";
        String driver = "com.mysql.jdbc.Driver";
        String user = "admin";
        String password = "password";

        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(URL, user, password);
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
            System.out.println("First Try");
        }
    }

    public static Connection getConnection(){
        if (connection == null){
            new ConnMySQL();
        }
        return connection;
    }
}
