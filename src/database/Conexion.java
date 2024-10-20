
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private final String DRIVER="com.mysql.jdbc.Driver";
    private final String URL="bqkvr2puqldwqoel39uj-mysql.services.clever-cloud.com:3306";
    private final String DB="bqkvr2puqldwqoel39uj";
    private final String USER="ua1ug1iu9ymrlzqx";
    private final String PASSWORD="20KHM6qE5VgoeC8QPCCI";
    
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
