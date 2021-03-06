/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entity.DashboardChart;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author ahmed
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        
        DashboardChart dashb = new DashboardChart();
        
        BarChart.removeAll();
        dashb.getBarChart(BarChart);
        BarChart.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productsbtn = new javax.swing.JButton();
        salebtn = new javax.swing.JButton();
        accontsbtn = new javax.swing.JButton();
        storedbtn = new javax.swing.JButton();
        reportsbtn = new javax.swing.JButton();
        Time = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        employeesbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        BarChart = new javax.swing.JPanel();
        backgraund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        productsbtn.setBackground(new java.awt.Color(255, 153, 102));
        productsbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productsbtn.setText("??????????????");
        productsbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productsbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productsbtnMouseExited(evt);
            }
        });
        productsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(productsbtn);
        productsbtn.setBounds(40, 110, 300, 60);

        salebtn.setBackground(new java.awt.Color(255, 153, 102));
        salebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salebtn.setText("??????");
        salebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salebtnMouseExited(evt);
            }
        });
        salebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salebtnActionPerformed(evt);
            }
        });
        getContentPane().add(salebtn);
        salebtn.setBounds(40, 230, 300, 60);

        accontsbtn.setBackground(new java.awt.Color(255, 153, 102));
        accontsbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accontsbtn.setText("????????????????");
        accontsbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accontsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accontsbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accontsbtnMouseExited(evt);
            }
        });
        accontsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accontsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(accontsbtn);
        accontsbtn.setBounds(40, 350, 300, 60);

        storedbtn.setBackground(new java.awt.Color(255, 153, 102));
        storedbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        storedbtn.setText("????????????");
        storedbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        storedbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storedbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storedbtnMouseExited(evt);
            }
        });
        storedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storedbtnActionPerformed(evt);
            }
        });
        getContentPane().add(storedbtn);
        storedbtn.setBounds(40, 470, 300, 60);

        reportsbtn.setBackground(new java.awt.Color(255, 153, 102));
        reportsbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reportsbtn.setText("????????????????");
        reportsbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportsbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportsbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportsbtnMouseExited(evt);
            }
        });
        reportsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsbtnActionPerformed(evt);
            }
        });
        getContentPane().add(reportsbtn);
        reportsbtn.setBounds(40, 600, 300, 60);

        Time.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Time);
        Time.setBounds(950, 10, 230, 60);

        Date.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Date);
        Date.setBounds(70, 10, 230, 60);

        employeesbtn.setBackground(new java.awt.Color(255, 153, 102));
        employeesbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_employee_card_50px.png"))); // NOI18N
        employeesbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesbtnActionPerformed(evt);
            }
        });
        getContentPane().add(employeesbtn);
        employeesbtn.setBounds(1293, 10, 60, 60);

        logoutbtn.setBackground(new java.awt.Color(255, 153, 102));
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_logout_rounded_left_50px.png"))); // NOI18N
        logoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn);
        logoutbtn.setBounds(1220, 10, 60, 60);

        Emp.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        Emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Emp);
        Emp.setBounds(520, 10, 230, 60);

        job.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        job.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(job);
        job.setBounds(590, 75, 90, 25);

        BarChart.setLayout(new java.awt.BorderLayout());
        getContentPane().add(BarChart);
        BarChart.setBounds(400, 110, 950, 550);

        backgraund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1624873.jpg"))); // NOI18N
        getContentPane().add(backgraund);
        backgraund.setBounds(0, 0, 1366, 705);

        setSize(new java.awt.Dimension(1381, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void time() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
                String texts_date = sdf.format(new Date());
                Time.setText(texts_date);
            }

        }).start();

    }
    
    public void btnChingColor(JButton hover, Color rang, Color font) {
        hover.setBackground(rang);
        hover.setForeground(font);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DB.GoDB.icon(this);
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd E");

        Date.setText(f.format(d));
        time();
        if(!job.getText().equals("????????")){
            productsbtn.setEnabled(false);
            reportsbtn.setEnabled(false);
            employeesbtn.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void productsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsbtnActionPerformed
      Categories c =  new Categories();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productsbtnActionPerformed

    private void storedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storedbtnActionPerformed
        new Search().setVisible(true);
    }//GEN-LAST:event_storedbtnActionPerformed

    private void accontsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accontsbtnActionPerformed
        new Accounts().setVisible(true);
    }//GEN-LAST:event_accontsbtnActionPerformed

    private void salebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salebtnActionPerformed
        this.dispose();
        new Sale().setVisible(true);
    }//GEN-LAST:event_salebtnActionPerformed

    private void employeesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesbtnActionPerformed
        new Setting().setVisible(true);
    }//GEN-LAST:event_employeesbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void reportsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsbtnActionPerformed
        new ReportsFrm().setVisible(true);
    }//GEN-LAST:event_reportsbtnActionPerformed

    private void productsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsbtnMouseEntered
        btnChingColor(productsbtn, new Color(0,0,0), new Color(255,153,102));
    }//GEN-LAST:event_productsbtnMouseEntered

    private void productsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsbtnMouseExited
        btnChingColor(productsbtn, new Color(255,153,102), new Color(0,0,0));
    }//GEN-LAST:event_productsbtnMouseExited

    private void salebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salebtnMouseEntered
        btnChingColor(salebtn, new Color(0,0,0), new Color(255,153,102));
    }//GEN-LAST:event_salebtnMouseEntered

    private void salebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salebtnMouseExited
        btnChingColor(salebtn, new Color(255,153,102), new Color(0,0,0));
    }//GEN-LAST:event_salebtnMouseExited

    private void accontsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accontsbtnMouseEntered
        btnChingColor(accontsbtn, new Color(0,0,0), new Color(255,153,102));
    }//GEN-LAST:event_accontsbtnMouseEntered

    private void accontsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accontsbtnMouseExited
        btnChingColor(accontsbtn, new Color(255,153,102), new Color(0,0,0));
    }//GEN-LAST:event_accontsbtnMouseExited

    private void storedbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storedbtnMouseEntered
        btnChingColor(storedbtn, new Color(0,0,0), new Color(255,153,102));
    }//GEN-LAST:event_storedbtnMouseEntered

    private void storedbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storedbtnMouseExited
        btnChingColor(storedbtn, new Color(255,153,102), new Color(0,0,0));
    }//GEN-LAST:event_storedbtnMouseExited

    private void reportsbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsbtnMouseEntered
        btnChingColor(reportsbtn, new Color(0,0,0), new Color(255,153,102));
    }//GEN-LAST:event_reportsbtnMouseEntered

    private void reportsbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsbtnMouseExited
        btnChingColor(reportsbtn, new Color(255,153,102), new Color(0,0,0));
    }//GEN-LAST:event_reportsbtnMouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarChart;
    private javax.swing.JLabel Date;
    public static final javax.swing.JLabel Emp = new javax.swing.JLabel();
    private javax.swing.JLabel Time;
    private javax.swing.JButton accontsbtn;
    private javax.swing.JLabel backgraund;
    private javax.swing.JButton employeesbtn;
    public static final javax.swing.JLabel job = new javax.swing.JLabel();
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton productsbtn;
    private javax.swing.JButton reportsbtn;
    private javax.swing.JButton salebtn;
    private javax.swing.JButton storedbtn;
    // End of variables declaration//GEN-END:variables
}
