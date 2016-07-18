/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.dao.impl;

import edu.ijse.absd.springseapp.connection.factory.DatabaseResourceFactory;
import edu.ijse.absd.springseapp.dao.StudentDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author thilinad
 */
public class StudentDAOImpl implements StudentDAO{
    private DatabaseResourceFactory factory;
    @Override
    public int saveStudent(String name, String address) throws SQLException, ClassNotFoundException{         
            Connection connection = factory.getResourceConnection().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO member(name, address) VALUES(?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            int i = preparedStatement.executeUpdate();
            return i;        
    }

    public DatabaseResourceFactory getFactory() {
        return factory;
    }

    public void setFactory(DatabaseResourceFactory factory) {
        this.factory = factory;
    }
    
}
