/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hib.hibernate.swing.designing;

import java.awt.Color;

/**
 *
 * @author tanis
 */
public class settings extends javax.swing.JFrame {

    /**
     * Creates new form settings
     */
    public settings() {
        initComponents();
        getContentPane().setBackground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton24 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton24.setBackground(new java.awt.Color(0, 0, 0));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hib/hibernate/swing/designing/HOME.jpg"))); // NOI18N
        jButton24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 10, 80, -1));

        jButton33.setBackground(new java.awt.Color(0, 0, 0));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hib/hibernate/swing/designing/settinglogo.jpg"))); // NOI18N
        jButton33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 40, 40));

        jButton30.setBackground(new java.awt.Color(0, 0, 0));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hib/hibernate/swing/designing/MAINLOGO.jpg"))); // NOI18N
        jButton30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jLabel28.setBackground(new java.awt.Color(51, 51, 51));
        jLabel28.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("    SETTINGS & PRIVACY");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 320, -1));

        jButton35.setBackground(new java.awt.Color(0, 0, 0));
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hib/hibernate/swing/designing/t&c_1.jpg"))); // NOI18N
        jButton35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "         FAQs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ink Free", 1, 18))); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, 140));

        jButton36.setBackground(new java.awt.Color(0, 0, 0));
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hib/hibernate/swing/designing/istockphoto-1143497137-170667a_1.jpg"))); // NOI18N
        jButton36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "     Terms & Cond", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ink Free", 1, 18))); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 210, 140));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hib/hibernate/swing/designing/wp4966861.jpg"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        new homeWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        new faqWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        new TCWindow().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton36ActionPerformed

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
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    // End of variables declaration//GEN-END:variables
}