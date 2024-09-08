
package windows;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Edizon Alexander Meza Leal
 * @author John Esteban Lievano Mendez
 * @author Samuel David Loaiza Ocampo
 * @author Andres Elias Roa Puentes
 */
public class login extends javax.swing.JFrame {


        

    /**
     * Creates new form login
     */
    public login() {
      
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("assets/logo_asuServicio(1).png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_salir = new javax.swing.JButton();
        jLabel_user_logo = new javax.swing.JLabel();
        jLabel_logo = new javax.swing.JLabel();
        jTextField_user = new javax.swing.JTextField();
        jLabel_user = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel_password = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelfondo = new javax.swing.JLabel();
        iniciar_sesion_button = new javax.swing.JButton();
        register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_salir.setBackground(new java.awt.Color(0, 0, 0));
        jButton_salir.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_salir.setText("Salir");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel_user_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_logo.png"))); // NOI18N
        getContentPane().add(jLabel_user_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_asuServicio(1).png"))); // NOI18N
        jLabel_logo.setToolTipText("");
        getContentPane().add(jLabel_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField_user.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_userActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 140, 20));

        jLabel_user.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user.setText("usuario:");
        getContentPane().add(jLabel_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jPasswordField.setBackground(new java.awt.Color(190, 221, 255));
        jPasswordField.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        getContentPane().add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 140, 20));

        jLabel_password.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("contraseña:");
        getContentPane().add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 742, 551));

        iniciar_sesion_button.setText("jButton1");
        iniciar_sesion_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciar_sesion_buttonMouseClicked(evt);
            }
        });
        iniciar_sesion_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_sesion_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar_sesion_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 130, -1));

        register.setText("jButton1");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jTextField_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_userActionPerformed

    private void iniciar_sesion_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesion_buttonActionPerformed
        Iniciar verIniciar=new Iniciar();
        verIniciar.setVisible(true);
    }//GEN-LAST:event_iniciar_sesion_buttonActionPerformed

    private void iniciar_sesion_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_sesion_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciar_sesion_buttonMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        Registrar verRegistrar=new Registrar();
        verRegistrar.setVisible(true);
    }//GEN-LAST:event_registerActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciar_sesion_button;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JLabel jLabel_user_logo;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_user;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables

    private static class iniciar {

        public iniciar() {
        }
        
        
    }
}
