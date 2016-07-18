/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.dao;

import java.sql.SQLException;
import terminal.StudentTerminal;

/**
 *
 * @author thilinad
 */
public interface StudentDAO {
    public int saveStudent(String name, String address) throws SQLException, ClassNotFoundException;
}
