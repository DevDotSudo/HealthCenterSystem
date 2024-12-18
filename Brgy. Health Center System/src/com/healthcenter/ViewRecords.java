
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
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class ViewRecords extends javax.swing.JFrame {
    DBConnection db = new DBConnection();
    private DefaultTableModel tableModel;

    public ViewRecords() {
        initComponents();
        showRecord();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        jScrollPane1 = new JScrollPane();
        recordList = new JTable();
        jScrollPane2 = new JScrollPane();
        noteFld = new JTextArea();
        jLabel2 = new JLabel();
        deleteBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
        jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Records List", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 18), new Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new AbsoluteLayout());

        recordList.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Chief Complaint", "Date of Record"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                recordListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(recordList);

        jPanel3.add(jScrollPane1, new AbsoluteConstraints(20, 40, 410, 450));

        noteFld.setEditable(false);
        noteFld.setColumns(20);
        noteFld.setFont(new Font("SansSerif", 1, 24)); // NOI18N
        noteFld.setForeground(new Color(51, 51, 51));
        noteFld.setRows(5);
        jScrollPane2.setViewportView(noteFld);

        jPanel3.add(jScrollPane2, new AbsoluteConstraints(460, 70, 450, 370));

        jLabel2.setFont(new Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Medical Notes");
        jPanel3.add(jLabel2, new AbsoluteConstraints(630, 40, 140, -1));

        deleteBtn.setBackground(new Color(255, 255, 255));
        deleteBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        deleteBtn.setForeground(new Color(52, 74, 97));
        deleteBtn.setText("Delete Record");
        deleteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel3.add(deleteBtn, new AbsoluteConstraints(720, 450, 190, 50));

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
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new Dimension(990, 610));
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void jLabel1backBtn(MouseEvent evt) {//GEN-FIRST:event_jLabel1backBtn
        this.dispose();
        ActivityMain main = new ActivityMain();
        main.setVisible(true);
    }//GEN-LAST:event_jLabel1backBtn

    private void recordListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_recordListMouseClicked
        db.connect();
        String note = null;
        String id = getPatientID();
        tableModel = (DefaultTableModel) recordList.getModel();
        
        noteFld.setLineWrap(true);
        noteFld.setWrapStyleWord(true);
        try {
            Statement s = db.sql_conn.createStatement();
            db.rs = s.executeQuery("SELECT note FROM medicalrecord WHERE recordID = '"+id+"'");
            
            while(db.rs.next()) {
                note = db.rs.getString(1);
            }
            noteFld.setText(note);
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_recordListMouseClicked

    private void deleteBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        deleteRecord(getPatientID());
    }//GEN-LAST:event_deleteBtnActionPerformed

    public void deleteRecord(String patientId) {
        db.connect();
        try
        {
            int delete;
            if(patientId.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid record ID", "Message", JOptionPane.ERROR_MESSAGE);
            }
            else {
                delete = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Message", JOptionPane.OK_CANCEL_OPTION);
                if(delete == JOptionPane.OK_OPTION) {
                db.ps = db.sql_conn.prepareStatement("DELETE FROM medicalrecord WHERE recordID = ?");
                db.ps.setString(1, patientId);
            
                int check = db.ps.executeUpdate();
            
                    if(check == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Record Deleted.","Message",JOptionPane.PLAIN_MESSAGE);
                        showRecord();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to delete this record!","Message",JOptionPane.ERROR_MESSAGE);
                    }
                    return;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    protected void showRecord() {
        db.connect();
        try {
            DefaultTableModel det = (DefaultTableModel) recordList.getModel();
            
            det.setRowCount(0);
            Statement s = db.sql_conn.createStatement();
            db.rs = s.executeQuery("SELECT * FROM medicalrecord");
            
            while(db.rs.next()) {
                Vector vec = new Vector();
                
                vec.add(db.rs.getString(1));
                vec.add(db.rs.getString(2));
                vec.add(db.rs.getString(3));
                vec.add(db.rs.getString(4));
                det.addRow(vec);
            }
            
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public String getPatientID() {
        tableModel = (DefaultTableModel) recordList.getModel();
        return tableModel.getValueAt(recordList.getSelectedRow(), 0).toString();
    }
    
    protected void displayNote(String id) {
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton deleteBtn;
    JLabel jLabel1;
    JLabel jLabel2;
    JPanel jPanel1;
    JPanel jPanel3;
    JScrollPane jScrollPane1;
    JScrollPane jScrollPane2;
    JTextArea noteFld;
    JTable recordList;
    // End of variables declaration//GEN-END:variables
}
