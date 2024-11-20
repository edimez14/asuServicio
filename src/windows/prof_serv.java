package windows;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class prof_serv extends javax.swing.JFrame {

    
    public prof_serv() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("assets/logo_asuServicio(1).png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Menu1 = new javax.swing.JButton();
        jPanel_Menu = new javax.swing.JPanel();
        jButton_cerrar_panel = new javax.swing.JButton();
        jButton_Cerrar_sesion = new javax.swing.JButton();
        jButton_Configuracion = new javax.swing.JButton();
        jButton_volver = new javax.swing.JButton();
        jButton_Menu = new javax.swing.JButton();
        jLabel_cambiar_phonenumber = new javax.swing.JLabel();
        jLabel_cambiar_phonenumber3 = new javax.swing.JLabel();
        jLabel_cambiar_phonenumber2 = new javax.swing.JLabel();
        jLabel_cambiar_phonenumber1 = new javax.swing.JLabel();
        jLabel_cambiar_fullname = new javax.swing.JLabel();
        jLabel_cambiar_password = new javax.swing.JLabel();
        jLabel_cambiar_username = new javax.swing.JLabel();
        jButton_salir = new javax.swing.JButton();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Menu1.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Menu1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_Menu1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Menu1.setText("Menu");
        jButton_Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Menu1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel_Menu.setBackground(new java.awt.Color(1, 72, 127));
        jPanel_Menu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel_MenuComponentHidden(evt);
            }
        });
        jPanel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_Menu.setVisible(false);

        jButton_cerrar_panel.setBackground(new java.awt.Color(0, 0, 0));
        jButton_cerrar_panel.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_cerrar_panel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cerrar_panel.setText("X");
        jButton_cerrar_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrar_panelActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_cerrar_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 6, -1, -1));

        jButton_Cerrar_sesion.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Cerrar_sesion.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_Cerrar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cerrar_sesion.setText("Cerrar sesion");
        jButton_Cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cerrar_sesionActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_Cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jButton_Configuracion.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Configuracion.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_Configuracion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Configuracion.setText("Configuracion");
        jButton_Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfiguracionActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_Configuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton_volver.setBackground(new java.awt.Color(0, 0, 0));
        jButton_volver.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_volver.setForeground(new java.awt.Color(255, 255, 255));
        jButton_volver.setText("Volver");
        jButton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_volverActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jButton_Menu.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Menu.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_Menu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Menu.setText("Menu");
        jButton_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MenuActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 550));

        jLabel_cambiar_phonenumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_phonenumber.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_phonenumber.setText("PonerJTable");
        getContentPane().add(jLabel_cambiar_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        jLabel_cambiar_phonenumber3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_phonenumber3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_phonenumber3.setText("Medio de Pago:");
        getContentPane().add(jLabel_cambiar_phonenumber3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jLabel_cambiar_phonenumber2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_phonenumber2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_phonenumber2.setText("Dirección:");
        getContentPane().add(jLabel_cambiar_phonenumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        jLabel_cambiar_phonenumber1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_phonenumber1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_phonenumber1.setText("Número de Teléfono:");
        getContentPane().add(jLabel_cambiar_phonenumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel_cambiar_fullname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_fullname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_fullname.setText("Nombre Completo:");
        getContentPane().add(jLabel_cambiar_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel_cambiar_password.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_password.setText("Contraseña:");
        getContentPane().add(jLabel_cambiar_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel_cambiar_username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_username.setText("User Name:");
        getContentPane().add(jLabel_cambiar_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jButton_salir.setBackground(new java.awt.Color(0, 0, 0));
        jButton_salir.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_salir.setText("Salir");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Menu1ActionPerformed
        jPanel_Menu.setVisible(true);
        jButton_Menu.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Menu1ActionPerformed

    private void jButton_cerrar_panelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrar_panelActionPerformed
        jPanel_Menu.setVisible(false);
        jButton_Menu.setVisible(true);
    }//GEN-LAST:event_jButton_cerrar_panelActionPerformed

    private void jButton_Cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cerrar_sesionActionPerformed
        JOptionPane.showMessageDialog(this, "Sesion cerrada con exito");
        login_como verlogin_como = new login_como();
        verlogin_como.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_Cerrar_sesionActionPerformed

    private void jButton_ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfiguracionActionPerformed
        Configuracion_serv verConfiguracion_serv = new Configuracion_serv();
        verConfiguracion_serv.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_ConfiguracionActionPerformed

    private void jButton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_volverActionPerformed
        service_perfil verservice_perfil = new service_perfil();
        verservice_perfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_volverActionPerformed

    private void jButton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuActionPerformed
        jPanel_Menu.setVisible(true);
        jButton_Menu.setVisible(false);
    }//GEN-LAST:event_jButton_MenuActionPerformed

    private void jPanel_MenuComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_MenuComponentHidden

    }//GEN-LAST:event_jPanel_MenuComponentHidden

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton_salirActionPerformed

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
            java.util.logging.Logger.getLogger(prof_serv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prof_serv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prof_serv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prof_serv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prof_serv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cerrar_sesion;
    private javax.swing.JButton jButton_Configuracion;
    private javax.swing.JButton jButton_Menu;
    private javax.swing.JButton jButton_Menu1;
    private javax.swing.JButton jButton_cerrar_panel;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JButton jButton_volver;
    private javax.swing.JLabel jLabel_cambiar_fullname;
    private javax.swing.JLabel jLabel_cambiar_password;
    private javax.swing.JLabel jLabel_cambiar_phonenumber;
    private javax.swing.JLabel jLabel_cambiar_phonenumber1;
    private javax.swing.JLabel jLabel_cambiar_phonenumber2;
    private javax.swing.JLabel jLabel_cambiar_phonenumber3;
    private javax.swing.JLabel jLabel_cambiar_username;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
