/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.controller;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import search.windows.Delete;

/**
 *
 * @author Vishal
 *
 */
public class Database {
    private static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage,titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void insertRecord (String enroll, String name, String dept, String email, String spec, String add, int phone) throws ClassNotFoundException, SQLException{
        
            try{
                try (Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6156171","sql6156171","iALIf9zVlZ")){
                //try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/search","root","toor")) {
                    Statement st = con.createStatement();
                    String query = "insert into search values(" + enroll + ", \"" + name + "\",\"" + dept + "\",\"" + spec + "\",\"" + phone+ "\",\""+ email +"\",\"" + add + "\",\"YES\")";
                    st.executeUpdate(query);
                }
        }catch(SQLException e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }}

    /**
     *
     * @param enroll
     */
    public static void deleteRecord(String enroll){
    try
    {
            try ( // create the mysql database connection
                Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6156171","sql6156171","iALIf9zVlZ")) {
                //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/search","root","toor")) {
                String query = "delete from search where Enrollment = \"" + enroll + "\"";
                PreparedStatement preparedStmt = con.prepareStatement(query);
                
                // execute the preparedstatement
                preparedStmt.execute();
            }
        //CompletedDialog.setVisible(true);  
        Database.infoBox("Item Deleted", "Confirmation");
        
    }
    catch (SQLException e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

}
}
