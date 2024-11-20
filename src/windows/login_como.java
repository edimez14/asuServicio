/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import database.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author John Esteban
 */
public class login_como extends javax.swing.JFrame {

    /**
     * Creates new form login_como
     */
    public login_como() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Volverbutton = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jLabel_email = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        iniciar_sesion_button = new javax.swing.JButton();
        Label_Fondo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton_salir2 = new javax.swing.JButton();
        Volverbutton2 = new javax.swing.JButton();
        jLabel_email1 = new javax.swing.JLabel();
        jTextField_email1 = new javax.swing.JTextField();
        jLabel_password1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        service_logo = new javax.swing.JLabel();
        iniciar_sesion_button2 = new javax.swing.JButton();
        register2 = new javax.swing.JButton();
        Label_Fondo3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_asuServicio(1).png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Volverbutton.setBackground(new java.awt.Color(0, 0, 0));
        Volverbutton.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Volverbutton.setForeground(new java.awt.Color(255, 255, 255));
        Volverbutton.setText("Volver");
        Volverbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(Volverbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        jButton_salir.setBackground(new java.awt.Color(0, 0, 0));
        jButton_salir.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_salir.setText("Salir");
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel_email.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_email.setText("correo electronico:");
        jPanel2.add(jLabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jTextField_email.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_email.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 190, 20));

        jLabel_password.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("contraseña:");
        jPanel2.add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jPasswordField.setBackground(new java.awt.Color(190, 221, 255));
        jPasswordField.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 190, 20));

        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register (1).png"))); // NOI18N
        register.setContentAreaFilled(false);
        register.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register 200.png"))); // NOI18N
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel2.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 180, 50));

        iniciar_sesion_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button (1).png"))); // NOI18N
        iniciar_sesion_button.setContentAreaFilled(false);
        iniciar_sesion_button.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button 200.png"))); // NOI18N
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
        jPanel2.add(iniciar_sesion_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 210, 70));

        Label_Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        jPanel2.add(Label_Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 550));

        jTabbedPane1.addTab("Usuario", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_asuServicio(1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton_salir2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_salir2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton_salir2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_salir2.setText("Salir");
        jButton_salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salir2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        Volverbutton2.setBackground(new java.awt.Color(0, 0, 0));
        Volverbutton2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        Volverbutton2.setForeground(new java.awt.Color(255, 255, 255));
        Volverbutton2.setText("Volver");
        Volverbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volverbutton2ActionPerformed(evt);
            }
        });
        jPanel1.add(Volverbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));

        jLabel_email1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_email1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_email1.setText("correo electronico:");
        jPanel1.add(jLabel_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jTextField_email1.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_email1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_email1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_email1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 190, 20));

        jLabel_password1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_password1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password1.setText("contraseña:");
        jPanel1.add(jLabel_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(190, 221, 255));
        jPasswordField1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 190, 20));

        service_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo_servicios.png"))); // NOI18N
        jPanel1.add(service_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        iniciar_sesion_button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button (1).png"))); // NOI18N
        iniciar_sesion_button2.setContentAreaFilled(false);
        iniciar_sesion_button2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Button 200.png"))); // NOI18N
        iniciar_sesion_button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciar_sesion_button2MouseClicked(evt);
            }
        });
        iniciar_sesion_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_sesion_button2ActionPerformed(evt);
            }
        });
        jPanel1.add(iniciar_sesion_button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 210, 70));

        register2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register (1).png"))); // NOI18N
        register2.setContentAreaFilled(false);
        register2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register 200.png"))); // NOI18N
        register2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register2ActionPerformed(evt);
            }
        });
        jPanel1.add(register2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 180, 50));

        Label_Fondo3.setForeground(new java.awt.Color(255, 255, 255));
        Label_Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        jPanel1.add(Label_Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Servicio", jPanel1);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Iniciar sesión como:");
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean verificacion(String email, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //nos conectamos a la base de datos
            con = Conexion.getInstancia().conectar();

            //consultamos a la base de datos los datos que queremos verificar
            String query = "SELECT * FROM user_db WHERE user_email = ? AND user_password = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);

            rs = ps.executeQuery();

            //si hay resultados significa que los datos son correctos
            return rs.next();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al verificar los datos: " + e.getMessage());
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    private boolean verificacionServicio(String email, String password) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Nos conectamos a la base de datos
            con = Conexion.getInstancia().conectar();

            // Consultamos a la base de datos los datos que queremos verificar
            String query = "SELECT * FROM ambulance_serv WHERE service_email = ? AND serv_password = ? "
                    + "UNION "
                    + "SELECT * FROM bike_serv WHERE service_email = ? AND serv_password = ? "
                    + "UNION "
                    + "SELECT * FROM mechanics_serv WHERE service_email = ? AND serv_password = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, email);
            ps.setString(6, password);

            rs = ps.executeQuery();

            // Si hay resultados significa que los datos son correctos
            return rs.next();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al verificar los datos del servicio: " + e.getMessage());
            return false;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    private void VolverbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverbuttonActionPerformed
        login_como verlogin_como = new login_como();
        verlogin_como.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverbuttonActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jButton_salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salir2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salir2ActionPerformed

    private void Volverbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volverbutton2ActionPerformed
        login_como verlogin_como = new login_como();
        verlogin_como.setVisible(true);
        dispose();
    }//GEN-LAST:event_Volverbutton2ActionPerformed

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jTextField_email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_email1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        register_como verRegistrar = new register_como();
        verRegistrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void iniciar_sesion_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_sesion_buttonMouseClicked
        String email = jTextField_email.getText();
        String password = new String(jPasswordField.getPassword());

        //verificamos si los campos no estan vacios
        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete los campos vacios");
            return;
        }

        //llamamos al metodo para verificar los datos ingresados
        if (verificacion(email, password)) {
            Categoria verCategoria = new Categoria();
            verCategoria.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.");
        }
    }//GEN-LAST:event_iniciar_sesion_buttonMouseClicked

    private void iniciar_sesion_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesion_buttonActionPerformed

    }//GEN-LAST:event_iniciar_sesion_buttonActionPerformed

    private void iniciar_sesion_button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_sesion_button2MouseClicked
        String email = jTextField_email1.getText();
        String password = new String(jPasswordField1.getPassword());

        //verificamos si los campos no estan vacios
        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete los campos vacios");
            return;
        }

        //llamamos al metodo para verificar los datos ingresados
        if (verificacionServicio(email, password)) {
            service_perfil verservice_perfil = new service_perfil();
            verservice_perfil.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos.");
        }
    }//GEN-LAST:event_iniciar_sesion_button2MouseClicked

    private void iniciar_sesion_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesion_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciar_sesion_button2ActionPerformed

    private void register2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register2ActionPerformed
      register_como verRegistrar = new register_como();
        verRegistrar.setVisible(true);
        dispose();
    }//GEN-LAST:event_register2ActionPerformed

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
            java.util.logging.Logger.getLogger(login_como.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_como.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_como.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_como.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_como().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Fondo2;
    private javax.swing.JLabel Label_Fondo3;
    private javax.swing.JButton Volverbutton;
    private javax.swing.JButton Volverbutton2;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton iniciar_sesion_button;
    private javax.swing.JButton iniciar_sesion_button2;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JButton jButton_salir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_email1;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_password1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_email1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton register;
    private javax.swing.JButton register2;
    private javax.swing.JLabel service_logo;
    // End of variables declaration//GEN-END:variables
}