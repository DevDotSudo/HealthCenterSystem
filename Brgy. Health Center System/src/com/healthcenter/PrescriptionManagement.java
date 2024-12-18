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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class PrescriptionManagement extends javax.swing.JFrame {
    DBConnection db = new DBConnection();
    public PrescriptionManagement() {
        initComponents();
        showPatientstoComboBox();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        nameFld = new JComboBox<>();
        docNameFld = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        birthFld = new JTextField();
        medNameFld = new JTextField();
        allFld = new JTextField();
        InstFld = new JTextField();
        dosFld = new JTextField();
        statFld = new JTextField();
        refFld = new JTextField();
        saveBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new Color(52, 74, 97));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        jPanel1.setLayout(new AbsoluteLayout());

        jLabel1.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("< BACK");
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1backBtn(evt);
            }
        });
        jPanel1.add(jLabel1, new AbsoluteConstraints(20, 20, 70, -1));

        jPanel3.setBackground(new Color(52, 74, 97));
        jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Prescription Management", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 18), new Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new AbsoluteLayout());

        nameFld.setBackground(new Color(52, 74, 97));
        nameFld.setForeground(new Color(255, 255, 255));
        nameFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Patient Name", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(nameFld, new AbsoluteConstraints(50, 70, 210, 50));

        docNameFld.setBackground(new Color(52, 74, 97));
        docNameFld.setForeground(new Color(255, 255, 255));
        docNameFld.setHorizontalAlignment(JTextField.CENTER);
        docNameFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Doctor Name", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(docNameFld, new AbsoluteConstraints(50, 270, 400, 50));

        jLabel2.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Allergies");
        jPanel3.add(jLabel2, new AbsoluteConstraints(450, 340, -1, -1));

        jLabel3.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Patient Information");
        jPanel3.add(jLabel3, new AbsoluteConstraints(30, 40, -1, -1));

        jLabel4.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Prescription Details");
        jPanel3.add(jLabel4, new AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Prescribing Doctor");
        jPanel3.add(jLabel5, new AbsoluteConstraints(30, 240, -1, -1));

        jLabel6.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("Prescription Status");
        jPanel3.add(jLabel6, new AbsoluteConstraints(30, 340, -1, -1));

        jLabel7.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("Refills");
        jPanel3.add(jLabel7, new AbsoluteConstraints(250, 340, -1, -1));

        birthFld.setBackground(new Color(52, 74, 97));
        birthFld.setForeground(new Color(255, 255, 255));
        birthFld.setHorizontalAlignment(JTextField.CENTER);
        birthFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Date of Birth", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(birthFld, new AbsoluteConstraints(290, 70, 230, 50));

        medNameFld.setBackground(new Color(52, 74, 97));
        medNameFld.setForeground(new Color(255, 255, 255));
        medNameFld.setHorizontalAlignment(JTextField.CENTER);
        medNameFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Medication Name", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(medNameFld, new AbsoluteConstraints(50, 170, 210, 50));

        allFld.setBackground(new Color(52, 74, 97));
        allFld.setForeground(new Color(255, 255, 255));
        allFld.setHorizontalAlignment(JTextField.CENTER);
        allFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Known Allergies", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(allFld, new AbsoluteConstraints(460, 370, 150, 50));

        InstFld.setBackground(new Color(52, 74, 97));
        InstFld.setForeground(new Color(255, 255, 255));
        InstFld.setHorizontalAlignment(JTextField.CENTER);
        InstFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Instructions", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(InstFld, new AbsoluteConstraints(540, 170, 340, 50));

        dosFld.setBackground(new Color(52, 74, 97));
        dosFld.setForeground(new Color(255, 255, 255));
        dosFld.setHorizontalAlignment(JTextField.CENTER);
        dosFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Dosage", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(dosFld, new AbsoluteConstraints(290, 170, 230, 50));

        statFld.setBackground(new Color(52, 74, 97));
        statFld.setForeground(new Color(255, 255, 255));
        statFld.setHorizontalAlignment(JTextField.CENTER);
        statFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Status", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(statFld, new AbsoluteConstraints(50, 370, 150, 50));

        refFld.setBackground(new Color(52, 74, 97));
        refFld.setForeground(new Color(255, 255, 255));
        refFld.setHorizontalAlignment(JTextField.CENTER);
        refFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Number of Refills", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(refFld, new AbsoluteConstraints(260, 370, 150, 50));

        saveBtn.setBackground(new Color(255, 255, 255));
        saveBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        saveBtn.setForeground(new Color(52, 74, 97));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(saveBtn, new AbsoluteConstraints(710, 450, 190, 50));

        jPanel1.add(jPanel3, new AbsoluteConstraints(30, 60, 930, 520));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 990, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new Dimension(990, 611));
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void jLabel1backBtn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1backBtn
        this.dispose();
        ActivityMain main = new ActivityMain();
        main.setVisible(true);
    }//GEN-LAST:event_jLabel1backBtn

    private void saveBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String name = nameFld.getSelectedItem().toString();
        String birth = birthFld.getText().trim();
        String medName = medNameFld.getText().trim();
        String dosage = dosFld.getText().trim();
        String inst = InstFld.getText().trim();
        String docName = docNameFld.getText().trim();
        String stat = statFld.getText().trim();
        String ref = refFld.getText().trim();
        String all = allFld.getText().trim();
        
        savePres(name,birth,medName,dosage,inst,docName,stat,ref,all);
    }//GEN-LAST:event_saveBtnActionPerformed

    protected void savePres(String name, String birth, String medName, String dosage, String inst, String docName,String stat, String ref, String all) {
        db.connect();
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to save this?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
            
            if(confirm == JOptionPane.OK_OPTION) {
                db.ps = db.sql_conn.prepareStatement("INSERT INTO prescriptionmanagement(name, birthdate, medication_name, dosage, instruction, doctor_name, status, refills, allergies) VALUES(?,?,?,?,?,?,?,?,?)");

                    db.ps.setString(1, name);
                    db.ps.setString(2, birth);
                    db.ps.setString(3, medName);
                    db.ps.setString(4, dosage);
                    db.ps.setString(5, inst);
                    db.ps.setString(6, docName);
                    db.ps.setString(7, stat);
                    db.ps.setString(8, ref);
                    db.ps.setString(9, all);

                    int check = db.ps.executeUpdate();

                    if (check == 1) {
                        JOptionPane.showMessageDialog(null, "Saved");
                    } else {
                        JOptionPane.showMessageDialog(null, "Can't save!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
    }
    
    protected void showPatientstoComboBox() {
        db.connect();
        try {
            db.ps = db.sql_conn.prepareStatement("SELECT fullname FROM patientinfo");
            db.rs = db.ps.executeQuery();
            
            while (db.rs.next()) {
                String patientName = db.rs.getString("fullname");
                nameFld.addItem(patientName);
            }
            db.rs.close();
            db.ps.close();
            db.sql_conn.close();

        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JTextField InstFld;
    JTextField allFld;
    JTextField birthFld;
    JTextField docNameFld;
    JTextField dosFld;
    JLabel jLabel1;
    JLabel jLabel2;
    JLabel jLabel3;
    JLabel jLabel4;
    JLabel jLabel5;
    JLabel jLabel6;
    JLabel jLabel7;
    JPanel jPanel1;
    JPanel jPanel3;
    JTextField medNameFld;
    JComboBox<String> nameFld;
    JTextField refFld;
    JButton saveBtn;
    JTextField statFld;
    // End of variables declaration//GEN-END:variables
}
