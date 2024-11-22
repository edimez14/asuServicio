package windows;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class service_perfil1 extends javax.swing.JFrame {

    public service_perfil1() {
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

        jButton_salir = new javax.swing.JButton();
        jButton_solicitudes = new javax.swing.JButton();
        jButton_estado = new javax.swing.JButton();
        jButton_estado1 = new javax.swing.JButton();
        Button_Menu = new javax.swing.JButton();
        jPanel_Menu = new javax.swing.JPanel();
        jButton_cerrar = new javax.swing.JButton();
        jButton_perfil = new javax.swing.JButton();
        jButton_cerrar_sesion = new javax.swing.JButton();
        jButton_configuracion1 = new javax.swing.JButton();
        Button_Menu1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

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
        getContentPane().add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jButton_solicitudes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_solicitudes.setText("Solicitudes");
        jButton_solicitudes.setEnabled(false);
        jButton_solicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_solicitudesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_solicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jButton_estado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_estado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/on apagado.png"))); // NOI18N
        jButton_estado.setContentAreaFilled(false);
        jButton_estado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_estado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ON (2).png"))); // NOI18N
        jButton_estado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_estado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_estadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_estadoMouseExited(evt);
            }
        });
        jButton_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_estadoActionPerformed(evt);
            }
        });
        jButton_estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton_estadoKeyReleased(evt);
            }
        });
        getContentPane().add(jButton_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 160, 190));

        jButton_estado1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_estado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/off pagado.png"))); // NOI18N
        jButton_estado1.setContentAreaFilled(false);
        jButton_estado1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_estado1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/OFF.png"))); // NOI18N
        jButton_estado1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton_estado1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_estado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_estado1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_estado1MouseExited(evt);
            }
        });
        jButton_estado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_estado1ActionPerformed(evt);
            }
        });
        jButton_estado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton_estado1KeyReleased(evt);
            }
        });
        getContentPane().add(jButton_estado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 220, 180));

        Button_Menu.setBackground(new java.awt.Color(0, 0, 0));
        Button_Menu.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Button_Menu.setForeground(new java.awt.Color(255, 255, 255));
        Button_Menu.setText("Menu");
        Button_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel_Menu.setBackground(new java.awt.Color(1, 72, 127));
        jPanel_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_Menu.setVisible(false);

        jButton_cerrar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_cerrar.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cerrar.setText("X");
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 6, -1, -1));

        jButton_perfil.setBackground(new java.awt.Color(0, 0, 0));
        jButton_perfil.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_perfil.setForeground(new java.awt.Color(255, 255, 255));
        jButton_perfil.setText("Perfil");
        jButton_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_perfilActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 105, -1, -1));

        jButton_cerrar_sesion.setBackground(new java.awt.Color(0, 0, 0));
        jButton_cerrar_sesion.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_cerrar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cerrar_sesion.setText("Cerrar Sesion");
        jButton_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrar_sesionActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 513, -1, -1));

        jButton_configuracion1.setBackground(new java.awt.Color(0, 0, 0));
        jButton_configuracion1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_configuracion1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_configuracion1.setText("Configuracion");
        jButton_configuracion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_configuracion1ActionPerformed(evt);
            }
        });
        jPanel_Menu.add(jButton_configuracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 154, -1, -1));

        Button_Menu1.setBackground(new java.awt.Color(0, 0, 0));
        Button_Menu1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Button_Menu1.setForeground(new java.awt.Color(255, 255, 255));
        Button_Menu1.setText("Menu");
        Button_Menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Menu1ActionPerformed(evt);
            }
        });
        jPanel_Menu.add(Button_Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        getContentPane().add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 550));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MenuActionPerformed
        jPanel_Menu.setVisible(true);
        Button_Menu.setVisible(false);
    }//GEN-LAST:event_Button_MenuActionPerformed

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed
        jPanel_Menu.setVisible(false);
        Button_Menu.setVisible(true);
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void jButton_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_perfilActionPerformed
        prof_serv verprof_serv = new prof_serv();
        verprof_serv.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_perfilActionPerformed

    private void jButton_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrar_sesionActionPerformed
        JOptionPane.showMessageDialog(this, "Sesion cerrada con exito");
        login_como verlogin_como = new login_como();
        verlogin_como.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_cerrar_sesionActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jButton_configuracion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_configuracion1ActionPerformed
       Configuracion_serv verConfiguracion_serv  = new Configuracion_serv ();
        verConfiguracion_serv .setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_configuracion1ActionPerformed

    private void jButton_solicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_solicitudesActionPerformed
        Servicio1 verServicio1 = new Servicio1();
        verServicio1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_solicitudesActionPerformed

    private void jButton_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_estadoActionPerformed
        jButton_estado1.setEnabled(true);
        jButton_solicitudes.setEnabled(true);

        // Mostrar mensaje de éxito al activar
        JOptionPane.showMessageDialog(null, "Te activaste con éxito.");

        // Opcional: Deshabilitar el botón Activar
        jButton_estado.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_estadoActionPerformed

    private void jButton_estado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_estado1ActionPerformed
        if (jButton_estado.isEnabled()) {
            // Si el botón Activar está habilitado, significa que aún no se ha activado
            JOptionPane.showMessageDialog(null, "Ya estás desactivado, actívate primero.");
        } else {
            // Al hacer clic en Desactivar:
            // Mostrar mensaje de éxito al desactivar
            JOptionPane.showMessageDialog(null, "Te desactivaste con éxito.");

            // Opcional: Deshabilitar el botón Desactivar
            jButton_estado1.setEnabled(false);

            // Habilitar el botón Activar nuevamente
            jButton_estado.setEnabled(true);
            
            jButton_solicitudes.setEnabled(false);

    }//GEN-LAST:event_jButton_estado1ActionPerformed
    }
    private void jButton_estadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_estadoMouseEntered
        jButton_estado.setText("Activarse");// TODO add your handling code here:
    }//GEN-LAST:event_jButton_estadoMouseEntered

    private void jButton_estadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_estadoMouseExited
        jButton_estado.setText("");
    }//GEN-LAST:event_jButton_estadoMouseExited

    private void jButton_estado1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_estado1MouseEntered
        jButton_estado1.setText("Desactivarse");
    }//GEN-LAST:event_jButton_estado1MouseEntered

    private void jButton_estado1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_estado1MouseExited
        jButton_estado1.setText("");
    }//GEN-LAST:event_jButton_estado1MouseExited

    private void jButton_estadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_estadoKeyReleased

    }//GEN-LAST:event_jButton_estadoKeyReleased

    private void jButton_estado1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton_estado1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_estado1KeyReleased

    private void Button_Menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Menu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Menu1ActionPerformed

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
            java.util.logging.Logger.getLogger(service_perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(service_perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(service_perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(service_perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new service_perfil1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Menu;
    private javax.swing.JButton Button_Menu1;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_cerrar_sesion;
    private javax.swing.JButton jButton_configuracion1;
    private javax.swing.JButton jButton_estado;
    private javax.swing.JButton jButton_estado1;
    private javax.swing.JButton jButton_perfil;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JButton jButton_solicitudes;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
