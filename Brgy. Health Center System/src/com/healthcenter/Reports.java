
package com.healthcenter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.sql.Statement;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Reports extends javax.swing.JFrame {
    DBConnection db = new DBConnection();
    
    public Reports() {
        initComponents();
        showReports();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        jScrollPane2 = new JScrollPane();
        listReports = new JTable();
        searchFld = new JTextField();

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
        jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Reports List", TitledBorder.CENTER, TitledBorder.TOP, new Font("SansSerif", 1, 18), new Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new AbsoluteLayout());

        listReports.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Birthdate", "medication name", "dosage", "instruction", "doctor_name", "status", "refills", "allergies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listReports);

        jPanel3.add(jScrollPane2, new AbsoluteConstraints(30, 40, 870, -1));

        jPanel1.add(jPanel3, new AbsoluteConstraints(30, 80, 930, 500));

        searchFld.setBackground(new Color(52, 74, 97));
        searchFld.setForeground(new Color(255, 255, 255));
        searchFld.setHorizontalAlignment(JTextField.CENTER);
        searchFld.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)), "Search Record", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe UI", 0, 12), new Color(255, 255, 255))); // NOI18N
        searchFld.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                searchFldKeyReleased(evt);
            }
        });
        jPanel1.add(searchFld, new AbsoluteConstraints(680, 20, 280, 50));

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

    private void jLabel1backBtn(MouseEvent evt) {//GEN-FIRST:event_jLabel1backBtn
        this.dispose();
        ActivityMain main = new ActivityMain();
        main.setVisible(true);
    }//GEN-LAST:event_jLabel1backBtn

    private void searchFldKeyReleased(KeyEvent evt) {//GEN-FIRST:event_searchFldKeyReleased
        DefaultTableModel def = (DefaultTableModel) listReports.getModel();
        final TableRowSorter<TableModel> sor = new TableRowSorter<>(def);

        listReports.setRowSorter(sor);

        String model = searchFld.getText();
        if(model.length() == 0)
        {
            sor.setRowFilter(null);
        }
        else{
            sor.setRowFilter(RowFilter.regexFilter(model));
        }
    }//GEN-LAST:event_searchFldKeyReleased

    protected void showReports() {
        db.connect();
        try {
            DefaultTableModel det = (DefaultTableModel) listReports.getModel();
            
            det.setRowCount(0);
            Statement s = db.sql_conn.createStatement();
            db.rs = s.executeQuery("SELECT * FROM prescriptionmanagement");
            
            while(db.rs.next()) {
                Vector vec = new Vector();
                
                vec.add(db.rs.getString(1));
                vec.add(db.rs.getString(2));
                vec.add(db.rs.getString(3));
                vec.add(db.rs.getString(4));
                vec.add(db.rs.getString(5));
                vec.add(db.rs.getString(6));
                vec.add(db.rs.getString(7));
                vec.add(db.rs.getString(8));
                vec.add(db.rs.getString(9));
                det.addRow(vec);
            }
            
        }catch(Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    JLabel jLabel1;
    JPanel jPanel1;
    JPanel jPanel3;
    JScrollPane jScrollPane2;
    JTable listReports;
    JTextField searchFld;
    // End of variables declaration//GEN-END:variables
}
