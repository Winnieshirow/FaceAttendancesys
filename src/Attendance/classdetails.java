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
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author shirow
 */
public class classdetails extends javax.swing.JFrame {
    Connection conn; // connection to the database
    ResultSet rs;
    Statement st;
    PreparedStatement ps;
    /**
     * Creates new form classdetails
     */
    public classdetails() {
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

        jLabel8 = new javax.swing.JLabel();
        course_code1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        course_name1 = new javax.swing.JTextField();
        timetablebtn = new javax.swing.JButton();
        classbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("SansSerif", 2, 10)); // NOI18N

        jLabel8.setText("Enter course code");

        course_code1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_code1KeyReleased(evt);
            }
        });

        jLabel4.setText("Enter course name");

        course_name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_name1KeyReleased(evt);
            }
        });

        timetablebtn.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        timetablebtn.setText("Classes on the course");
        timetablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetablebtnActionPerformed(evt);
            }
        });

        classbtn.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        classbtn.setText("Class List");
        classbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabel1.setText("CLASS DETAILS");

        jButton1.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(course_code1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(classbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(timetablebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_code1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timetablebtn)
                    .addComponent(classbtn))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void course_code1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_code1KeyReleased
        try{
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            try {
                String c = (String) course_code1.getText();
                st = conn.createStatement();
                String sqlc="SELECT course_name FROM courses WHERE course_code = '"+c+"'";

                rs = st.executeQuery(sqlc);

                while(rs.next()){

                    course_name1.setText(rs.getString("course_name"));

                }

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, e);

            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_course_code1KeyReleased

    private void course_name1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_name1KeyReleased
        try{
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            try {
                String n = (String) course_name1.getText();
                st = conn.createStatement();
                String sqlc = "SELECT course_code FROM courses WHERE course_name = '"+n+"'";
                rs = st.executeQuery(sqlc);

                while(rs.next()){

                    course_code1.setText(rs.getString("course_code"));

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
    }//GEN-LAST:event_course_name1KeyReleased

    private void timetablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetablebtnActionPerformed
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            try {
                JasperDesign jasperDesign = JRXmlLoader.load("classtimetable.jrxml");
                String sql = "SELECT class_day,start_time,end_time FROM class INNER JOIN courses ON class.course_id = courses.course_id WHERE courses.course_code = '"+ course_code1.getText() + "'";

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
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        course_code1.setText("");
        course_name1.setText("");
    }//GEN-LAST:event_timetablebtnActionPerformed

    private void classbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classbtnActionPerformed
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);

            try {
                JasperDesign jasperDesign = JRXmlLoader.load("classlist.jrxml");
                String sql = "SELECT student.registration_number,student.firstname,student.lastname FROM attendance INNER JOIN student ON attendance.student_id = student.student_id INNER JOIN class ON attendance.class_id = class.class_id INNER JOIN courses ON class.course_id = courses.course_id WHERE course_code = '"+ course_code1.getText() + "' GROUP BY registration_number";

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
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        course_code1.setText("");
        course_name1.setText("");
    }//GEN-LAST:event_classbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new searchclass().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(classdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(classdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(classdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(classdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new classdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classbtn;
    private javax.swing.JTextField course_code1;
    private javax.swing.JTextField course_name1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton timetablebtn;
    // End of variables declaration//GEN-END:variables
}
