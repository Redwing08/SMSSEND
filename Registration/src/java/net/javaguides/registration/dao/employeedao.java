/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.registration.dao;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import net.javaguides.registration.model.Employee;

/**
 *
 * @author Steve
 */
public class employeedao {
    public int registerEmployee(Employee employee) throws ClassNotFoundException{
        String SQL = "INSERT INTO users(name, email, country)VALUES(?,?,?)";
        
        
        int result = 0;
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
            
            
            
            //servlet parinm
            PreparedStatement prep = con.prepareStatement(SQL);
            prep.setString(1, employee.getName());
            prep.setString(2, employee.getEmail());
            prep.setString(3, employee.getCountry());
            
            
            System.out.println(prep);
            prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(employeedao.class.getName()).log(Level.SEVERE, "Error to the database", ex);
        }
        
        
        
        
        
        
        return 0;
        
    }
    
    
    
    public int retrieveData(Employee employee){
        String ret = "SELECT * FROM users WHERE name = ?";
    
        
        
        try {
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "");
            
            PreparedStatement prep = con.prepareStatement(ret);
              prep.setString(1, employee.getName());
              
              
              ResultSet rowsInserted = prep.executeQuery();

         
              
                
            
        } catch (SQLException ex) {
            Logger.getLogger(employeedao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return 0;
        
    }
}
