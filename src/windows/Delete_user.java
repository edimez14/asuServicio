package windows;

import database.Conexion;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete_user extends javax.swing.JFrame {

    public Delete_user() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                // Mostrar el mensaje cuando la ventana se ha abierto
                JOptionPane.showMessageDialog(Delete_user.this,
                        "Para eliminar la cuenta, confirme su correo y contraseña por favor",
                        "Confirmación necesaria",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }

    private boolean eliminarUser(String user_email, String user_password) {
        Connection conn = null;
        PreparedStatement psDeleteUser = null;

        try {
            // Obtener la conexión desde la clase Conexion
            Conexion conexion = Conexion.getInstancia();
            conn = conexion.conectar();  // Conexión obtenida a través del singleton

            // Desactivar auto-commit para gestionar la transacción
            conn.setAutoCommit(false);

            // Preparar la sentencia para eliminar el usuario de la tabla user_db
            String deleteUserQuery = "DELETE FROM user_db WHERE user_email = ? AND user_password = ?";

            psDeleteUser = conn.prepareStatement(deleteUserQuery);

            // Asignar los valores de los parámetros
            psDeleteUser.setString(1, user_email);
            psDeleteUser.setString(2, user_password);

            // Ejecutar la consulta
            int rowsDeletedUser = psDeleteUser.executeUpdate();

            // Si se eliminó al menos una fila, confirmar la transacción
            if (rowsDeletedUser > 0) {
                conn.commit();
                return true; // Eliminación exitosa
            } else {
                conn.rollback();
                return false; // No se encontró el usuario para eliminar
            }
        } catch (Exception e) {
            // En caso de error, realizar rollback
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
            e.printStackTrace();
            return false;
        } finally {
            // Cerrar las conexiones y recursos
            try {
                if (psDeleteUser != null) {
                    psDeleteUser.close();
                }
                if (conn != null) {
                    Conexion conexion = Conexion.getInstancia();
                    conexion.desconectar();  // Cerrar la conexión
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("assets/logo_asuServicio(1).png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        service_logo = new javax.swing.JLabel();
        jLabel_email1 = new javax.swing.JLabel();
        jTextField_email1 = new javax.swing.JTextField();
        jLabel_password1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        Eliminar_cuenta = new javax.swing.JButton();
        Volverbutton2 = new javax.swing.JButton();
        jButton_salir2 = new javax.swing.JButton();
        Label_Fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_asuServicio(1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        service_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_logo.png"))); // NOI18N
        getContentPane().add(service_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel_email1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_email1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_email1.setText("correo electronico:");
        getContentPane().add(jLabel_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jTextField_email1.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_email1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_email1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_email1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 190, 20));

        jLabel_password1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_password1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password1.setText("contraseña:");
        getContentPane().add(jLabel_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(190, 221, 255));
        jPasswordField1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 190, 20));

        Eliminar_cuenta.setBackground(new java.awt.Color(0, 0, 0));
        Eliminar_cuenta.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Eliminar_cuenta.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_cuenta.setText("Eliminar Cuenta");
        Eliminar_cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_cuentaActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        Volverbutton2.setBackground(new java.awt.Color(0, 0, 0));
        Volverbutton2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Volverbutton2.setForeground(new java.awt.Color(255, 255, 255));
        Volverbutton2.setText("Volver");
        Volverbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volverbutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Volverbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        jButton_salir2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_salir2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_salir2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_salir2.setText("Salir");
        jButton_salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salir2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        Label_Fondo3.setForeground(new java.awt.Color(255, 255, 255));
        Label_Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        getContentPane().add(Label_Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_email1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void Eliminar_cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_cuentaActionPerformed
       // Obtener el correo y la contraseña del campo de texto
    String email = jTextField_email1.getText();  // Correo del campo de texto
    String password = new String(jPasswordField1.getPassword());  // Contraseña del campo de texto

    // Llamar al método de eliminación de usuario
    boolean eliminado = eliminarUser(email, password);

    if (eliminado) {
        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(this, "Usuario eliminado exitosamente.", "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
        
        // Redirigir a la ventana de registro (la ventana donde el usuario se puede registrar nuevamente)
        new register_como().setVisible(true);  // Abre la ventana de registro
        this.dispose();  // Cierra la ventana actual
    } else {
        // Mostrar mensaje de error si no se pudo eliminar
        JOptionPane.showMessageDialog(this, "No se pudo eliminar el usuario. Verifique los datos proporcionados.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_Eliminar_cuentaActionPerformed

    private void Volverbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volverbutton2ActionPerformed
        Configuracion verConfiguracion = new Configuracion();
        verConfiguracion.setVisible(true);
        dispose();
    }//GEN-LAST:event_Volverbutton2ActionPerformed

    private void jButton_salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salir2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salir2ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar_cuenta;
    private javax.swing.JLabel Label_Fondo3;
    private javax.swing.JButton Volverbutton2;
    private javax.swing.JButton jButton_salir2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_email1;
    private javax.swing.JLabel jLabel_password1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField_email1;
    private javax.swing.JLabel service_logo;
    // End of variables declaration//GEN-END:variables
}
