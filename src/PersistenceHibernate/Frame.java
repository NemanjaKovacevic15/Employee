package PersistenceHibernate;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nemanja
 */
public class Frame extends javax.swing.JFrame {
    public int selectedRow;
    public static int selectedValueUpdate;
    DefaultTableModel dtm;
  
 public void resetTable(){
 dtm = (DefaultTableModel)this.jTable1.getModel();
 dtm.setRowCount(0);
    }
 
 
 public void getAll() {
     CrudSecondEngine cc2 = new CrudSecondEngine();
     cc2.ListAll();
     List<Employee> Emplist = cc2.Elist;
     Object[] columnNames = {"id", "name", "address", "age", "wage"};
     dtm = new DefaultTableModel(new Object[0][0], columnNames);
        for (Employee eee : Emplist) {
            Object[] o = new Object[5];
            o[0] = eee.getID();
            o[1] = eee.getName();
            o[2] = eee.getAddress();
            o[3] = eee.getAge();
            o[4] = eee.getWage();
            dtm.addRow(o);
        }
        jTable1.setModel(dtm);
 }
 
 public void getSpec(String criteria) {
     CrudSecondEngine cc2 = new CrudSecondEngine();
     cc2.ListSpecified(criteria);
     List<Employee> Emplist = cc2.Elist;
     Object[] columnNames = {"id", "name", "address", "age", "wage"};
     dtm = new DefaultTableModel(new Object[0][0], columnNames);
        for (Employee eee : Emplist) {
            Object[] o = new Object[5];
            o[0] = eee.getID();
            o[1] = eee.getName();
            o[2] = eee.getAddress();
            o[3] = eee.getAge();
            o[4] = eee.getWage();
            dtm.addRow(o);
        }
        jTable1.setModel(dtm);
 }
 
    public Frame() throws SQLException  {
        initComponents();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAll = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        TFsearchz = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDEL = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "id", "ime", "adresa", "godine", "plata"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        btnAll.setText("Lista Zaposlenih");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });

        jButton1.setText("Nov Zaposleni");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSearch.setText("Pretraži");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Unesite Ime i Adresu Za Pretragu");

        btnDEL.setText("Izbriši");
        btnDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELActionPerformed(evt);
            }
        });

        jLabel2.setText("Izaberite Opciju");

        update.setText("Promeni");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        RefreshBtn.setText("Osveži");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAll, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TFsearchz))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDEL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RefreshBtn)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAll)
                    .addComponent(TFsearchz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSearch)
                    .addComponent(jLabel1)
                    .addComponent(btnDEL)
                    .addComponent(update)
                    .addComponent(RefreshBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
         resetTable();
            try {
            getAll();} 
            catch (Exception ex) {System.out.println(" ne radi list");   }
    }//GEN-LAST:event_btnAllActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        newEmpl n = new newEmpl();
        n.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELActionPerformed
      CrudEngine cc = new CrudEngine();
      selectedRow = jTable1.getSelectedRow();
      if(selectedRow!=-1){
      int selectedValue = Integer.parseInt( jTable1.getValueAt(selectedRow, 0).toString() );
     try {
         cc.Delete(selectedValue);
     } catch (Exception ex) {System.out.println("deleting failed "+ex);}
        resetTable(); 
        try {
         getAll();
                        } catch (Exception ex) {System.out.println(" ne radi delete");   }
      }else{JOptionPane.showMessageDialog(rootPane, "Please select an employee!");};
    }//GEN-LAST:event_btnDELActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        selectedRow = jTable1.getSelectedRow();
        if(selectedRow!=-1){
            selectedValueUpdate = Integer.parseInt( jTable1.getValueAt(selectedRow, 0).toString() );
            editEmploy e = new editEmploy();
            e.setVisible(true);
            
        }else{JOptionPane.showMessageDialog(rootPane, "Please select an employee!");};
    }//GEN-LAST:event_updateActionPerformed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        resetTable();
        try {
          getAll();} 
        catch (Exception ex) { System.out.println("ne radi refresh");  }
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String SchParam = TFsearchz.getText();
        
        if(SchParam!=null){
            try {
                getSpec(SchParam);
            } catch (Exception ex) {
                System.out.println("searching error");
            }
        }else {JOptionPane.showMessageDialog(rootPane, "No given parameters!");};
        
    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTextField TFsearchz;
    private javax.swing.JButton btnAll;
    private javax.swing.JButton btnDEL;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
