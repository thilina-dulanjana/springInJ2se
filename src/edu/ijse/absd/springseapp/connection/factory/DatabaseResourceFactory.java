/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ijse.absd.springseapp.connection.factory;

import edu.ijse.absd.springseapp.connection.database.DatabaseResourceConnection;

public class DatabaseResourceFactory {
    private DatabaseResourceConnection connection;    

    public DatabaseResourceConnection getConnection() {
        return connection;
    }

    public void setConnection(DatabaseResourceConnection connection) {
        this.connection = connection;
    }    
    
    public DatabaseResourceConnection getResourceConnection(){
        return getConnection();
    }    
}
