/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.connection.database;

import edu.ijse.absd.springseapp.connection.ResourceConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface DatabaseResourceConnection extends ResourceConnection{
    public Connection getConnection() throws ClassNotFoundException, SQLException;
}
