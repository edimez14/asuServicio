package windows;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author prestamo
 */
public class Configuracion extends javax.swing.JFrame {

    
    public Configuracion() {
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

        jLabel_cambiar_username = new javax.swing.JLabel();
        jTextField_nuevo_username = new javax.swing.JTextField();
        jLabel_cambiar_password = new javax.swing.JLabel();
        jTextField_nuevo_password = new javax.swing.JTextField();
        jLabel_cambiar_fullname = new javax.swing.JLabel();
        jTextField_nuevo_fullname = new javax.swing.JTextField();
        jLabel_cambiar_phonenumber = new javax.swing.JLabel();
        jTextField_nuevo_phonenumber = new javax.swing.JTextField();
        Eliminar_cuenta = new javax.swing.JButton();
        jButton_Menu1 = new javax.swing.JButton();
        jPanel_Menu = new javax.swing.JPanel();
        jButton_cerrar_panel = new javax.swing.JButton();
        jButton_Cerrar_sesion = new javax.swing.JButton();
        jButton_Categorias = new javax.swing.JButton();
        jButton_volver = new javax.swing.JButton();
        jButton_Perfil = new javax.swing.JButton();
        jButton_Menu = new javax.swing.JButton();
        jButton_salir1 = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_cambiar_username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_username.setText("Cambiar User Name:");
        getContentPane().add(jLabel_cambiar_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jTextField_nuevo_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nuevo_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_nuevo_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 210, -1));

        jLabel_cambiar_password.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_password.setText("Cambiar Contraseña:");
        getContentPane().add(jLabel_cambiar_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));
        getContentPane().add(jTextField_nuevo_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 210, -1));

        jLabel_cambiar_fullname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_fullname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_fullname.setText("Cambiar Nombre Completo:");
        getContentPane().add(jLabel_cambiar_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));
        getContentPane().add(jTextField_nuevo_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 210, -1));

        jLabel_cambiar_phonenumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_cambiar_phonenumber.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cambiar_phonenumber.setText("Cambiar Número de Teléfono:");
        getContentPane().add(jLabel_cambiar_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));
        getContentPane().add(jTextField_nuevo_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 210, -1));

        Eliminar_cuenta.setBackground(new java.awt.Color(0, 0, 0));
        Eliminar_cuenta.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Eliminar_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_cuenta.setText("Eliminar Cuenta");
        Eliminar_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_cuentaActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, -1));

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

        jButton_Categorias.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Categorias.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_Categorias.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Categorias.setText("Categorias");
        jButton_Categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CategoriasActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_Categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jButton_volver.setBackground(new java.awt.Color(0, 0, 0));
        jButton_volver.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_volver.setForeground(new java.awt.Color(255, 255, 255));
        jButton_volver.setText("Volver");
        jButton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_volverActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jButton_Perfil.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Perfil.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_Perfil.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Perfil.setText("Perfil");
        jButton_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PerfilActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

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

        jButton_salir1.setBackground(new java.awt.Color(0, 0, 0));
        jButton_salir1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_salir1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_salir1.setText("Salir");
        jButton_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        Guardar.setBackground(new java.awt.Color(0, 0, 0));
        Guardar.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("Guardar Cambios");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, -1, -1));

        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Eliminar_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_cuentaActionPerformed
        Delete_user verDelete_user = new Delete_user();
        verDelete_user.setVisible(true);
        dispose();
    }//GEN-LAST:event_Eliminar_cuentaActionPerformed

    private void jButton_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MenuActionPerformed
        jPanel_Menu.setVisible(true);
        jButton_Menu.setVisible(false);
    }//GEN-LAST:event_jButton_MenuActionPerformed

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

    private void jButton_CategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CategoriasActionPerformed
        Categoria verCategoria = new Categoria();
        verCategoria.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_CategoriasActionPerformed

    private void jButton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_volverActionPerformed
        Categoria verCategoria = new Categoria();
        verCategoria.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_volverActionPerformed

    private void jPanel_MenuComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel_MenuComponentHidden

    }//GEN-LAST:event_jPanel_MenuComponentHidden

    private void jButton_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PerfilActionPerformed
        Perfil verPerfil = new Perfil();
        verPerfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_PerfilActionPerformed

    private void jTextField_nuevo_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nuevo_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nuevo_usernameActionPerformed

    private void jButton_Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Menu1ActionPerformed
        jPanel_Menu.setVisible(true);
        jButton_Menu.setVisible(false);
    }//GEN-LAST:event_jButton_Menu1ActionPerformed

    private void jButton_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salir1ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Perfil verPerfil = new Perfil();
        verPerfil.setVisible(true);
        dispose();
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar_cuenta;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton jButton_Categorias;
    private javax.swing.JButton jButton_Cerrar_sesion;
    private javax.swing.JButton jButton_Menu;
    private javax.swing.JButton jButton_Menu1;
    private javax.swing.JButton jButton_Perfil;
    private javax.swing.JButton jButton_cerrar_panel;
    private javax.swing.JButton jButton_salir1;
    private javax.swing.JButton jButton_volver;
    private javax.swing.JLabel jLabel_cambiar_fullname;
    private javax.swing.JLabel jLabel_cambiar_password;
    private javax.swing.JLabel jLabel_cambiar_phonenumber;
    private javax.swing.JLabel jLabel_cambiar_username;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JPanel jPanel_Menu;
    private javax.swing.JTextField jTextField_nuevo_fullname;
    private javax.swing.JTextField jTextField_nuevo_password;
    private javax.swing.JTextField jTextField_nuevo_phonenumber;
    private javax.swing.JTextField jTextField_nuevo_username;
    // End of variables declaration//GEN-END:variables
}
