
package Conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Conexion {
    static Connection conexion = null;
    
    public static Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Control_de_Empleados";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), 
                    "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        try{
            conexion = DriverManager.getConnection(url, "sa", "123");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), 
                    "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConnection();
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(), 
                    "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    public void desconectar() {
        try {
            conexion.close();
        } catch (Exception ex) {
        }
    }
}
