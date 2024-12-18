package com.healthcenter;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class LoginFormView extends javax.swing.JFrame {
    final static String ADMIN_USER = "Admin";
    final static String ADMIN_PASS = "Admin123";
    
    public LoginFormView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username_fld = new javax.swing.JTextField();
        password_fld = new javax.swing.JPasswordField();
        show_pass = new javax.swing.JCheckBox();
        login_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 74, 97));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("X");
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnListener(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 20, 20));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Health Care Provider");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Login");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 170, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        username_fld.setBackground(new java.awt.Color(52, 74, 97));
        username_fld.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        username_fld.setForeground(new java.awt.Color(255, 255, 255));
        username_fld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bookman Old Style", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(username_fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 370, 60));

        password_fld.setBackground(new java.awt.Color(52, 74, 97));
        password_fld.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        password_fld.setForeground(new java.awt.Color(255, 255, 255));
        password_fld.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bookman Old Style", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(password_fld, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 370, 60));

        show_pass.setBackground(new java.awt.Color(52, 74, 97));
        show_pass.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        show_pass.setForeground(new java.awt.Color(255, 255, 255));
        show_pass.setText("Show password");
        show_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_passActionPerformed(evt);
            }
        });
        jPanel1.add(show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, -1, -1));

        login_button.setBackground(new java.awt.Color(255, 255, 255));
        login_button.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        login_button.setForeground(new java.awt.Color(52, 74, 97));
        login_button.setText("LOGIN");
        login_button.setFocusable(false);
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 370, 50));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Management System");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 760));

        setSize(new java.awt.Dimension(650, 760));
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        if(username_fld.getText().equals(ADMIN_USER) && password_fld.getText().equals(ADMIN_PASS)) {
            JOptionPane.showMessageDialog(null, "Logged in successfully");
            ActivityMain main = new ActivityMain();
            main.setVisible(true);
            this.dispose();
            return;
        }
        JOptionPane.showMessageDialog(null, "Incorrect username or password", "Password Denied", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_login_buttonActionPerformed

    private void exitBtnListener(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnListener
        System.exit(0);
    }//GEN-LAST:event_exitBtnListener

    private void show_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_passActionPerformed
        if(show_pass.isSelected()) {
            password_fld.setEchoChar((char)0);
            return;
        }
        password_fld.setEchoChar('\u2022');
    }//GEN-LAST:event_show_passActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_button;
    public javax.swing.JPasswordField password_fld;
    public javax.swing.JCheckBox show_pass;
    public javax.swing.JTextField username_fld;
    // End of variables declaration//GEN-END:variables
}
