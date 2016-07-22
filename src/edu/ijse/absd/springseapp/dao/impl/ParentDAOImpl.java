/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.dao.impl;

import edu.ijse.absd.springseapp.connection.factory.DatabaseResourceFactory;
import edu.ijse.absd.springseapp.dao.ParentDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author thilina
 */
public class ParentDAOImpl implements ParentDAO{
    private DatabaseResourceFactory factory;

    public int saveParent(String name, String tp, int studentId) throws SQLException, ClassNotFoundException{
        Connection connection = factory.getResourceConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO parent(name, tp, member_id) VALUES (?,?,?)");
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, tp);
        preparedStatement.setInt(3, studentId);
        int res = preparedStatement.executeUpdate();        
        return res;
    }

    public DatabaseResourceFactory getFactory() {
        return factory;
    }

    public void setFactory(DatabaseResourceFactory factory) {
        this.factory = factory;
    }
    
}
