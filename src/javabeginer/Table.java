
package javabeginer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Table extends javax.swing.JFrame {
    
    DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
Date date = new Date();
Calendar cal =Calendar.getInstance();
DefaultTableModel model;
    public Table() {
        initComponents();
        model = (DefaultTableModel) jtable.getModel();
        dateT.setText(""+ dateFormat.format(date));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Number = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        NameT = new javax.swing.JTextField();
        ageT = new javax.swing.JTextField();
        numberT = new javax.swing.JTextField();
        idT = new javax.swing.JTextField();
        Date = new javax.swing.JLabel();
        dateT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        batN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        deleteT = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Bio Data");

        Name.setText("Name :");

        Number.setText("Number :");

        Id.setText("Id Number :");

        Age.setText("Age :");

        NameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTActionPerformed(evt);
            }
        });

        ageT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTActionPerformed(evt);
            }
        });

        numberT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTActionPerformed(evt);
            }
        });

        Date.setText("Date :");

        dateT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTActionPerformed(evt);
            }
        });

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Name", "Age", "Number", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable);
        if (jtable.getColumnModel().getColumnCount() > 0) {
            jtable.getColumnModel().getColumn(0).setHeaderValue("Date");
            jtable.getColumnModel().getColumn(1).setHeaderValue("Name");
            jtable.getColumnModel().getColumn(2).setHeaderValue("Age");
            jtable.getColumnModel().getColumn(3).setHeaderValue("Number");
            jtable.getColumnModel().getColumn(4).setHeaderValue("Id");
        }

        batN.setText("OK");
        batN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batNActionPerformed(evt);
            }
        });

        jButton1.setText("clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deleteT.setText("Delete");
        deleteT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(batN, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(deleteT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Id)
                        .addGap(18, 18, 18)
                        .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Name)
                            .addComponent(Age))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ageT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NameT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Number)
                        .addGap(18, 18, 18)
                        .addComponent(numberT, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 75, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ageT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Date))
                            .addComponent(Age))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number)
                            .addComponent(numberT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(batN)
                    .addComponent(jButton1)
                    .addComponent(deleteT))
                .addGap(119, 119, 119))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTActionPerformed

    private void numberTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTActionPerformed

    private void NameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTActionPerformed

    private void batNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batNActionPerformed
        
  model.insertRow(model.getRowCount(),new Object[]
  {dateT.getText(),NameT.getText(),ageT.getText(),numberT.getText(),idT.getText()});
        
   

    }//GEN-LAST:event_batNActionPerformed

    private void dateTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTActionPerformed

    }//GEN-LAST:event_dateTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
NameT.setText("");ageT.setText("");idT.setText("");numberT.setText("");       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTActionPerformed

@SuppressWarnings("LocalVariableHidesMemberVariable")
DefaultTableModel model=(DefaultTableModel) jtable.getModel();
try{
int SelectedRawIndex =jtable.getSelectedRow();
model.removeRow(SelectedRawIndex);
}catch (Exception ex)
{

JOptionPane.showMessageDialog( null,"select a proudect");
}


    }//GEN-LAST:event_deleteTActionPerformed

    
  
    
    
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
         @SuppressWarnings("LocalVariableHidesMemberVariable")
         DefaultTableModel model=(DefaultTableModel)jtable.getModel();
         if(jtable.getSelectedRow()==-1){
             if(jtable.getRowCount()==0){
            JOptionPane.showMessageDialog( null,"Table is empty");

             }else{
             JOptionPane.showMessageDialog( null,"You must select a proudect");

             }
         }else{
         model.setValueAt(NameT.getText(), jtable.getSelectedRow(),1);
         model.setValueAt(ageT.getText(), jtable.getSelectedRow(),2);
         model.setValueAt(dateT.getText(), jtable.getSelectedRow(),0);
         model.setValueAt(numberT.getText(), jtable.getSelectedRow(),3);
         model.setValueAt(idT.getText(), jtable.getSelectedRow(),4);
         
         }
         
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableMouseClicked
         @SuppressWarnings("LocalVariableHidesMemberVariable")
         DefaultTableModel model=(DefaultTableModel)jtable.getModel();
         NameT.setText(model.getValueAt(jtable.getSelectedRow(), 1).toString());
         ageT.setText(model.getValueAt(jtable.getSelectedRow(), 2).toString());
         dateT.setText(model.getValueAt(jtable.getSelectedRow(), 0).toString());
         numberT.setText(model.getValueAt(jtable.getSelectedRow(), 3).toString());
         idT.setText(model.getValueAt(jtable.getSelectedRow(), 4).toString());

         
         
    }//GEN-LAST:event_jtableMouseClicked

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
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameT;
    private javax.swing.JLabel Number;
    private javax.swing.JButton Update;
    private javax.swing.JTextField ageT;
    private javax.swing.JButton batN;
    private javax.swing.JTextField dateT;
    private javax.swing.JButton deleteT;
    private javax.swing.JTextField idT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField numberT;
    // End of variables declaration//GEN-END:variables

}

