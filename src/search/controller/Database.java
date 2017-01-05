/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.controller;
import java.sql.*;

/**
 *
 * @author Vishal
 *
 */
public class Database {
    public static void insertRecord (String enroll, String name, String dept, String email, String spec, String add, int phone) throws ClassNotFoundException, SQLException{
        
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6152400","sql6152400","qEJpCrwHCQ")) { 
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("INSERT INTO `sql6152400`.`Search` (`Enrollment`, `Name`, `Department`, `Speciality`, `Phone`, `Email`, `Address`) VALUES (enroll, name, dept, spec, phone, email, phone);");
        }
        }
}
