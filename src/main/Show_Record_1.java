/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.HeadlessException;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.text.MessageFormat;
import javax.swing.*;
/**
 *
 * @author Xeeshan
 */
public class Show_Record_1 extends javax.swing.JFrame  {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    /**
     * Creates new form Show_Record
     */
    public Show_Record_1() {
        initComponents();
        conn= Connect_database.connecerDb();
        Update_table();
    }
    
     private void Update_table(){
       try{
           String sql="Select * from addmition  where Class='9th'";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           show_table.setModel(DbUtils.resultSetToTableModel(rs));
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }finally{
          closedatabse();
            }
       
       
       
         try{
           String sql="Select * from addmition  where Class='10th'";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           table_two.setModel(DbUtils.resultSetToTableModel(rs));
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
            } 
             finally{
          closedatabse();
            } 
         
         
         
         
         try{
           String sql="Select * from addmition  where Class='1st year'";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           table_three.setModel(DbUtils.resultSetToTableModel(rs));
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }finally{
         closedatabse();
            }
         
         
         
         
         try{
           String sql="Select * from addmition  where Class='2nd year'";
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           table_four.setModel(DbUtils.resultSetToTableModel(rs));
       } catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           }finally{
          closedatabse();
            } 
       
    }
     
     public void closedatabse(){
        
          try{
              rs.close();
              pst.close();
             }catch(Exception e){
                           }
            
     }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_two = new javax.swing.JTable();
        Print_table_two = new javax.swing.JButton();
        Delete_table_two = new javax.swing.JButton();
        search_txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_three = new javax.swing.JTable();
        Print_table_three = new javax.swing.JButton();
        Delete_table_three = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_four = new javax.swing.JTable();
        Print_table_four = new javax.swing.JButton();
        Delete_table_three1 = new javax.swing.JButton();
        Delete_table_four = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        show_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Record Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setOpaque(false);

        table_two.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table_two);

        Print_table_two.setText("Print");
        Print_table_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_table_twoActionPerformed(evt);
            }
        });

        Delete_table_two.setText("Delete");
        Delete_table_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_table_twoActionPerformed(evt);
            }
        });

        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_txtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(Delete_table_two)
                .addGap(18, 18, 18)
                .addComponent(Print_table_two)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Print_table_two)
                    .addComponent(Delete_table_two)
                    .addComponent(search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Class 10th", jPanel1);

        jPanel2.setOpaque(false);

        table_three.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table_three);

        Print_table_three.setText("Print");
        Print_table_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_table_threeActionPerformed(evt);
            }
        });

        Delete_table_three.setText("Delete");
        Delete_table_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_table_threeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Delete_table_three)
                .addGap(18, 18, 18)
                .addComponent(Print_table_three)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Print_table_three)
                    .addComponent(Delete_table_three))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("1st Year", jPanel2);

        jPanel3.setOpaque(false);

        table_four.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(table_four);

        Print_table_four.setText("Print");
        Print_table_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Print_table_fourActionPerformed(evt);
            }
        });

        Delete_table_three1.setText("Delete");
        Delete_table_three1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_table_three1ActionPerformed(evt);
            }
        });

        Delete_table_four.setText("Delete");
        Delete_table_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_table_fourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Delete_table_four)
                .addGap(18, 18, 18)
                .addComponent(Print_table_four)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(421, 421, 421)
                    .addComponent(Delete_table_three1)
                    .addContainerGap(631, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Print_table_four)
                    .addComponent(Delete_table_four))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(244, 244, 244)
                    .addComponent(Delete_table_three1)
                    .addContainerGap(255, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("2nd Year", jPanel3);

        show_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(show_table);

        jTabbedPane1.addTab("Class 9th", jScrollPane1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 59, 1120, 550));
        jTabbedPane1.getAccessibleContext().setAccessibleParent(jTabbedPane1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Background_Form.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 730));

        jMenu1.setText("File");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Addmition");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("LogOut");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Exit");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Update");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("view");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Show Record");
        jMenuItem1.setEnabled(false);
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Fee Page");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
     
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void Print_table_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_table_twoActionPerformed
   MessageFormat header =new MessageFormat("Report Print");
     MessageFormat footer =new MessageFormat("page{0,number,integer}");
        try{
          table_two.print(JTable.PrintMode.NORMAL,header,footer);
      }catch(java.awt.print.PrinterException e){
          
          System.err.format("connot Print %s%n", e.getMessage());
      }
    }//GEN-LAST:event_Print_table_twoActionPerformed

    private void Print_table_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_table_threeActionPerformed
        MessageFormat header =new MessageFormat("Report Print");
     MessageFormat footer =new MessageFormat("page{0,number,integer}");
        try{
          table_three.print(JTable.PrintMode.NORMAL,header,footer);
      }catch(java.awt.print.PrinterException e){
          
          System.err.format("connot Print %s%n", e.getMessage());
      }
    }//GEN-LAST:event_Print_table_threeActionPerformed

    private void Print_table_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Print_table_fourActionPerformed
       MessageFormat header =new MessageFormat("Report Print");
     MessageFormat footer =new MessageFormat("page{0,number,integer}");
        try{
          table_four.print(JTable.PrintMode.NORMAL,header,footer);
      }catch(java.awt.print.PrinterException e){
          
          System.err.format("connot Print %s%n", e.getMessage());
      }
    }//GEN-LAST:event_Print_table_fourActionPerformed

    private void Delete_table_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_table_twoActionPerformed
        
         try{
             String sql= "delete  from  addmition where G_R_number=? ";
            int row =table_two.getSelectedRow();
           String Tabel_click=(table_two.getModel().getValueAt(row, 0).toString()); 
           pst=conn.prepareStatement(sql);
           pst.setString(1,Tabel_click );
           pst.execute();
           JOptionPane.showMessageDialog(null," Deleted" );
       }catch(SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);   
    }finally{
          closedatabse();
            }
         Update_table();
    }//GEN-LAST:event_Delete_table_twoActionPerformed

    private void Delete_table_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_table_threeActionPerformed
           try{
             String sql= "delete  from  addmition where G_R_number=? ";
            int row =table_three.getSelectedRow();
           String Tabel_click=(table_three.getModel().getValueAt(row, 0).toString()); 
           pst=conn.prepareStatement(sql);
           pst.setString(1,Tabel_click );
           pst.execute();
           JOptionPane.showMessageDialog(null," Deleted" );
       }catch(SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);   
    }finally{
         closedatabse();
            }
         Update_table();
    }//GEN-LAST:event_Delete_table_threeActionPerformed

    private void Delete_table_three1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_table_three1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete_table_three1ActionPerformed

    private void Delete_table_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_table_fourActionPerformed
        try{
             String sql= "delete  from  addmition where G_R_number=? ";
            int row =table_four.getSelectedRow();
           String Tabel_click=(table_four.getModel().getValueAt(row, 0).toString()); 
           pst=conn.prepareStatement(sql);
           pst.setString(1,Tabel_click );
           pst.execute();
           JOptionPane.showMessageDialog(null," Deleted" );
       }catch(SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);   
    }finally{
          closedatabse();
            }
         Update_table();
    }//GEN-LAST:event_Delete_table_fourActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        Addnition_page add=new Addnition_page();
        add.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Login_page log =new Login_page();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Update_page u= new Update_page();
        u.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Show_Record_1 s= new Show_Record_1();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        fee_info f= new fee_info();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void search_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_search_txtKeyTyped

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
           try{
               String sql="Select * from addmition where G_R_Number=?";
            pst= conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            rs=pst.executeQuery();
            table_two.setModel(DbUtils.resultSetToTableModel(rs));   
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
         closedatabse();
            }    
           
           
           
           try{
               String sql="Select * from addmition where Name=?";
            pst= conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            rs=pst.executeQuery();
            table_two.setModel(DbUtils.resultSetToTableModel(rs));   
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
         closedatabse();
            }    
    }//GEN-LAST:event_search_txtKeyReleased

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
            java.util.logging.Logger.getLogger(Show_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Record_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_table_four;
    private javax.swing.JButton Delete_table_three;
    private javax.swing.JButton Delete_table_three1;
    private javax.swing.JButton Delete_table_two;
    private javax.swing.JButton Print_table_four;
    private javax.swing.JButton Print_table_three;
    private javax.swing.JButton Print_table_two;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField search_txt;
    private javax.swing.JTable show_table;
    private javax.swing.JTable table_four;
    private javax.swing.JTable table_three;
    private javax.swing.JTable table_two;
    // End of variables declaration//GEN-END:variables
}
