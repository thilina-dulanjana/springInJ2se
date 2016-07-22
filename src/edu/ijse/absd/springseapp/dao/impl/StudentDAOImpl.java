/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.dao.impl;

import edu.ijse.absd.springseapp.connection.factory.DatabaseResourceFactory;
import edu.ijse.absd.springseapp.dao.StudentDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author thilinad
 */
public class StudentDAOImpl implements StudentDAO{
    private DatabaseResourceFactory factory;
    @Override
    public int saveStudent(String name, String address) throws SQLException, ClassNotFoundException{         
        Connection connection = factory.getResourceConnection().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO member(name, address) VALUES(?,?)", Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, address);
        int i = preparedStatement.executeUpdate();            

        ResultSet rs = preparedStatement.getGeneratedKeys();
        int key = 0;
        if (rs.next()) {
            key = rs.getInt(1);
        }
        return key;
    }
           
    public DatabaseResourceFactory getFactory() {
        return factory;
    }

    public void setFactory(DatabaseResourceFactory factory) {
        this.factory = factory;
    }
    
}
