package search.windows;

import search.controller.About;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vishal
 */
public class MainGUI extends javax.swing.JFrame {

    Connection con;
    ResultSet rs= null;
    PreparedStatement pst=null;
    /**
     * 
     * Creates new form MainGUI
     * @throws java.sql.SQLException
     */
    public MainGUI() throws SQLException {
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/search","root","toor");
        initComponents();
        UpdateTable();
    }
    
    private void UpdateTable(){
        try{
            String query="select * from search";
            pst=con.prepareStatement(query);
            rs=pst.executeQuery();
            ResultTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        IndexCheck = new javax.swing.JCheckBox();
        NameCheck = new javax.swing.JCheckBox();
        DeptCheck = new javax.swing.JCheckBox();
        SpecialCheck = new javax.swing.JCheckBox();
        AlumniCheck = new javax.swing.JCheckBox();
        MainGUISeperator = new javax.swing.JSeparator();
        TablePane = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
        MainGUIMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_src.gif"))); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        IndexCheck.setText("Index");

        NameCheck.setText("Name");

        DeptCheck.setText("Department");

        SpecialCheck.setText("Speciality");

        AlumniCheck.setText("Alumni");

        ResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablePane.setViewportView(ResultTable);

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add_obj.gif"))); // NOI18N
        jMenuItem1.setText("Add Record");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_edit.gif"))); // NOI18N
        jMenuItem2.setText("Delete Record");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/warning.gif"))); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        MainGUIMenu.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info_tsk.gif"))); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        MainGUIMenu.add(jMenu2);

        setJMenuBar(MainGUIMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainGUISeperator, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IndexCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeptCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpecialCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlumniCheck)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TablePane, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AlumniCheck, DeptCheck, IndexCheck, NameCheck, SpecialCheck});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IndexCheck)
                    .addComponent(NameCheck)
                    .addComponent(DeptCheck)
                    .addComponent(SpecialCheck)
                    .addComponent(AlumniCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainGUISeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AlumniCheck, DeptCheck, IndexCheck, NameCheck, SpecialCheck});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    About x=new About(this,true);
    x.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Authentication s=new Authentication();
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainGUI().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AlumniCheck;
    private javax.swing.JCheckBox DeptCheck;
    private javax.swing.JCheckBox IndexCheck;
    private javax.swing.JMenuBar MainGUIMenu;
    private javax.swing.JSeparator MainGUISeperator;
    private javax.swing.JCheckBox NameCheck;
    private javax.swing.JTable ResultTable;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchField;
    private javax.swing.JCheckBox SpecialCheck;
    private javax.swing.JScrollPane TablePane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

private void addButtonActionPerformed (
java.awt.event.ActionEvent evt) {
    Details d = new Details(this, true);
    d.setVisible(true);
    }

}

