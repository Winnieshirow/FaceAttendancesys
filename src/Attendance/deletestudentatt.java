/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author shirow
 */
public class deletestudentatt extends javax.swing.JFrame {
    Connection conn = null; // connection to the database
    ResultSet rs = null;
    Statement st;
    PreparedStatement pst;
    /**
     * Creates new form deletestudentatt
     */
    public deletestudentatt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        registration_number = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        course_code = new javax.swing.JTextField();
        student_id = new javax.swing.JTextField();
        course_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Registration number");

        registration_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registration_numberKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                registration_numberKeyReleased(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jLabel2.setText("course_code");

        course_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_codeKeyReleased(evt);
            }
        });

        student_id.setEnabled(false);

        course_id.setEnabled(false);

        jButton1.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        jButton2.setText("Clear exam records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registration_number, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(course_code))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jButton2)))
                .addGap(0, 57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registration_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        String id = student_id.getText();
        String cid = course_id.getText();
        if ("".equals(id))
            {
                JOptionPane.showMessageDialog(deletebtn, "INPUT REGISTRATION NUMBER");
            }
        else if ("".equals(cid))
            {
                JOptionPane.showMessageDialog(deletebtn, "THAT COURSE DOESN NOT EXIST");
            }
        else{
            
        int p = JOptionPane.showConfirmDialog(null,"Do you want procede with deletion ?","Delete",JOptionPane.YES_NO_OPTION);
        if (p == 0){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info", "root", "shirow12");
            String sqlquery = "DELETE attendance.* FROM attendance INNER JOIN class ON attendance.class_id = class.class_id INNER JOIN courses ON class.course_id = courses.course_id WHERE attendance.student_id =? AND courses.course_id =?";
            
            pst = conn.prepareStatement(sqlquery);
            
            pst.setString(1,student_id.getText());
            pst.setString(2,course_id.getText());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "DATA Deleted!!!");
            dispose();
            new clearrecords().setVisible(true);
                                 
    }
    catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                
                }
    finally
    { 
        try
        {
            st.close();
            rs.close(); 
            conn.close(); 
        }
        catch(Exception e)
        { JOptionPane.showMessageDialog(null, "ERROR!"); }

    }   
        registration_number.setText("");
        student_id.setText("");
        course_code.setText("");
        course_id.setText("");
        }
        
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void registration_numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registration_numberKeyReleased
        try{
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
            
            try {    
        String reg = (String) registration_number.getText();
        st = conn.createStatement();
            String sqlc="SELECT student_id FROM student WHERE registration_number = '"+reg+"'";
            
             rs = st.executeQuery(sqlc);

             while(rs.next()){
             student_id.setText(rs.getString("student_id"));

             }

          }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

            } 
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

            } 
    }//GEN-LAST:event_registration_numberKeyReleased

    private void course_codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_codeKeyReleased
        try{
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
            
            try {    
        String c = (String) course_code.getText();
        st = conn.createStatement();
            String sqlc="SELECT course_id FROM courses WHERE course_code = '"+c+"'";
            
             rs = st.executeQuery(sqlc);

             while(rs.next()){
             course_id.setText(rs.getString("course_id"));

             }

          }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

            } 
        }catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

            } 
    }//GEN-LAST:event_course_codeKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
        new clearrecords().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new deleteexamrecords().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void registration_numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registration_numberKeyTyped
        course_code.setText("");
        student_id.setText("");
        course_id.setText("");
    }//GEN-LAST:event_registration_numberKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        course_code.setText("");
        student_id.setText("");
        course_id.setText("");
        registration_number.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deletestudentatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletestudentatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletestudentatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletestudentatt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletestudentatt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField course_code;
    private javax.swing.JTextField course_id;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField registration_number;
    private javax.swing.JTextField student_id;
    // End of variables declaration//GEN-END:variables
}