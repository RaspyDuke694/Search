/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.controller;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Vishal
 *
 */
public class Database {
    public static void insertRecord (String enroll, String name, String dept, String email, String spec, String add, int phone) throws ClassNotFoundException, SQLException{
        
            try{
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/search","root","toor")) {
                    Statement st = con.createStatement();
                    String query = "insert into search values(" + enroll + ", \"" + name + "\",\"" + dept + "\",\"" + spec + "\",\"" + phone+ "\",\""+ email +"\",\"" + add + "\",\"YES\")";
                    st.executeUpdate(query);
                }
        }catch(SQLException e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }}
}
