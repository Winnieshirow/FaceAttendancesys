/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendance;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.lang.String;
import java.sql.SQLException;

/**
 *
 * @author shirow
 */
public class Dailyattendance extends javax.swing.JFrame {
    Connection conn; // connection to the database
    ResultSet rs;
    Statement st;
    PreparedStatement ps;
    /**
     * Creates new form Dailyattendance
     */
    public Dailyattendance() {
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
        jLabel2 = new javax.swing.JLabel();
        course_code = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        course_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        att_date = new com.toedter.calendar.JDateChooser();
        date2 = new javax.swing.JTextField();
        dailybtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel1.setText("DAILY ATTENDANCE REPORT");

        jLabel2.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        jLabel2.setText("Enter course code");

        course_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_codeKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        jLabel6.setText("OR");

        jLabel7.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        jLabel7.setText("Enter course name");

        course_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_nameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        jLabel3.setText("Enter date");

        att_date.setDateFormatString("yyyy/MM/d");
        att_date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                att_dateKeyReleased(evt);
            }
        });

        date2.setEnabled(false);

        dailybtn.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        dailybtn.setText("Daily Attendance Report");
        dailybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(att_date, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(dailybtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(att_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(dailybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                String sqlc="SELECT course_name FROM courses WHERE course_code = '"+c+"'";

                rs = st.executeQuery(sqlc);

                while(rs.next()){

                    course_name.setText(rs.getString("course_name"));

                }

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_course_codeKeyReleased

    private void course_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_nameKeyReleased
        try{
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            try {
                String n = (String) course_name.getText();
                st = conn.createStatement();
                String sqlc = "SELECT course_code FROM courses WHERE course_name = '"+n+"'";
                rs = st.executeQuery(sqlc);

                while(rs.next()){

                    course_code.setText(rs.getString("course_code"));

                }

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }
            finally {
                try{
                    rs.close();
                    st.close();
                    conn.close();
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_course_nameKeyReleased

    private void att_dateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_att_dateKeyReleased

    }//GEN-LAST:event_att_dateKeyReleased

    private void dailybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailybtnActionPerformed
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            Date attdate = att_date.getDate();
            String dateString = String.format("%1$tY-%1$tm-%1$td", attdate);

            date2.setText(dateString);

            System.out.println("time: " +dateString );

             if ("".equals(course_code.getText()))
            {
                JOptionPane.showMessageDialog(dailybtn, "INPUT COURSE CODE");
            }
            else if ("".equals(course_name.getText()))
            {
                JOptionPane.showMessageDialog(dailybtn, "INPUT COURSE NAME");
            }
            else if (att_date.getDate() == null )
            {
                JOptionPane.showMessageDialog(dailybtn, "SELECT DATE TO GENERATE RPORT");
            }
            else{
            try {
                JasperDesign jasperDesign = JRXmlLoader.load("dailyattendancereport.jrxml");
                String sql = "SELECT attendance_id,student.registration_number,student.firstname,student.lastname FROM attendance INNER JOIN class ON attendance.class_id = class.class_id INNER JOIN student ON attendance.student_id = student.student_id INNER JOIN courses ON class.course_id = courses.course_id WHERE course_code = '"+ course_code.getText() + "' AND attendance_date = '"+dateString+"' GROUP BY registration_number";
                JRDesignQuery newQuery = new JRDesignQuery();
                newQuery.setText(sql);
                jasperDesign.setQuery(newQuery);
                JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
                
                
                
                JasperPrint jasperPrint =JasperFillManager.fillReport(jasperReport, null, conn);
                JasperViewer.viewReport(jasperPrint);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            }
        }
        catch(SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e);}
        course_code.setText("");
        course_name.setText("");

    }//GEN-LAST:event_dailybtnActionPerformed

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
            java.util.logging.Logger.getLogger(Dailyattendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dailyattendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dailyattendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dailyattendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dailyattendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser att_date;
    private javax.swing.JTextField course_code;
    private javax.swing.JTextField course_name;
    private javax.swing.JButton dailybtn;
    private javax.swing.JTextField date2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
