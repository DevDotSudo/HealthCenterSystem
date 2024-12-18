
package com.healthcenter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class RegisterPatient extends javax.swing.JFrame {
    static DBConnection db = new DBConnection();
    public RegisterPatient() {
        initComponents();
        showPatients();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        addressFld = new JTextField();
        idFld = new JTextField();
        fullnameFld = new JTextField();
        birthFld = new JTextField();
        genderFld = new JTextField();
        numberFld = new JTextField();
        jScrollPane1 = new JScrollPane();
        patientsList = new JTable();
        jLabel3 = new JLabel();
        refreshBtn = new JButton();
        addBtn = new JButton();
        updateBtn = new JButton();
        deleteBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new AbsoluteLayout());

        jPanel1.setBackground(new Color(52, 74, 97));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        jPanel1.setLayout(new AbsoluteLayout());

        jLabel1.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("< BACK");
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                backBtn(evt);
            }
        });
        jPanel1.add(jLabel1, new AbsoluteConstraints(20, 20, 70, -1));

        jPanel2.setBackground(new Color(52, 74, 97));
        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Register Patients", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 18), new Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new AbsoluteLayout());

        addressFld.setBackground(new Color(52, 74, 97));
        addressFld.setForeground(new Color(255, 255, 255));
        addressFld.setHorizontalAlignment(JTextField.CENTER);
        addressFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Address", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(addressFld, new AbsoluteConstraints(270, 280, 240, 50));

        idFld.setBackground(new Color(52, 74, 97));
        idFld.setForeground(new Color(255, 255, 255));
        idFld.setHorizontalAlignment(JTextField.CENTER);
        idFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Patient ID", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(idFld, new AbsoluteConstraints(30, 130, 230, 50));

        fullnameFld.setBackground(new Color(52, 74, 97));
        fullnameFld.setForeground(new Color(255, 255, 255));
        fullnameFld.setHorizontalAlignment(JTextField.CENTER);
        fullnameFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Full Name", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(fullnameFld, new AbsoluteConstraints(270, 130, 240, 50));

        birthFld.setBackground(new Color(52, 74, 97));
        birthFld.setForeground(new Color(255, 255, 255));
        birthFld.setHorizontalAlignment(JTextField.CENTER);
        birthFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Date of Birth", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(birthFld, new AbsoluteConstraints(30, 210, 230, 50));

        genderFld.setBackground(new Color(52, 74, 97));
        genderFld.setForeground(new Color(255, 255, 255));
        genderFld.setHorizontalAlignment(JTextField.CENTER);
        genderFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Gender", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(genderFld, new AbsoluteConstraints(270, 210, 240, 50));

        numberFld.setBackground(new Color(52, 74, 97));
        numberFld.setForeground(new Color(255, 255, 255));
        numberFld.setHorizontalAlignment(JTextField.CENTER);
        numberFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Contact Number", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(numberFld, new AbsoluteConstraints(30, 280, 230, 50));

        jPanel1.add(jPanel2, new AbsoluteConstraints(20, 100, 540, 440));

        patientsList.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Full Name", "Date of Birth", "Gender", "Contact Number", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientsList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                patientsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientsList);

        jPanel1.add(jScrollPane1, new AbsoluteConstraints(572, 110, 400, 430));

        jLabel3.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("List of Patients");
        jPanel1.add(jLabel3, new AbsoluteConstraints(720, 70, -1, -1));

        refreshBtn.setBackground(new Color(255, 255, 255));
        refreshBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        refreshBtn.setForeground(new Color(52, 74, 97));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(refreshBtn, new AbsoluteConstraints(730, 550, 180, 50));

        addBtn.setBackground(new Color(255, 255, 255));
        addBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        addBtn.setForeground(new Color(52, 74, 97));
        addBtn.setText("Add Patient");
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new AbsoluteConstraints(110, 550, 180, 50));

        updateBtn.setBackground(new Color(255, 255, 255));
        updateBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        updateBtn.setForeground(new Color(52, 74, 97));
        updateBtn.setText("Update Patient");
        updateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new AbsoluteConstraints(320, 550, 180, 50));

        deleteBtn.setBackground(new Color(255, 255, 255));
        deleteBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        deleteBtn.setForeground(new Color(52, 74, 97));
        deleteBtn.setText("Delete Patient");
        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new AbsoluteConstraints(520, 550, 180, 50));

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 990, 610));

        setSize(new Dimension(990, 611));
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void backBtn(MouseEvent evt) {//GEN-FIRST:event_backBtn
        this.dispose();
        ActivityMain main = new ActivityMain();
        main.setVisible(true);
    }//GEN-LAST:event_backBtn

    private void addBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String patient_id = idFld.getText().trim();
        String fullname = fullnameFld.getText().trim();
        String birth = birthFld.getText().trim();
        String gender = genderFld.getText().trim();
        String number = numberFld.getText().trim();
        String address = addressFld.getText().trim();

        addPatient(patient_id, fullname, birth, gender, number,address);
    }//GEN-LAST:event_addBtnActionPerformed

    private void patientsListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_patientsListMouseClicked
        DefaultTableModel d = (DefaultTableModel) patientsList.getModel();
        
        String patient_id = d.getValueAt(patientsList.getSelectedRow(),0).toString();
        String fullname = d.getValueAt(patientsList.getSelectedRow(), 1).toString();
        String birth = d.getValueAt(patientsList.getSelectedRow(),2).toString();
        String gender = d.getValueAt(patientsList.getSelectedRow(), 3).toString();
        String number = d.getValueAt(patientsList.getSelectedRow(), 4).toString();
        String address = d.getValueAt(patientsList.getSelectedRow(), 5).toString();

        
        idFld.setText(patient_id);
        fullnameFld.setText(fullname);
        birthFld.setText(birth);
        genderFld.setText(gender);
        numberFld.setText(number);
        addressFld.setText(address);
    }//GEN-LAST:event_patientsListMouseClicked

    private void updateBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String patient_id = idFld.getText().trim();
        String fullname = fullnameFld.getText().trim();
        String birth = birthFld.getText().trim();
        String gender = genderFld.getText().trim();
        String number = numberFld.getText().trim();
        String address = addressFld.getText().trim();

        updatePatient(patient_id, fullname, birth, gender, number,address);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        deletePatient();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void refreshBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        idFld.setText("");
        fullnameFld.setText("");
        birthFld.setText("");
        genderFld.setText("");
        numberFld.setText("");
        addressFld.setText("");
    }//GEN-LAST:event_refreshBtnActionPerformed
    
    protected void showPatients() {
        db.connect();
        try {
            DefaultTableModel det = (DefaultTableModel) patientsList.getModel();
            
            det.setRowCount(0);
            Statement s = db.sql_conn.createStatement();
            db.rs = s.executeQuery("SELECT * FROM patientinfo");
            
            while(db.rs.next()) {
                Vector vec = new Vector();
                
                vec.add(db.rs.getString(1));
                vec.add(db.rs.getString(2));
                vec.add(db.rs.getString(3));
                vec.add(db.rs.getString(4));
                vec.add(db.rs.getString(5));
                vec.add(db.rs.getString(6));
                det.addRow(vec);
            }
            
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    protected void addPatient(String id, String fullname, String birth, String gender, String number, String address) {
        db.connect();
        try {
            if (!id.isEmpty() && !fullname.isEmpty() && !birth.isEmpty() && !gender.isEmpty()
                    && !number.isEmpty() && !address.isEmpty()){ 
                
                long conNum = Long.parseLong(number);

                db.ps = db.sql_conn.prepareStatement("INSERT INTO patientinfo(id, fullname, birth, gender, number, address) VALUES(?,?,?,?,?,?)");

                db.ps.setString(1, id);
                db.ps.setString(2, fullname);
                db.ps.setString(3, birth);
                db.ps.setString(4, gender);
                db.ps.setString(5, number);
                db.ps.setString(6, address);

                int check = db.ps.executeUpdate();

                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Patient Addedd!");
                    showPatients();
                } else {
                    JOptionPane.showMessageDialog(null, "Can't add Patient!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for number", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    protected void updatePatient(String id, String fullname, String birth, String gender, String number, String address) {
        db.connect();
        try
        {
            if(id.isEmpty() || fullname.isEmpty() || birth.isEmpty() || gender.isEmpty() || number.isEmpty() || address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "There is an empty fields", "Message", JOptionPane.ERROR_MESSAGE);
            }
            
            else {
                long conNum = Long.parseLong(number);
                
                int confirm = JOptionPane.showConfirmDialog(null, "Update this patient?", "Message", JOptionPane.OK_CANCEL_OPTION);
           
                if(confirm == JOptionPane.OK_OPTION) {
                db.ps = db.sql_conn.prepareStatement("UPDATE patientinfo SET fullname = ?, birth = ?, gender = ?, number =?, address =? WHERE id = ?");
                db.ps.setString(1, fullname);
                db.ps.setString(2, birth);
                db.ps.setString(3, gender);
                db.ps.setLong(4, conNum);
                db.ps.setString(5, address);
                db.ps.setString(6, id);

                }

                int update = db.ps.executeUpdate();

                if(update == 1)
                {
                    JOptionPane.showMessageDialog(null, "Patient Updated!","Message",JOptionPane.PLAIN_MESSAGE);
                    showPatients();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Failed to update Patient!","Message",JOptionPane.ERROR_MESSAGE);
                }
                showPatients();
            }
        }catch (NumberFormatException i) {
            JOptionPane.showMessageDialog(null, "Invalid input for Contact Number", "Message", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
          System.out.println("Error : " + e.getMessage()); 
       }
    }
    
    protected void deletePatient() {
        db.connect();
        String patient_id = idFld.getText().trim();
        int confirm;
        
        try{
            if(patient_id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "There is an empty fields", "Message", JOptionPane.ERROR_MESSAGE);
            }
            else {
                String delete = patient_id;

                confirm = JOptionPane.showConfirmDialog(null, "Delete this patient?", "Message", JOptionPane.OK_CANCEL_OPTION);

                if(confirm == JOptionPane.OK_OPTION) {
                    db.ps = db.sql_conn.prepareStatement("DELETE FROM patientinfo WHERE id = ?");
                    db.ps.setString(1,delete);
                }
                else {
                    return;
                }
                    int del = db.ps.executeUpdate();
                    if(del == 1)
                {
                    JOptionPane.showMessageDialog(null, "Successfully deleted!!","Message",JOptionPane.PLAIN_MESSAGE);
                    showPatients();
                }
                else
                {
                  JOptionPane.showMessageDialog(null,"Not deleted!!","Message",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(Exception e)
        {
           System.out.println("ERROR occured!!" + e.getMessage()); 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton addBtn;
    JTextField addressFld;
    JTextField birthFld;
    JButton deleteBtn;
    JTextField fullnameFld;
    JTextField genderFld;
    JTextField idFld;
    JLabel jLabel1;
    JLabel jLabel3;
    JPanel jPanel1;
    JPanel jPanel2;
    JScrollPane jScrollPane1;
    JTextField numberFld;
    JTable patientsList;
    JButton refreshBtn;
    JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
