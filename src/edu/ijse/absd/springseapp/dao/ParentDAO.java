/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author thilina
 */
public interface ParentDAO {
    public int saveParent(Connection connection, String name, String tp, int memberId) throws SQLException;
}
