/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controls.Tools;
import DB.ConectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmed
 */
public class Setting extends javax.swing.JFrame {

    /**
     * Creates new form Setting
     */
    public Setting() {
        initComponents();
        Show.setVisible(false);
        Show.setEnabled(false);

        New.setVisible(false);
        New.setEnabled(false);
        
        jTEmp.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnew = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        home = new javax.swing.JButton();
        Show = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEmp = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        New = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jjobtitle = new javax.swing.JComboBox<>();
        salary = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnnew.setBackground(new java.awt.Color(255, 153, 102));
        btnnew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnew.setText("إضافة موظف جديد");
        btnnew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        getContentPane().add(btnnew);
        btnnew.setBounds(740, 90, 230, 50);

        btnshow.setBackground(new java.awt.Color(255, 153, 102));
        btnshow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnshow.setText("عرض الموظفين");
        btnshow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });
        getContentPane().add(btnshow);
        btnshow.setBounds(490, 90, 230, 50);

        home.setBackground(new java.awt.Color(255, 153, 102));
        home.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        home.setText("الصفحة الرئيسية");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(230, 90, 230, 50);

        Show.setOpaque(false);
        Show.setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        jTEmp.setBackground(new java.awt.Color(204, 204, 204));
        jTEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "أسم المستخدم", "المرتب", "الوظيفة", " الأسم", "الرقم"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTEmp);

        Show.add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 910, 270);

        delete.setBackground(new java.awt.Color(0, 51, 51));
        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 153, 102));
        delete.setText("حذف الموظف المحدد");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        Show.add(delete);
        delete.setBounds(750, 50, 180, 40);

        getContentPane().add(Show);
        Show.setBounds(20, 170, 950, 410);

        New.setOpaque(false);
        New.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("الأسم :");
        New.add(jLabel1);
        jLabel1.setBounds(770, 100, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("الوظيفة :");
        New.add(jLabel2);
        jLabel2.setBounds(770, 160, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("المرتب :");
        New.add(jLabel3);
        jLabel3.setBounds(770, 220, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("اسم المستخدم :");
        New.add(jLabel4);
        jLabel4.setBounds(770, 280, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("كلمة المرور :");
        New.add(jLabel5);
        jLabel5.setBounds(770, 340, 150, 30);

        name.setBackground(new java.awt.Color(204, 204, 204));
        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        New.add(name);
        name.setBounds(520, 100, 230, 30);

        jjobtitle.setBackground(new java.awt.Color(204, 204, 204));
        jjobtitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jjobtitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "مدير", "كاشير", "عامل", "دليفري" }));
        New.add(jjobtitle);
        jjobtitle.setBounds(520, 160, 230, 30);

        salary.setBackground(new java.awt.Color(204, 204, 204));
        salary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        New.add(salary);
        salary.setBounds(520, 220, 230, 30);

        username.setBackground(new java.awt.Color(204, 204, 204));
        username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        New.add(username);
        username.setBounds(520, 280, 230, 30);

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        New.add(password);
        password.setBounds(520, 340, 230, 30);

        save.setBackground(new java.awt.Color(0, 51, 51));
        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setForeground(new java.awt.Color(255, 153, 102));
        save.setText("حفظ");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        New.add(save);
        save.setBounds(220, 40, 220, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("الرقم :");
        New.add(jLabel7);
        jLabel7.setBounds(770, 40, 150, 30);

        ID.setEditable(false);
        ID.setBackground(new java.awt.Color(204, 204, 204));
        ID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        New.add(ID);
        ID.setBounds(520, 40, 230, 30);

        getContentPane().add(New);
        New.setBounds(20, 170, 950, 410);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4Q8KjI.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1001, 601);

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void listEmp() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("اسم المستخدم");
        table.addColumn("المرتب");
        table.addColumn("الوظيفة");
        table.addColumn("الاسم");
        table.addColumn("الرقم");

        try {
            Connection con = ConectionDB.setcon();
            String sqls = "SELECT * FROM EMPLOYEES";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sqls);

            while (rs.next()) {
                table.addRow(new Object[]{
                    rs.getString(5),
                    rs.getString(4),
                    rs.getString(3),
                    rs.getString(2),
                    rs.getString(1),});
                jTEmp.setModel(table);
            }
        } catch (Exception ex) {
        }
    }
    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        Show.setVisible(false);
        Show.setEnabled(false);

        New.setVisible(true);
        New.setEnabled(true);
        delete.setEnabled(false);
        jjobtitle.setSelectedItem(null);
        ID.setText(DB.GoDB.autoNumber("employees", "number"));
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        Show.setVisible(true);
        Show.setEnabled(true);

        New.setVisible(false);
        New.setEnabled(false);
        listEmp();
    }//GEN-LAST:event_btnshowActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.dispose();
    }//GEN-LAST:event_homeActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if ("".equals(ID.getText()) || "".equals(name.getText()) || "".equals(jjobtitle.getSelectedItem()) || "".equals(salary.getText()) || "".equals(username.getText()) || "".equals(password.getText())) {
            JOptionPane.showMessageDialog(this, "يجب ملئ البيانات", "خطأ", JOptionPane.WARNING_MESSAGE);
        } else {
            int co = JOptionPane.showConfirmDialog(this, "هل تريد حفظ البيانات", "تأكيد", JOptionPane.WARNING_MESSAGE);
            if (co == JOptionPane.YES_OPTION) {
                String add = "INSERT INTO EMPLOYEES VALUES (" + ID.getText() + ", '" + name.getText() + "', '" + jjobtitle.getSelectedItem() + "', '" + salary.getText() + "', '" + username.getText() + "', '" + password.getText() + "')";
                boolean ifS = DB.GoDB.runNunQuery(add);
                if (ifS) {
                    JOptionPane.showMessageDialog(this, "تم حفظ البيانات", "نجح", JOptionPane.WARNING_MESSAGE);
                    Tools.clearText(this);
                    jjobtitle.setSelectedItem(null);
                } else {
                    JOptionPane.showMessageDialog(this, "لم يتم حفظ البيانات", "خطأ", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jTEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTEmpMouseClicked
        delete.setEnabled(true);
    }//GEN-LAST:event_jTEmpMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
        int d = JOptionPane.showConfirmDialog(this, "هل تريد حذف الموظف المحدد ؟");
        if (d == JOptionPane.YES_OPTION) {
            int row = jTEmp.getSelectedRow();
            String num = jTEmp.getValueAt(row, 4).toString();
            String strD = "DELETE FROM EMPLOYEES WHERE NUMBER =" + num;
            boolean ifD = DB.GoDB.runNunQuery(strD);
            if (ifD) {
                JOptionPane.showMessageDialog(null, "تم حذف الموظف المحدد", "نجح", JOptionPane.WARNING_MESSAGE);
                listEmp();
                delete.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "لم يتم حذف الموظف", "خطأ", JOptionPane.WARNING_MESSAGE);
            }
        }
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DB.GoDB.icon(this);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JPanel New;
    private javax.swing.JPanel Show;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton delete;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTEmp;
    private javax.swing.JComboBox<String> jjobtitle;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField salary;
    private javax.swing.JButton save;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
