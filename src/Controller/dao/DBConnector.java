/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Windows 10
 */
public class DBConnector {
    String DB_URL; 
    String Username;
    String Password; 
    public static Connection conn; 
    private static DBConnector instance = null; 

    private DBConnector() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        DB_URL= "jdbc:mysql://localhost:3306/quanlyquancafe"; 
        Username="root"; 
        Password=""; 
        conn = DriverManager.getConnection(DB_URL, Username, Password);
    }
    
    public static DBConnector getInstance() throws Exception{
        if (instance == null) {
            instance = new DBConnector();
        }
        return instance;
    }
}
