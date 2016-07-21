/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.dao.impl;

import edu.ijse.absd.springseapp.dao.ParentDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author thilina
 */
public class ParentDAOImpl implements ParentDAO{

    public int saveParent(Connection connection, String name, String tp, int memberId) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO parent(name, tp, member_id) VALUES (?,?,?)");
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, tp);
        preparedStatement.setInt(3, memberId);
        int res = preparedStatement.executeUpdate();        
        return res;
    }
    
}
