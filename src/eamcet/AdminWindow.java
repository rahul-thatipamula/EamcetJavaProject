 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eamcet;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rahul
 */
public class AdminWindow extends javax.swing.JFrame {

    /**
     * Creates new form AdminWindow
     */
    public AdminWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appInterface = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        registrationPanel = new javax.swing.JPanel();
        PayFee = new javax.swing.JButton();
        fillOnlineApplication1 = new javax.swing.JButton();
        printApplication = new javax.swing.JButton();
        feePaymentStatus = new javax.swing.JButton();
        notificationLayer = new javax.swing.JLayeredPane();
        paymentPanel = new javax.swing.JPanel();
        myAccountPanel = new javax.swing.JPanel();
        accountDetailsPanel = new javax.swing.JPanel();
        adminUserName = new javax.swing.JLabel();
        adminEmail = new javax.swing.JLabel();
        adminUsernameField = new javax.swing.JTextField();
        adminEmailField = new javax.swing.JTextField();
        changePassword = new javax.swing.JButton();
        passwordChangePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        currentPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        change = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        newRegistration = new javax.swing.JMenuItem();
        myAccount = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        appInterface.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("HOME");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        appInterface.add(homePanel, "card7");

        PayFee.setText("Pay Registration Fee");
        PayFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayFeeActionPerformed(evt);
            }
        });

        fillOnlineApplication1.setText("Fill Online Application");
        fillOnlineApplication1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillOnlineApplication1ActionPerformed(evt);
            }
        });

        printApplication.setText("Print Filled In Application");
        printApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printApplicationActionPerformed(evt);
            }
        });

        feePaymentStatus.setText("Know your fee payment status");

        javax.swing.GroupLayout registrationPanelLayout = new javax.swing.GroupLayout(registrationPanel);
        registrationPanel.setLayout(registrationPanelLayout);
        registrationPanelLayout.setHorizontalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addGroup(registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feePaymentStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(PayFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fillOnlineApplication1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(239, 239, 239))
        );
        registrationPanelLayout.setVerticalGroup(
            registrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(PayFee, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(fillOnlineApplication1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(printApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(feePaymentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        appInterface.add(registrationPanel, "card6");

        javax.swing.GroupLayout notificationLayerLayout = new javax.swing.GroupLayout(notificationLayer);
        notificationLayer.setLayout(notificationLayerLayout);
        notificationLayerLayout.setHorizontalGroup(
            notificationLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        notificationLayerLayout.setVerticalGroup(
            notificationLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        appInterface.add(notificationLayer, "card4");

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        appInterface.add(paymentPanel, "card6");

        myAccountPanel.setLayout(new java.awt.CardLayout());

        adminUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminUserName.setText("Username: ");

        adminEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminEmail.setText("Email : ");

        adminUsernameField.setEditable(false);
        adminUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUsernameFieldActionPerformed(evt);
            }
        });

        adminEmailField.setEditable(false);
        adminEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEmailFieldActionPerformed(evt);
            }
        });

        changePassword.setBackground(new java.awt.Color(255, 51, 51));
        changePassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        changePassword.setText("Change Password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountDetailsPanelLayout = new javax.swing.GroupLayout(accountDetailsPanel);
        accountDetailsPanel.setLayout(accountDetailsPanelLayout);
        accountDetailsPanelLayout.setHorizontalGroup(
            accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(adminEmailField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                        .addComponent(adminUsernameField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(496, 496, 496))
        );
        accountDetailsPanelLayout.setVerticalGroup(
            accountDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountDetailsPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(adminUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminEmail)
                .addGap(18, 18, 18)
                .addComponent(adminEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(changePassword)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        myAccountPanel.add(accountDetailsPanel, "card4");

        jLabel5.setText("New Password");

        change.setText("Change");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        jLabel4.setText("CurrentPassword");

        javax.swing.GroupLayout passwordChangePanelLayout = new javax.swing.GroupLayout(passwordChangePanel);
        passwordChangePanel.setLayout(passwordChangePanelLayout);
        passwordChangePanelLayout.setHorizontalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordChangePanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(passwordChangePanelLayout.createSequentialGroup()
                        .addGroup(passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPasswordField)
                            .addGroup(passwordChangePanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(224, 224, 224))
                            .addComponent(currentPasswordField))
                        .addGap(459, 459, 459))))
        );
        passwordChangePanelLayout.setVerticalGroup(
            passwordChangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordChangePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(change)
                .addGap(102, 102, 102))
        );

        myAccountPanel.add(passwordChangePanel, "card4");

        appInterface.add(myAccountPanel, "card4");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jMenu1.add(home);

        newRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newRegistration.png"))); // NOI18N
        newRegistration.setText("New Registration");
        newRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRegistrationActionPerformed(evt);
            }
        });
        jMenu1.add(newRegistration);

        myAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myaccount.png"))); // NOI18N
        myAccount.setText("My Account");
        myAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAccountActionPerformed(evt);
            }
        });
        jMenu1.add(myAccount);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appInterface, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        appInterface.removeAll();
        appInterface.add(homePanel);
        appInterface.repaint();
        appInterface.revalidate();

    }//GEN-LAST:event_homeActionPerformed

    private void myAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAccountActionPerformed
        appInterface.removeAll();
        appInterface.add(myAccountPanel);
        appInterface.repaint();
        appInterface.revalidate();


    }//GEN-LAST:event_myAccountActionPerformed

    private void newRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRegistrationActionPerformed
        appInterface.removeAll();
        appInterface.add(registrationPanel);
        appInterface.repaint();
        appInterface.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_newRegistrationActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void PayFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayFeeActionPerformed

        appInterface.removeAll();

        Payment p = new Payment();
//        ActionListener[] al = PayFee.getActionListeners();
//        Timer t = new Timer(100000000, al[0]);
//        t.stop();

        appInterface.add(p);
        appInterface.repaint();
        appInterface.revalidate();
        p.passRef(this);


    }//GEN-LAST:event_PayFeeActionPerformed

    public void backStatus() {

    }
    private void fillOnlineApplication1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillOnlineApplication1ActionPerformed
        // TODO add your handling code here:
        FillOnlineApplication obj = new FillOnlineApplication();
        obj.setVisible(true);
        this.setEnabled(false);
        obj.adminWindowReference(this);
    }//GEN-LAST:event_fillOnlineApplication1ActionPerformed

    private void adminUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUsernameFieldActionPerformed

    private void adminEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminEmailFieldActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        // TODO add your handling code here:
        myAccountPanel.removeAll();
        myAccountPanel.add(passwordChangePanel);
        myAccountPanel.repaint();
        myAccountPanel.revalidate();
    }//GEN-LAST:event_changePasswordActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeActionPerformed

    private void printApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printApplicationActionPerformed
        // TODO add your handling code here  
        appInterface.removeAll();
        appInterface.add(new PrintFilledApplication());
        appInterface.repaint();
        appInterface.revalidate();
    }//GEN-LAST:event_printApplicationActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    String adminEmailString = null;
    String adminPasswordString = null;

//    public void setAdminEmail(String email) {
//        adminEmailString = email;
//        adminEmailField.setText(email);
//    }

        public void accessAdminDetails(SetGetAdmin sga){
            adminEmailString = sga.getEmail();
            adminEmailField.setText(sga.getEmail());
        }
    public void setAdminPassword(String password) {
        adminPasswordString = password;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PayFee;
    private javax.swing.JPanel accountDetailsPanel;
    private javax.swing.JLabel adminEmail;
    private javax.swing.JTextField adminEmailField;
    private javax.swing.JLabel adminUserName;
    private javax.swing.JTextField adminUsernameField;
    public javax.swing.JPanel appInterface;
    private javax.swing.JButton change;
    private javax.swing.JButton changePassword;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton feePaymentStatus;
    private javax.swing.JButton fillOnlineApplication1;
    private javax.swing.JMenuItem home;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem myAccount;
    private javax.swing.JPanel myAccountPanel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JMenuItem newRegistration;
    private javax.swing.JLayeredPane notificationLayer;
    private javax.swing.JPanel passwordChangePanel;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JButton printApplication;
    public javax.swing.JPanel registrationPanel;
    // End of variables declaration//GEN-END:variables
}
