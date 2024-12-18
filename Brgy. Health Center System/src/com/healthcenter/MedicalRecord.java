
package com.healthcenter;

import com.healthcenter.ActivityMain;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class MedicalRecord extends javax.swing.JFrame {
    static DBConnection db = new DBConnection();
    public MedicalRecord() {
        initComponents();
        showPatientstoComboBox();
        notesFld.setWrapStyleWord(true);
        notesFld.setLineWrap(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        nameFld = new JComboBox<>();
        recordFld = new JTextField();
        complaintFld = new JTextField();
        jScrollPane2 = new JScrollPane();
        notesFld = new JTextArea();
        saveBtn = new JButton();
        viewBtn = new JButton();

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
        jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), " Medical Record", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 18), new Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new AbsoluteLayout());

        nameFld.setBackground(new Color(52, 74, 97));
        nameFld.setForeground(new Color(255, 255, 255));
        nameFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Patient Name", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(nameFld, new AbsoluteConstraints(100, 60, 210, 50));

        recordFld.setBackground(new Color(52, 74, 97));
        recordFld.setForeground(new Color(255, 255, 255));
        recordFld.setHorizontalAlignment(JTextField.CENTER);
        recordFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Date of Record", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(recordFld, new AbsoluteConstraints(620, 60, 230, 50));

        complaintFld.setBackground(new Color(52, 74, 97));
        complaintFld.setForeground(new Color(255, 255, 255));
        complaintFld.setHorizontalAlignment(JTextField.CENTER);
        complaintFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Chief Complaint", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel3.add(complaintFld, new AbsoluteConstraints(350, 60, 230, 50));

        notesFld.setBackground(new Color(52, 74, 97));
        notesFld.setColumns(20);
        notesFld.setFont(new Font("SansSerif", 1, 24)); // NOI18N
        notesFld.setForeground(new Color(255, 255, 255));
        notesFld.setRows(5);
        notesFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Medical Notes", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 18), new Color(255, 255, 255))); // NOI18N
        jScrollPane2.setViewportView(notesFld);

        jPanel3.add(jScrollPane2, new AbsoluteConstraints(40, 130, 850, 310));

        saveBtn.setBackground(new Color(255, 255, 255));
        saveBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        saveBtn.setForeground(new Color(52, 74, 97));
        saveBtn.setText("Save Record");
        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(saveBtn, new AbsoluteConstraints(250, 450, 190, 50));

        viewBtn.setBackground(new Color(255, 255, 255));
        viewBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        viewBtn.setForeground(new Color(52, 74, 97));
        viewBtn.setText("View Records");
        viewBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel3.add(viewBtn, new AbsoluteConstraints(530, 450, 190, 50));

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
        String complaint = complaintFld.getText().trim();
        String record = recordFld.getText().trim();
        String note = notesFld.getText().trim();
        saveRecord(name, complaint, record, note);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void viewBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        ViewRecords rec = new ViewRecords();
        rec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewBtnActionPerformed

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
    
    protected void saveRecord(String fullname, String complaint, String record, String note) {
        db.connect();
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "Save this record?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
            
            if(confirm == JOptionPane.OK_OPTION) {
                if (!fullname.isEmpty() && !complaint.isEmpty() && !record.isEmpty() && !note.isEmpty()){ 
                    db.ps = db.sql_conn.prepareStatement("INSERT INTO medicalrecord(patient_name, complaint, record, note) VALUES(?,?,?,?)");

                    db.ps.setString(1, fullname);
                    db.ps.setString(2, complaint);
                    db.ps.setString(3, record);
                    db.ps.setString(4, note);

                    int check = db.ps.executeUpdate();

                    if (check == 1) {
                        JOptionPane.showMessageDialog(null, "Record Saved");
                    } else {
                        JOptionPane.showMessageDialog(null, "Can't Save Record!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JTextField complaintFld;
    JLabel jLabel1;
    JPanel jPanel1;
    JPanel jPanel3;
    JScrollPane jScrollPane2;
    JComboBox<String> nameFld;
    JTextArea notesFld;
    JTextField recordFld;
    JButton saveBtn;
    JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
