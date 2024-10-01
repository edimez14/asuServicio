/**
 * enter the database: https://phpmyadmin.co/index.php?db=sql10734745&table=user_db&target=sql.php
 * server: sql10.freesqldatabase.com:3306
 * user: sql10734745
 * password: psktmJVElC
 */


package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private final String DRIVER="com.mysql.jdbc.Driver";
    private final String URL="jdbc:mysql://sql10.freesqldatabase.com:3306/";
    private final String DB="sql10734745";
    private final String USER="sql10734745";
    private final String PASSWORD="psktmJVElC";
    
    public Connection cadena;
    public static Conexion instancia;
    
    private Conexion(){
        this.cadena=null;
    }
    
    public Connection conectar(){
        try {
            Class.forName(DRIVER);
            this.cadena=DriverManager.getConnection(URL+DB,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }
    
    public void desconectar(){
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public synchronized static Conexion getInstancia(){
        if (instancia==null){
            instancia=new Conexion();
        }
        return instancia;
    }
}
