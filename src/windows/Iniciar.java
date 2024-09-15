/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author John Esteban
 */
public class Iniciar extends javax.swing.JFrame {

    /**
     * Creates new form Iniciar
     */
    public Iniciar() {
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

        Button_Menu = new javax.swing.JButton();
        jPanel_Menu = new javax.swing.JPanel();
        jButton_cerrar = new javax.swing.JButton();
        jButton_perfil = new javax.swing.JButton();
        jButton_categorias = new javax.swing.JButton();
        jButton_configuracion = new javax.swing.JButton();
        jButton_cerrar_sesion = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jButton_mecanico = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setSize(new java.awt.Dimension(742, 551));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button_Menu.setBackground(new java.awt.Color(0, 0, 0));
        Button_Menu.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Button_Menu.setForeground(new java.awt.Color(255, 255, 255));
        Button_Menu.setText("Menu");
        Button_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Button_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel_Menu.setBackground(new java.awt.Color(1, 72, 127));

        jButton_cerrar.setBackground(new java.awt.Color(0, 0, 0));
        jButton_cerrar.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cerrar.setText("X");
        jButton_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarActionPerformed(evt);
            }
        });

        jButton_perfil.setBackground(new java.awt.Color(0, 0, 0));
        jButton_perfil.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_perfil.setForeground(new java.awt.Color(255, 255, 255));
        jButton_perfil.setText("Perfil");
        jButton_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_perfilActionPerformed(evt);
            }
        });

        jButton_categorias.setBackground(new java.awt.Color(0, 0, 0));
        jButton_categorias.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_categorias.setForeground(new java.awt.Color(255, 255, 255));
        jButton_categorias.setText("Categorias");
        jButton_categorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_categoriasActionPerformed(evt);
            }
        });

        jButton_configuracion.setBackground(new java.awt.Color(0, 0, 0));
        jButton_configuracion.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_configuracion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_configuracion.setText("Configuracion");
        jButton_configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_configuracionActionPerformed(evt);
            }
        });

        jButton_cerrar_sesion.setBackground(new java.awt.Color(0, 0, 0));
        jButton_cerrar_sesion.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton_cerrar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cerrar_sesion.setText("Cerrar Sesion");
        jButton_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrar_sesionActionPerformed(evt);
            }
        });

        jPanel_Menu.setVisible(false);

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_cerrar))
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jButton_perfil))
                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton_categorias)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_cerrar_sesion)
                    .addComponent(jButton_configuracion))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_cerrar)
                .addGap(54, 54, 54)
                .addComponent(jButton_perfil)
                .addGap(18, 18, 18)
                .addComponent(jButton_categorias)
                .addGap(18, 18, 18)
                .addComponent(jButton_configuracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(jButton_cerrar_sesion)
                .addContainerGap())
        );

        getContentPane().add(jPanel_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 550));

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

        jButton_mecanico.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton_mecanico.setText("MECANICOS");
        jButton_mecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mecanicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_mecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jButton_mecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mecanicoActionPerformed
        Mecanicos_view verMecanicos_view = new Mecanicos_view();
        verMecanicos_view.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_mecanicoActionPerformed

    private void Button_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MenuActionPerformed
        jPanel_Menu.setVisible(true);
        Button_Menu.setVisible(false);
    }//GEN-LAST:event_Button_MenuActionPerformed

    private void jButton_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarActionPerformed
        jPanel_Menu.setVisible(false);
        Button_Menu.setVisible(true);
    }//GEN-LAST:event_jButton_cerrarActionPerformed

    private void jButton_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_perfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_perfilActionPerformed

    private void jButton_categoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_categoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_categoriasActionPerformed

    private void jButton_configuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_configuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_configuracionActionPerformed

    private void jButton_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrar_sesionActionPerformed
        JOptionPane.showMessageDialog(this, "Sesion cerrada con exito");
        login verlogin = new login();
        verlogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_cerrar_sesionActionPerformed

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
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Menu;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton_categorias;
    private javax.swing.JButton jButton_cerrar;
    private javax.swing.JButton jButton_cerrar_sesion;
    private javax.swing.JButton jButton_configuracion;
    private javax.swing.JButton jButton_mecanico;
    private javax.swing.JButton jButton_perfil;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
