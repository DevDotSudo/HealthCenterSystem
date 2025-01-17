/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.healthcenter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Davie
 */
public class ActivityMain extends javax.swing.JFrame {

    /**
     * Creates new form ActivityMain
     */
    public ActivityMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        JPanel jPanel1 = new JPanel();
        JLabel exitBtn = new JLabel();
        JPanel jPanel2 = new JPanel();
        JButton reports_analytics = new JButton();
        JButton registerBtn = new JButton();
        JButton appointment_scheduling = new JButton();
        JButton medical_record_storage = new JButton();
        JButton billing = new JButton();
        JButton logoutBtn = new JButton();
        JLabel jLabel1 = new JLabel();
        JLabel jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel1.setBackground(new Color(52, 74, 97));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        jPanel1.setLayout(new AbsoluteLayout());

        exitBtn.setFont(new Font("Bookman Old Style", 1, 24)); // NOI18N
        exitBtn.setForeground(new Color(255, 255, 255));
        exitBtn.setText("X");
        exitBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                exitBtnListener(evt);
            }
        });
        jPanel1.add(exitBtn, new AbsoluteConstraints(960, 10, 20, 20));

        jPanel2.setBackground(new Color(52, 74, 97));
        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2), "Dashboard", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 24), new Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new AbsoluteLayout());

        reports_analytics.setBackground(new Color(255, 255, 255));
        reports_analytics.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        reports_analytics.setForeground(new Color(51, 51, 51));
        reports_analytics.setText("Reports");
        reports_analytics.setFocusable(false);
        reports_analytics.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reports_analyticsActionPerformed(evt);
            }
        });
        jPanel2.add(reports_analytics, new AbsoluteConstraints(330, 230, 250, 110));

        registerBtn.setBackground(new Color(255, 255, 255));
        registerBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        registerBtn.setForeground(new Color(51, 51, 51));
        registerBtn.setText("Register Patient");
        registerBtn.setFocusable(false);
        registerBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(registerBtn, new AbsoluteConstraints(50, 60, 240, 120));

        appointment_scheduling.setBackground(new Color(255, 255, 255));
        appointment_scheduling.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        appointment_scheduling.setForeground(new Color(51, 51, 51));
        appointment_scheduling.setText("Appointment Scheduling");
        appointment_scheduling.setFocusable(false);
        appointment_scheduling.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                appointment_schedulingActionPerformed(evt);
            }
        });
        jPanel2.add(appointment_scheduling, new AbsoluteConstraints(330, 60, 250, 120));

        medical_record_storage.setBackground(new Color(255, 255, 255));
        medical_record_storage.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        medical_record_storage.setForeground(new Color(51, 51, 51));
        medical_record_storage.setText("Medical Record");
        medical_record_storage.setFocusable(false);
        medical_record_storage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                medical_record_storageActionPerformed(evt);
            }
        });
        jPanel2.add(medical_record_storage, new AbsoluteConstraints(620, 60, 250, 120));

        billing.setBackground(new Color(255, 255, 255));
        billing.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        billing.setForeground(new Color(51, 51, 51));
        billing.setText("Prescription Management");
        billing.setFocusable(false);
        billing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        jPanel2.add(billing, new AbsoluteConstraints(50, 230, 240, 110));

        logoutBtn.setBackground(new Color(255, 51, 51));
        logoutBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        logoutBtn.setForeground(new Color(204, 204, 204));
        logoutBtn.setText("Logout");
        logoutBtn.setFocusable(false);
        logoutBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel2.add(logoutBtn, new AbsoluteConstraints(620, 230, 250, 110));

        jPanel1.add(jPanel2, new AbsoluteConstraints(30, 200, 930, 380));

        jLabel1.setFont(new Font("Bookman Old Style", 1, 48)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Health Care Provider");
        jPanel1.add(jLabel1, new AbsoluteConstraints(250, 70, -1, -1));

        jLabel4.setFont(new Font("Bookman Old Style", 1, 36)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Management System");
        jPanel1.add(jLabel4, new AbsoluteConstraints(290, 130, 450, -1));

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 990, 610));

        setSize(new Dimension(990, 611));
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void exitBtnListener(MouseEvent evt) {//GEN-FIRST:event_exitBtnListener
        System.exit(0);
    }//GEN-LAST:event_exitBtnListener

    private void registerBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        RegisterPatient patient = new RegisterPatient();
        patient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void appointment_schedulingActionPerformed(ActionEvent evt) {//GEN-FIRST:event_appointment_schedulingActionPerformed
        AppointmentScheduling patient = new AppointmentScheduling();
        patient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appointment_schedulingActionPerformed

    private void medical_record_storageActionPerformed(ActionEvent evt) {//GEN-FIRST:event_medical_record_storageActionPerformed
        MedicalRecord patient = new MedicalRecord();
        patient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_medical_record_storageActionPerformed

    private void billingActionPerformed(ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        PrescriptionManagement patient = new PrescriptionManagement();
        patient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_billingActionPerformed

    private void reports_analyticsActionPerformed(ActionEvent evt) {//GEN-FIRST:event_reports_analyticsActionPerformed
        Reports patient = new Reports();
        patient.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reports_analyticsActionPerformed

    private void logoutBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout", JOptionPane.OK_CANCEL_OPTION);
        
        if(choice == JOptionPane.OK_OPTION) {
            LoginFormView login = new LoginFormView();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
