package com.healthcenter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
import java.sql.Statement;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class AppointmentScheduling extends javax.swing.JFrame {
    DBConnection db = new DBConnection();
    private DefaultTableModel tableModel;
    
    public AppointmentScheduling() {
        initComponents();
        showPatientstoComboBox();
        showAppointments();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        doctorFld = new JTextField();
        dateFld = new JTextField();
        timeFld = new JTextField();
        nameFld = new JComboBox<>();
        cancelAppBtn = new JButton();
        bookAppBtn = new JButton();
        jPanel3 = new JPanel();
        jScrollPane1 = new JScrollPane();
        listAppTbl = new JTable();
        searchFld = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(new AbsoluteLayout());

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

        jPanel2.setBackground(new Color(52, 74, 97));
        jPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Appointment Scheduling", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 18), new Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new AbsoluteLayout());

        doctorFld.setBackground(new Color(52, 74, 97));
        doctorFld.setForeground(new Color(255, 255, 255));
        doctorFld.setHorizontalAlignment(JTextField.CENTER);
        doctorFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Doctor Name", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(doctorFld, new AbsoluteConstraints(250, 50, 230, 50));

        dateFld.setBackground(new Color(52, 74, 97));
        dateFld.setForeground(new Color(255, 255, 255));
        dateFld.setHorizontalAlignment(JTextField.CENTER);
        dateFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Appointment Date", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(dateFld, new AbsoluteConstraints(500, 50, 200, 50));

        timeFld.setBackground(new Color(52, 74, 97));
        timeFld.setForeground(new Color(255, 255, 255));
        timeFld.setHorizontalAlignment(JTextField.CENTER);
        timeFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Appointment Time", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(timeFld, new AbsoluteConstraints(710, 50, 210, 50));

        nameFld.setBackground(new Color(52, 74, 97));
        nameFld.setForeground(new Color(255, 255, 255));
        nameFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Patient Name", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        jPanel2.add(nameFld, new AbsoluteConstraints(30, 50, 210, 50));

        cancelAppBtn.setBackground(new Color(255, 255, 255));
        cancelAppBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        cancelAppBtn.setForeground(new Color(52, 74, 97));
        cancelAppBtn.setText("Cancel Appointment");
        cancelAppBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelAppBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelAppBtn, new AbsoluteConstraints(730, 140, 190, 50));

        bookAppBtn.setBackground(new Color(255, 255, 255));
        bookAppBtn.setFont(new Font("SansSerif", 1, 14)); // NOI18N
        bookAppBtn.setForeground(new Color(52, 74, 97));
        bookAppBtn.setText("Book Appointment");
        bookAppBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bookAppBtnActionPerformed(evt);
            }
        });
        jPanel2.add(bookAppBtn, new AbsoluteConstraints(520, 140, 190, 50));

        jPanel3.setBackground(new Color(52, 74, 97));
        jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "List of Appointments", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 18), new Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new AbsoluteLayout());

        listAppTbl.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Doctor Name", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listAppTbl);

        jPanel3.add(jScrollPane1, new AbsoluteConstraints(20, 30, 860, 270));

        jPanel2.add(jPanel3, new AbsoluteConstraints(30, 200, 900, 320));

        searchFld.setBackground(new Color(52, 74, 97));
        searchFld.setForeground(new Color(255, 255, 255));
        searchFld.setHorizontalAlignment(JTextField.CENTER);
        searchFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Search Appointment", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        searchFld.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                searchFldKeyReleased(evt);
            }
        });
        jPanel2.add(searchFld, new AbsoluteConstraints(30, 140, 340, 50));

        jPanel1.add(jPanel2, new AbsoluteConstraints(20, 50, 950, 540));

        getContentPane().add(jPanel1, new AbsoluteConstraints(0, 0, 990, 610));

        setSize(new Dimension(990, 611));
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void jLabel1backBtn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1backBtn
        this.dispose();
        ActivityMain main = new ActivityMain();
        main.setVisible(true);
    }//GEN-LAST:event_jLabel1backBtn

    private void cancelAppBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cancelAppBtnActionPerformed
        cancelApp(getPatientID());
    }//GEN-LAST:event_cancelAppBtnActionPerformed

    public String getPatientID() {
        tableModel = (DefaultTableModel) listAppTbl.getModel();
        return tableModel.getValueAt(listAppTbl.getSelectedRow(), 0).toString();
    }
    
    public void cancelApp(String patientId) {
        db.connect();
        try
        {
            int delete;
            if(patientId.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid patient ID", "Message", JOptionPane.ERROR_MESSAGE);
            }
            else {
                delete = JOptionPane.showConfirmDialog(null, "Do you want to cancel this appointment?", "Message", JOptionPane.OK_CANCEL_OPTION);
                if(delete == JOptionPane.OK_OPTION) {
                db.ps = db.sql_conn.prepareStatement("DELETE FROM scheduleappointtbl WHERE appID = ?");
                db.ps.setString(1, patientId);
            
                int check = db.ps.executeUpdate();
            
                    if(check == 1)
                    {
                        JOptionPane.showMessageDialog(null, "Appointment Cancelled.","Message",JOptionPane.PLAIN_MESSAGE);
                        showAppointments();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Failed to cancel this appointment!","Message",JOptionPane.ERROR_MESSAGE);
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
    
    private void bookAppBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_bookAppBtnActionPerformed
        String fullname = nameFld.getSelectedItem().toString();
        String doc = doctorFld.getText().trim();
        String date = dateFld.getText().trim();
        String time = timeFld.getText().trim();
        
        bookApp(fullname, doc, date, time);
    }//GEN-LAST:event_bookAppBtnActionPerformed

    private void searchFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFldKeyReleased
        DefaultTableModel def = (DefaultTableModel) listAppTbl.getModel();
        final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);
          
        listAppTbl.setRowSorter(sor);
          
        String model = searchFld.getText();
        if(model.length() == 0)
        {
            sor.setRowFilter(null);
        }
        else{
            sor.setRowFilter(RowFilter.regexFilter(model));
        }
    }//GEN-LAST:event_searchFldKeyReleased

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
    
    protected void bookApp(String fullname, String doc, String date, String time) {
        db.connect();
        try {
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to add this appointment?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
            
            if(confirm == JOptionPane.OK_OPTION) {
                if (!fullname.isEmpty() && !doc.isEmpty() && !date.isEmpty() && !time.isEmpty()){ 
                    db.ps = db.sql_conn.prepareStatement("INSERT INTO scheduleappointtbl(patient_name, doctor_name, date, time) VALUES(?,?,?,?)");

                    db.ps.setString(1, fullname);
                    db.ps.setString(2, doc);
                    db.ps.setString(3, date);
                    db.ps.setString(4, time);

                    int check = db.ps.executeUpdate();

                    if (check == 1) {
                        JOptionPane.showMessageDialog(null, "Appointment Added");
                        showAppointments();
                    } else {
                        JOptionPane.showMessageDialog(null, "Can't add Appoinment!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        catch (NullPointerException i) {
            JOptionPane.showMessageDialog(null, "Error : " + i.getMessage());
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
    }
    
    protected void showAppointments() {
        db.connect();
        try {
            DefaultTableModel det = (DefaultTableModel) listAppTbl.getModel();
            
            det.setRowCount(0);
            Statement s = db.sql_conn.createStatement();
            db.rs = s.executeQuery("SELECT * FROM scheduleappointtbl");
            
            while(db.rs.next()) {
                Vector vec = new Vector();
                
                vec.add(db.rs.getString(1));
                vec.add(db.rs.getString(2));
                vec.add(db.rs.getString(3));
                vec.add(db.rs.getString(4));
                vec.add(db.rs.getString(5));
                det.addRow(vec);
            }
            
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton bookAppBtn;
    JButton cancelAppBtn;
    JTextField dateFld;
    JTextField doctorFld;
    JLabel jLabel1;
    JPanel jPanel1;
    JPanel jPanel2;
    JPanel jPanel3;
    JScrollPane jScrollPane1;
    JTable listAppTbl;
    JComboBox<String> nameFld;
    JTextField searchFld;
    JTextField timeFld;
    // End of variables declaration//GEN-END:variables
}
