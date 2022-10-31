package singletonMySQL;

import java.sql.Connection;

public class MainSingleton {
    public static void main(String[]arg){
        Connection connection = ConnMySQL.getConnection();
        System.out.println(connection);
    }
}
