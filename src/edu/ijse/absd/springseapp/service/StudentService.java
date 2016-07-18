/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.service;

import java.sql.SQLException;
import org.springframework.context.ApplicationContextAware;
import terminal.StudentTerminal;

/**
 *
 * @author thilinad
 */
public interface StudentService{
    public int saveStudent(StudentTerminal studentTerminal) throws SQLException, ClassNotFoundException;
}
