/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.service.impl;

import edu.ijse.absd.springseapp.dao.impl.StudentDAOImpl;
import edu.ijse.absd.springseapp.service.StudentService;
import java.sql.SQLException;
import terminal.StudentTerminal;

/**
 *
 * @author thilinad
 */
public class StudentServiceImpl implements StudentService{ 
    private StudentDAOImpl studentDAO;
    
     public void setStudentDAO(StudentDAOImpl studentDAO) {
        this.studentDAO = studentDAO;
    }
    
    public StudentDAOImpl getStudentDAO() {
        return studentDAO;
    }
    
    @Override
    public int saveStudent(StudentTerminal studentTerminal) throws SQLException, ClassNotFoundException{        
        int i = getStudentDAO().saveStudent(studentTerminal.getName(),studentTerminal.getAddress());
        return i;
    }      
    
}
