/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eamcet;

/**
 *
 * @author Rahul
 */
public class StudentWindow extends javax.swing.JFrame {

    /**
     * Creates new form StudentWindow
     */
    
    String mobileNumber = null,password =null;
    public StudentWindow() {
        initComponents();
    }
    
    public StudentWindow(String mobileNumber,String password){
        this.mobileNumber = mobileNumber;
        this.password =  password;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        studentFormPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        studentAccountPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        studentForm = new javax.swing.JMenuItem();
        studentMyAccount = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        containerPanel.setLayout(new java.awt.CardLayout());

        jButton1.setText("jButton1");

        javax.swing.GroupLayout studentFormPanelLayout = new javax.swing.GroupLayout(studentFormPanel);
        studentFormPanel.setLayout(studentFormPanelLayout);
        studentFormPanelLayout.setHorizontalGroup(
            studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentFormPanelLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jButton1)
                .addContainerGap(384, Short.MAX_VALUE))
        );
        studentFormPanelLayout.setVerticalGroup(
            studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentFormPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButton1)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        containerPanel.add(studentFormPanel, "card2");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout studentAccountPanelLayout = new javax.swing.GroupLayout(studentAccountPanel);
        studentAccountPanel.setLayout(studentAccountPanelLayout);
        studentAccountPanelLayout.setHorizontalGroup(
            studentAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentAccountPanelLayout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );
        studentAccountPanelLayout.setVerticalGroup(
            studentAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentAccountPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        containerPanel.add(studentAccountPanel, "card3");

        jMenu1.setText("Menu");

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jMenu1.add(home);

        studentForm.setText("MyForm");
        studentForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentFormActionPerformed(evt);
            }
        });
        jMenu1.add(studentForm);

        studentMyAccount.setText("My Account");
        studentMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMyAccountActionPerformed(evt);
            }
        });
        jMenu1.add(studentMyAccount);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentFormActionPerformed
            containerPanel.removeAll();
            containerPanel.add(studentFormPanel);
            containerPanel.repaint();
            containerPanel.revalidate();
    }//GEN-LAST:event_studentFormActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_exitActionPerformed

    private void studentMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMyAccountActionPerformed
containerPanel.removeAll();
            containerPanel.add(studentAccountPanel
            );
            containerPanel.repaint();
            containerPanel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_studentMyAccountActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(StudentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel studentAccountPanel;
    private javax.swing.JMenuItem studentForm;
    private javax.swing.JPanel studentFormPanel;
    private javax.swing.JMenuItem studentMyAccount;
    // End of variables declaration//GEN-END:variables
}
