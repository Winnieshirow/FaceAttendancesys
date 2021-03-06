/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author shirow
 */
public class addcourse extends javax.swing.JFrame {
    Connection conn = null; // connection to the database
    ResultSet rs = null;
    Statement st;
    PreparedStatement pst;
    PreparedStatement ps;
    

    /**
     * Creates new form addcourse
     */
    public addcourse() {
        initComponents();
        fillcombotwo();
        validatetextfield();
    }
    private void validatetextfield(){
        course_name.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e){
				char ch = e.getKeyChar();
				if(Character.isDigit(ch)){
					course_name.setText("");
					JOptionPane.showMessageDialog(null, "Input characters only!");
                                        course_name.setText("");
                                }
			}

			
		});
    }
    public static boolean code_validation(String coursecode)
    {
        boolean status = false;
        
        String coursecode_pattern = "^[a-zA-Z]{3}\\s[0-9]{2,3}+$";
        Pattern pattern = Pattern.compile(coursecode_pattern);
        Matcher matcher = pattern.matcher(coursecode);
        
        if (matcher.matches()){
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
     public static boolean numofc_validation(String numofc)
    {
        boolean status1 = false;
        
        String numofc_pattern = "^[0-9]+$";
        Pattern pattern = Pattern.compile(numofc_pattern);
        Matcher matcher = pattern.matcher(numofc);
        
        if (matcher.matches()){
            status1 = true;
        }
        else{
            status1 = false;
        }
        return status1;
    }
     public static boolean year_validation(String year)
    {
        boolean status2 = false;
        
        String year_pattern = "^[1-6]+$";
        Pattern pattern = Pattern.compile(year_pattern);
        Matcher matcher = pattern.matcher(year);
        
        if (matcher.matches()){
            status2 = true;
        }
        else{
            status2 = false;
        }
        return status2;
    }
     public static boolean semester_validation(String semester)
    {
        boolean status3 = false;
        
        String semester_pattern = "^[1-2]+$";
        Pattern pattern = Pattern.compile(semester_pattern);
        Matcher matcher = pattern.matcher(semester);
        
        if (matcher.matches()){
            status3 = true;
        }
        else{
            status3 = false;
        }
        return status3;
    }
     public void fillcombotwo(){
          degree_name.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent event) {
       try {    
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbURL = "jdbc:mysql://localhost:3306/user_info";
            String dbUser = "root";
            String dbPass = "shirow12";
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);   
        JComboBox<String> combo = (JComboBox<String>) event.getSource();
        String s6 = (String) degree_name.getSelectedItem();
        System.out.println("Selected: " + degree_name.getSelectedItem());
        String sql2 = "SELECT degree_id FROM degrees WHERE degrees.degree_name = '"+s6+"'";
        
        ps = conn.prepareStatement(sql2);
            rs =ps.executeQuery();
            while(rs.next()){
                
                degree_id.setText(rs.getString("degree_id"));
            }
        
                }
                catch(Exception e){JOptionPane.showMessageDialog(null, e);}
            }    
            }); 
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clearbtn = new javax.swing.JButton();
        course_code = new javax.swing.JTextField();
        course_name = new javax.swing.JTextField();
        number_of_classes = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        semester = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        degree_name = new javax.swing.JComboBox<>();
        savebtn = new javax.swing.JButton();
        degree_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 3, 15)); // NOI18N
        jLabel1.setText("ADD NEW COURSE");

        jLabel2.setText("Course code");

        jLabel3.setText("Course name");

        jLabel4.setText("Number of classes");

        jLabel5.setText("year");

        jLabel6.setText("semester");

        clearbtn.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        clearbtn.setText("Clear");

        jLabel7.setText("Degree  name");

        degree_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer science", "Law", "Business" }));

        savebtn.setFont(new java.awt.Font("SansSerif", 2, 15)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        degree_id.setEnabled(false);

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
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(savebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_of_classes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degree_name, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degree_id, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(course_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(course_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(number_of_classes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(year, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(semester, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(degree_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(degree_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clearbtn)
                        .addComponent(jButton1))
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
            String s1 = course_code.getText();
            String s2 = course_name.getText();
            String s3 = number_of_classes.getText();
            String s4 = year.getText();
            String s5 = semester.getText();
            String s7 = (String) degree_id.getText();
            
              if ("".equals(s1))
            {
                JOptionPane.showMessageDialog(savebtn, "INPUT COURSE CODE");
            }
            else if ("".equals(s2))
            {
                JOptionPane.showMessageDialog(savebtn, "INPUT COURSE NAME");
            }
              else if ("".equals(s3))
            {
                JOptionPane.showMessageDialog(savebtn, "INPUT NUMBER OF CLASSES ");
            }
              else if ("".equals(s4))
            {
                JOptionPane.showMessageDialog(savebtn, "INPUT YEAR OF SPECIFIC COURSE");
            }
              else if ("".equals(s5))
            {
                JOptionPane.showMessageDialog(savebtn, "INPUT SEMESTER OF SPECIFIC COURSE ");
            }
              else if ("".equals(s7))
            {
                JOptionPane.showMessageDialog(savebtn, "SELECT DEGREE");
            }
              else{
                   boolean status = code_validation(course_code.getText());
           if(status){
              
               boolean status1 = numofc_validation(number_of_classes.getText());
                    if (status1)
                    {
                         boolean status2 = year_validation(year.getText());
                    if (status2)
                    {
                      boolean status3 = year_validation(semester.getText());
                    if (status3)
                    {  
              try {
                  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_info", "root", "shirow12");
                   String sql="INSERT INTO courses(course_code,course_name,number_of_classes,year,semester,degree_id) values(?,?,?,?,?,?)";
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, s1);
                    ps.setString(2, s2);
                    ps.setString(3, s3);
                    ps.setString(4, s4);
                    ps.setString(5, s5);
                    ps.setString(6, s7);
                   
                    
                   int row = ps.executeUpdate();
                if (row > 0) {
                   JOptionPane.showMessageDialog(savebtn, "Data Saved Successfully");
                        }
                     else {
                         JOptionPane.showMessageDialog(savebtn, "error!!!");
                            }
             
                     }
               catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    }
            course_code.setText("");
            course_name.setText("");
            number_of_classes.setText("");
            year.setText("");
            semester.setText("");
            
     
                    }else{
                        JOptionPane.showMessageDialog(savebtn," ENTER ONLY SEMESTER 1 OR 2");
                    }
                    }else{
                        JOptionPane.showMessageDialog(savebtn," ENTER ONLY YEAR BETWEEN 1 AND 6");
                    }
                    }else{
                        JOptionPane.showMessageDialog(savebtn," ENTER ONLY NUMBERS FOR NUMBER_OF_CLASSES");
                    }
                    }else{
                        JOptionPane.showMessageDialog(savebtn," ENTER COURSE CODE IN THE RIGHT FORMAT");
                    }
              }
              dispose();
        new searchcourse().setVisible(true);
    }//GEN-LAST:event_savebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new searchcourse().setVisible(true);
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
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField course_code;
    private javax.swing.JTextField course_name;
    private javax.swing.JTextField degree_id;
    private javax.swing.JComboBox<String> degree_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField number_of_classes;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField semester;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
