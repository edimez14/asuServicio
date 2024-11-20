package windows;

import database.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class register_como extends javax.swing.JFrame {

    /**
     * Creates new form register_como
     */
    public register_como() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("assets/logo_asuServicio(1).png"));
        return retValue;
    }

    //metodo para insertar los datos de los usuarios que se registren 
    private void registrarUsuario() {
        // Obtener los valores de los campos de usuario
        String nombre = jLabel_user3.getText();
        String email = jTextField_user1.getText();
        String pNumber = jTextField_user_pNumber.getText();
        String username = jTextField_user.getText();
        String password = new String(jPasswordField1.getPassword());
        String confirmPassword = new String(jPasswordField.getPassword());

        // Verificar que las contraseñas del usuario coincidan
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            return;
        }

        // Verificar que los campos del usuario no estén vacíos
        if (nombre.isEmpty() || email.isEmpty() || pNumber.isEmpty() || username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos del usuario");
            return;
        }

        if (jComboBox2.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una opción en los términos y condiciones.");
            return;  // Si no se ha seleccionado nada, detenemos el registro
        }

        String seleccionTerminos = jComboBox2.getSelectedItem().toString();

        if (!seleccionTerminos.equals("Estoy de Acuerdo")) {
            JOptionPane.showMessageDialog(this, "Debes aceptar los términos y condiciones.");
            return;  // Si no está seleccionado "Sí", no continuamos con el registro
        }

        // Conectarse a la base de datos
        Conexion conexion = Conexion.getInstancia();
        Connection conr = conexion.conectar();

        // Preparar la sentencia para insertar los datos del usuario
        String sql = "INSERT INTO user_db (user_full_name, user_email, user_pNumber, user_name, user_password) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement psr = conr.prepareStatement(sql)) {
            // Establecer los parámetros en la consulta
            psr.setString(1, nombre);
            psr.setString(2, email);
            psr.setString(3, pNumber);
            psr.setString(4, username);
            psr.setString(5, password);

            // Ejecutar la consulta
            int rowsAffected = psr.executeUpdate();

            // Verificar si se logró registrar el nuevo usuario
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Nuevo usuario registrado con éxito");
                new login_como().setVisible(true);  // Abre la ventana de logearse
                this.dispose();  // Cierra la ventana actual
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar el nuevo usuario");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de la base de datos: " + e.getMessage());
        } finally {
            conexion.desconectar();
        }
    }

    private void registrarServicio() {
        // Obtener los valores de los campos del servicio
        String nombre2 = jTextField_user4.getText();  // Nombre del servicio
        String direccion = jTextField_user5.getText();  // Dirección del servicio
        String servemail = jTextField_user_email.getText();  // Email del servicio
        String servpassword = new String(jPasswordField3.getPassword());  // Contraseña del servicio
        String servconfirmPassword = new String(jPasswordField2.getPassword());  // Confirmación de contraseña
        String cell_serv = jTextField_user_pNumber1.getText();  // Celular del servicio (campo actualizado)

        // Obtener los valores seleccionados en los ComboBox
        String servicioSeleccionado = jComboBox1.getSelectedItem() != null ? jComboBox1.getSelectedItem().toString() : "";
        String medioPagoSeleccionado = jComboBox3.getSelectedItem() != null ? jComboBox3.getSelectedItem().toString() : "";

        // Verificar que las contraseñas del servicio coincidan
        if (!servpassword.equals(servconfirmPassword)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas del servicio no coinciden");
            return;
        }

        // Verificar que los campos del servicio no estén vacíos
        if (nombre2.isEmpty() || direccion.isEmpty() || servemail.isEmpty() || servpassword.isEmpty() || servconfirmPassword.isEmpty() || cell_serv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos del servicio");
            return;
        }

        // Verificar que el servicio seleccionado sea válido
        if (servicioSeleccionado.isEmpty() || !(servicioSeleccionado.equals("Mecánico") || servicioSeleccionado.equals("Ambulancia") || servicioSeleccionado.equals("Bicicletería"))) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un servicio válido (Mecánico, Ambulancia, o Bicicletería).");
            return;
        }

        // Verificar que se haya seleccionado un medio de pago
        if (medioPagoSeleccionado.isEmpty() || !(medioPagoSeleccionado.equals("Tarjeta de Crédito y Débito") || medioPagoSeleccionado.equals("Transferencias Bancarias") || medioPagoSeleccionado.equals("Billeteras Electrónicas"))) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un medio de pago.");
            return;
        }

        if (jComboBox4.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una opción en los términos y condiciones.");
            return;  // Si no se ha seleccionado nada, detenemos el registro
        }

        String seleccionTerminos = jComboBox4.getSelectedItem().toString();

        if (!seleccionTerminos.equals("Estoy de Acuerdo")) {
            JOptionPane.showMessageDialog(this, "Debes aceptar los términos y condiciones.");
            return;  // Si no está seleccionado "Sí", no continuamos con el registro
        }

        // Conectarse a la base de datos
        Conexion conexion = Conexion.getInstancia();
        Connection conr = conexion.conectar();

        // Definir la consulta SQL dependiendo del servicio seleccionado
        String sql = "";

        // Determinar en qué tabla insertar según el servicio seleccionado
        switch (servicioSeleccionado) {
            case "Mecánico":
                sql = "INSERT INTO mechanics_serv (full_name, service_email, serv_password, adress_serv, pay_way, cell_serv) VALUES (?, ?, ?, ?, ?, ?)";
                break;
            case "Ambulancia":
                sql = "INSERT INTO ambulance_serv (full_name, service_email, serv_password, adress_serv, pay_way, cell_serv) VALUES (?, ?, ?, ?, ?, ?)";
                break;
            case "Bicicletería":
                sql = "INSERT INTO bike_serv (full_name, service_email, serv_password, adress_serv, pay_way, cell_serv) VALUES (?, ?, ?, ?, ?, ?)";
                break;
            default:
                JOptionPane.showMessageDialog(this, "Servicio no reconocido");
                return;
        }

        try (PreparedStatement psr = conr.prepareStatement(sql)) {
            // Establecer los parámetros en la consulta
            psr.setString(1, nombre2);  // full_name
            psr.setString(2, servemail);  // Email del servicio
            psr.setString(3, servpassword);  // Contraseña del servicio
            psr.setString(4, direccion);  // Dirección del servicio
            psr.setString(5, medioPagoSeleccionado);  // Medio de pago
            psr.setString(6, cell_serv);  // Celular del servicio

            // Ejecutar la consulta
            int rowsAffected = psr.executeUpdate();

            // Verificar si se logró registrar el servicio
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Nuevo servicio registrado con éxito");
                new login_como().setVisible(true);  // Abre la ventana de logearse
                this.dispose();  // Cierra la ventana actual
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar el nuevo servicio");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de la base de datos: " + e.getMessage());
        } finally {
            conexion.desconectar();
        }
    }

    


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel_user3 = new javax.swing.JLabel();
        jTextField_user3 = new javax.swing.JTextField();
        jLabel_user = new javax.swing.JLabel();
        jTextField_user = new javax.swing.JTextField();
        jLabel_password1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel_user1 = new javax.swing.JLabel();
        jTextField_user1 = new javax.swing.JTextField();
        jLabel_user2 = new javax.swing.JLabel();
        jTextField_user_pNumber = new javax.swing.JTextField();
        jLabel_password = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Volverbutton = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton_registrar = new javax.swing.JButton();
        Label_Fondo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_user4 = new javax.swing.JLabel();
        jTextField_user4 = new javax.swing.JTextField();
        jLabel_user6 = new javax.swing.JLabel();
        jTextField_user5 = new javax.swing.JTextField();
        jLabel_user7 = new javax.swing.JLabel();
        jTextField_user_pNumber1 = new javax.swing.JTextField();
        jLabel_password3 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton_salir2 = new javax.swing.JButton();
        Volverbutton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_user_email = new javax.swing.JLabel();
        jTextField_user_email = new javax.swing.JTextField();
        jLabel_password2 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton_registrar1 = new javax.swing.JButton();
        Label_Fondo3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_user3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user3.setText("Nombre completo");
        jPanel2.add(jLabel_user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jTextField_user3.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_user3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, 20));

        jLabel_user.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user.setText("Usuario");
        jPanel2.add(jLabel_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        jTextField_user.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_userActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 140, 20));

        jLabel_password1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_password1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password1.setText("Contraseña");
        jPanel2.add(jLabel_password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(190, 221, 255));
        jPasswordField1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 140, 20));

        jLabel_user1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user1.setText("Correo electronico");
        jPanel2.add(jLabel_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jTextField_user1.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_user1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 140, 20));

        jLabel_user2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user2.setText("Numero de celular");
        jPanel2.add(jLabel_user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jTextField_user_pNumber.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user_pNumber.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user_pNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user_pNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_user_pNumberActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_user_pNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 140, 20));

        jLabel_password.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password.setText("Repita contraseña");
        jPanel2.add(jLabel_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jPasswordField.setBackground(new java.awt.Color(190, 221, 255));
        jPasswordField.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPanel2.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

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

        jComboBox2.setBackground(new java.awt.Color(190, 221, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Términos Y Condiciones", "Estoy de Acuerdo", "No Estoy De Acuerdo" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jButton_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register (1).png"))); // NOI18N
        jButton_registrar.setContentAreaFilled(false);
        jButton_registrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register 200.png"))); // NOI18N
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 430, 180, 50));

        Label_Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        jPanel2.add(Label_Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, -1, 550));

        jTabbedPane1.addTab("Usuario", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo_asuServicio(1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user_logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel_user4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user4.setText("Nombre completo");
        jPanel1.add(jLabel_user4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jTextField_user4.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_user4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_user4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, 20));

        jLabel_user6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user6.setText("Dirección");
        jPanel1.add(jLabel_user6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jTextField_user5.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_user5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_user5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 140, 20));

        jLabel_user7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user7.setText("Numero de celular");
        jPanel1.add(jLabel_user7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jTextField_user_pNumber1.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user_pNumber1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user_pNumber1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user_pNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_user_pNumber1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_user_pNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 140, -1));

        jLabel_password3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_password3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password3.setText("Contraseña");
        jPanel1.add(jLabel_password3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jPasswordField3.setBackground(new java.awt.Color(190, 221, 255));
        jPasswordField3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 140, 20));

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

        jComboBox1.setBackground(new java.awt.Color(190, 221, 255));
        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de servicio", "Mecánico", "Bicicletería", "Ambulancia" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel_user_email.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_user_email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_user_email.setText("Correo electronico");
        jPanel1.add(jLabel_user_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jTextField_user_email.setBackground(new java.awt.Color(190, 221, 255));
        jTextField_user_email.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextField_user_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jTextField_user_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_user_emailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField_user_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 180, 20));

        jLabel_password2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel_password2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_password2.setText("Repita contraseña");
        jPanel1.add(jLabel_password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));

        jPasswordField2.setBackground(new java.awt.Color(190, 221, 255));
        jPasswordField2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 170, 20));

        jComboBox3.setBackground(new java.awt.Color(190, 221, 255));
        jComboBox3.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Método de pago", "Tarjeta de Crédito y Débito", "Transferencias Bancarias", "Billeteras Electrónicas" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        jComboBox4.setBackground(new java.awt.Color(190, 221, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Términos Y Condiciones", "Estoy de Acuerdo", "No Estoy De Acuerdo" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jButton_registrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register (1).png"))); // NOI18N
        jButton_registrar1.setContentAreaFilled(false);
        jButton_registrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/register 200.png"))); // NOI18N
        jButton_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_registrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 170, 50));

        Label_Fondo3.setForeground(new java.awt.Color(255, 255, 255));
        Label_Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/imagen_fondo_5.jpeg"))); // NOI18N
        jPanel1.add(Label_Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Servicio", jPanel1);

        desktopPane.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 740, 540);

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 541));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Registrarse como:");
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jTextField_user3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_user3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_user3ActionPerformed

    private void jTextField_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_userActionPerformed

    private void jTextField_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_user1ActionPerformed

    private void jTextField_user_pNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_user_pNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_user_pNumberActionPerformed

    private void VolverbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverbuttonActionPerformed
        login_como verlogin_como = new login_como();
        verlogin_como.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverbuttonActionPerformed

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        registrarUsuario();
    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jTextField_user4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_user4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_user4ActionPerformed

    private void jTextField_user5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_user5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_user5ActionPerformed

    private void jTextField_user_pNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_user_pNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_user_pNumber1ActionPerformed

    private void jButton_salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salir2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_salir2ActionPerformed

    private void Volverbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volverbutton2ActionPerformed
        login_como verlogin_como = new login_como();
        verlogin_como.setVisible(true);
        dispose();
    }//GEN-LAST:event_Volverbutton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField_user_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_user_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_user_emailActionPerformed

    private void jButton_registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrar1ActionPerformed
        registrarServicio();//llamar registrar servicios
    }//GEN-LAST:event_jButton_registrar1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(register_como.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register_como.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register_como.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register_como.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register_como().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Fondo2;
    private javax.swing.JLabel Label_Fondo3;
    private javax.swing.JButton Volverbutton;
    private javax.swing.JButton Volverbutton2;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JButton jButton_registrar1;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JButton jButton_salir2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_password1;
    private javax.swing.JLabel jLabel_password2;
    private javax.swing.JLabel jLabel_password3;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JLabel jLabel_user1;
    private javax.swing.JLabel jLabel_user2;
    private javax.swing.JLabel jLabel_user3;
    private javax.swing.JLabel jLabel_user4;
    private javax.swing.JLabel jLabel_user6;
    private javax.swing.JLabel jLabel_user7;
    private javax.swing.JLabel jLabel_user_email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_user;
    private javax.swing.JTextField jTextField_user1;
    private javax.swing.JTextField jTextField_user3;
    private javax.swing.JTextField jTextField_user4;
    private javax.swing.JTextField jTextField_user5;
    private javax.swing.JTextField jTextField_user_email;
    private javax.swing.JTextField jTextField_user_pNumber;
    private javax.swing.JTextField jTextField_user_pNumber1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
