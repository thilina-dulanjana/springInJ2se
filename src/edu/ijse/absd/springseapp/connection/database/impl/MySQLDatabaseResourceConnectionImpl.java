/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.absd.springseapp.connection.database.impl;

import edu.ijse.absd.springseapp.connection.database.DatabaseResourceConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLDatabaseResourceConnectionImpl implements DatabaseResourceConnection {
    //public static Connection connection;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","root");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        return connection;
    }   

}
