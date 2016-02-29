/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Xeeshan
 */
public class Connect_database {
    Connection conn=null;
    public static Connection connecerDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Xeeshan\\Documents\\NetBeansProjects\\Coching_datbase_project\\database.sqlite");
           /* JOptionPane.showMessageDialog(null, "connection "); */
            return conn;
            
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
          return null;
        }
        
    }
    
}
