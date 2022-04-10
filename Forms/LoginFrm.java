/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controls.Tools;
import Entity.Login;
import java.awt.Color;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class LoginFrm extends javax.swing.JFrame {

    int mousex;
    int mousey;
    
    /**
     * Creates new form LoginFrm
     */
    public LoginFrm() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closebtn = new javax.swing.JLabel();
        minibtn = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JLabel();
        bar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        getContentPane().add(closebtn);
        closebtn.setBounds(331, 7, 21, 20);

        minibtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minibtnMouseClicked(evt);
            }
        });
        getContentPane().add(minibtn);
        minibtn.setBounds(308, 7, 20, 20);

        usernameTxt.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(0, 0, 0));
        usernameTxt.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        usernameTxt.setBorder(null);
        usernameTxt.setOpaque(false);
        getContentPane().add(usernameTxt);
        usernameTxt.setBounds(44, 341, 222, 25);

        passTxt.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        passTxt.setBorder(null);
        passTxt.setOpaque(false);
        passTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTxtActionPerformed(evt);
            }
        });
        getContentPane().add(passTxt);
        passTxt.setBounds(44, 393, 222, 25);

        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        getContentPane().add(loginbtn);
        loginbtn.setBounds(39, 457, 232, 28);

        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                barMouseMoved(evt);
            }
        });
        getContentPane().add(bar);
        bar.setBounds(8, 5, 295, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 370, 550);

        setSize(new java.awt.Dimension(365, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        int ifY = JOptionPane.showConfirmDialog(null, "هل تريد إغلاق البرنامج ؟");
        if (ifY == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_closebtnMouseClicked
    Login l = new Login();
    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        try {
            if (usernameTxt.getText().equals("") || passTxt.getText().equals("")) {
                Tools.msgbox("يجب ادخال اسم المستخدم وكلمة المرور أولا !!");
            } else {
                l.setUsername(usernameTxt.getText());
                l.setPassword(passTxt.getText());
                boolean isLogin = l.loginGO();
                if (isLogin) {
                    this.dispose();
                    Tools.openFram(new HomeFrm());
                } else {
                    Tools.msgbox("خطأ في اسم المستخدم او كلمة المرور!! ");
                    passTxt.setText("");
                    usernameTxt.requestFocus();
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_loginbtnMouseClicked

    private void passTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTxtActionPerformed
        try {
            if (usernameTxt.getText().equals("") || passTxt.getText().equals("")) {
                Tools.msgbox("يجب ادخال اسم المستخدم وكلمة المرور أولا !!");
            } else {
                l.setUsername(usernameTxt.getText());
                l.setPassword(passTxt.getText());
                boolean isLogin = l.loginGO();
                if (isLogin) {
                    this.dispose();
                    Tools.openFram(new HomeFrm());
                } else {
                    Tools.msgbox("خطأ في اسم المستخدم او كلمة المرور!! ");
                    passTxt.setText("");
                    usernameTxt.requestFocus();
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_passTxtActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);

            try {
                Thread.sleep(50);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        usernameTxt.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void minibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.setState(WIDTH);
        }
    }//GEN-LAST:event_minibtnMouseClicked

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_barMouseDragged

    private void barMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseMoved
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_barMouseMoved

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
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bar;
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginbtn;
    private javax.swing.JLabel minibtn;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
