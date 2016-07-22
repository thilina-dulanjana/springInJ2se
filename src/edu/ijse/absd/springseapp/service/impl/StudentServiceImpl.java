/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.springseapp.service.impl;

import edu.ijse.absd.springseapp.dao.ParentDAO;
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
    private ParentDAO parentDAO;

    public ParentDAO getParentDAO() {
        return parentDAO;
    }

    public void setParentDAO(ParentDAO parentDAO) {
        this.parentDAO = parentDAO;
    }
    
     public void setStudentDAO(StudentDAOImpl studentDAO) {
        this.studentDAO = studentDAO;
    }
    
    public StudentDAOImpl getStudentDAO() {
        return studentDAO;
    }
    
    @Override
    public int saveStudent(StudentTerminal studentTerminal) throws SQLException, ClassNotFoundException{        
        int studentId = getStudentDAO().saveStudent(studentTerminal.getName(),studentTerminal.getAddress());
        
        if(0!=studentId){
            int i = getParentDAO().saveParent(studentTerminal.getParentName(), studentTerminal.getTp(), studentId);
            return i;
        }
        
        return 0;
        
    } 
    
}
