/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controls.Tools;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class Login extends javax.swing.JFrame {

    int mousex;
    int mousey;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        userTX.setBackground(new Color(0, 0, 0, 0));
        PasswordTX.setBackground(new Color(0, 0, 0, 0));
        DB.GoDB.icon(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userTX = new javax.swing.JTextField();
        PasswordTX = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(394, 2, 20, 20);

        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(4, 0, 380, 20);

        userTX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userTX.setForeground(new java.awt.Color(14, 97, 10));
        userTX.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        userTX.setOpaque(false);
        getContentPane().add(userTX);
        userTX.setBounds(98, 346, 270, 35);

        PasswordTX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordTX.setForeground(new java.awt.Color(14, 97, 10));
        PasswordTX.setBorder(null);
        PasswordTX.setOpaque(false);
        getContentPane().add(PasswordTX);
        PasswordTX.setBounds(98, 420, 270, 35);

        Login.setBackground(new java.awt.Color(17, 97, 10));
        Login.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 153, 102));
        Login.setText("?????????? ????????");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(91, 500, 283, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1220923.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 422, 596);

        setSize(new java.awt.Dimension(425, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_jLabel3MouseMoved

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            System.out.println(val);
            this.setOpacity(f);

            try {
                Thread.sleep(50);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        if (evt.getButton() == MouseEvent.BUTTON1) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String user = userTX.getText();
        String pass = PasswordTX.getText();

        Boolean l = DB.GoDB.checkUser(user, pass, Home.Emp, Accounts.EmpName2, Sale.EmpNameB, Home.job, Accounts.job);
        if (l) {
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "?????? ???????????????? ???? ???????? ???????????? ?????????? !");
            Tools.clearText(this);
            userTX.requestFocus();
        }
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JPasswordField PasswordTX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField userTX;
    // End of variables declaration//GEN-END:variables
}
