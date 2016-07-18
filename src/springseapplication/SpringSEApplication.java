/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springseapplication;

import edu.ijse.absd.springseapp.service.StudentService;
import edu.ijse.absd.springseapp.service.impl.StudentServiceImpl;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import terminal.StudentTerminal;

/**
 *
 * @author thilinad
 */
public class SpringSEApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        System.out.println("1 : Student \n0 : Exit");
        System.out.println("Enter option : ");
        while(true){
            try {
                Scanner scanner = new Scanner(System.in);
                int option = scanner.nextInt();
                if(0==option){
                    break;
                }
                
                switch(option){
                    case 1:
                        StudentTerminal student = (StudentTerminal) context.getBean("student");
                        System.out.println("Enter Name : ");
                        String name = scanner.next();
                        student.setName(name);
                        
                        System.out.println("Enter Address : ");
                        String address = scanner.next();
                        student.setAddress(address);
                        
                        int i = studentService.saveStudent(student);
                        if(1==i){
                            System.out.println("Successfully saved");
                        }
                        System.out.println("1 : Student \n0 : Exit");
                        System.out.println("Enter option : ");
                        break;
                        
                    default :
                        System.out.println("Invalid option");
                        System.out.println("Enter option : ");
                }
            } catch (SQLException ex) {
                Logger.getLogger(SpringSEApplication.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex){
                Logger.getLogger(SpringSEApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
}
