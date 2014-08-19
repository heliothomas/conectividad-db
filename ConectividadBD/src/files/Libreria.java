package files;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class Libreria extends JFrame{

Connection con;
PreparedStatement ps;//ocupado para insertar,actualizar,eliminar
CallableStatement cs;//ocupado para SP Insertar
ResultSet rs;

    public void conect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //work
            con = DriverManager.getConnection("jdbc:sqlserver://172.16.61.24:1433;database=test;user=sa;password=ucasql;");
            //casa
            //con = DriverManager.getConnection("jdbc:sqlserver://190.212.35.208:1433;database=test;user=sa;password=j27j1991;");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Problemas con el Driver Manager...: " + e.toString());
        }
    }

    public void insertar(long carnet, String cedula, String nombres, String apel, int cel, String fecnac, String direc, String email, String sexo){
        try {
            conect();
            String sql = "INSERT INTO tbest VALUES('"+carnet+"','"+cedula+"','"+nombres+"','"+apel+"','"+cel+"','"+fecnac+"','"+direc+"','"+email+"','"+sexo+"')";
            
            if (con != null) {
                //ps = con.prepareStatement(sql);
                //int val = ps.executeUpdate();
                cs = con.prepareCall("{call grabar(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                cs.setLong(1, carnet);
                cs.setString(2, cedula);
                cs.setString(3, nombres);
                cs.setString(4, apel);
                cs.setInt(5, cel);
                cs.setString(6, fecnac);
                cs.setString(7, direc);
                cs.setString(8, email);
                cs.setString(9, sexo);

                int val = cs.executeUpdate();
                con.close();

                if (val == 1)
                    JOptionPane.showMessageDialog(null, "La inserción ha sido exitosa...\nFelicidades :)");
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    public void actualizar(long carnet, String cedula, String nombres, String apel, int cel, String fecnac, String direc, String email, String sexo){
        try {
            conect();
//String sql = "update tbest set cedula='" + cedula + "', nombres='" 
//        + nombres + "', apellidos='" + apel + "', celular='" 
//        + cel + "', fecnac='" + fecnac + "', direccion='" 
//        + direc + "', email='" + email + "', sexo='" 
//        + sexo + "' where carnet='" + carnet + "'";
            if (con != null) {
                cs = con.prepareCall("{call actualizar(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                cs.setString(1, cedula);
                cs.setString(2, nombres);
                cs.setString(3, apel);
                cs.setInt(4, cel);
                cs.setString(5, fecnac);
                cs.setString(6, direc);
                cs.setString(7, email);
                cs.setString(8, sexo);
                cs.setLong(9, carnet);
                
                int val = cs.executeUpdate();
                //ps = con.prepareStatement(sql);
                //ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados :)");
                con.close();
            }
        } catch (SQLException | HeadlessException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver?\nInclude in your library path!");
        }
    }

    public void eliminar(long carnet){
        try {
            conect();
            if (con != null) {
                cs = con.prepareCall("{call eliminar(?)}");
                cs.setLong(1, carnet);
                //ps = con.prepareStatement("delete from tbest where carnet='" + carnet + "'");
                //ps.executeUpdate();
                int val = cs.executeUpdate();
                
                //Estudiantes es = new Estudiantes();
                //es.tfName.setText("");
                con.close();
                JOptionPane.showMessageDialog(this, "Estudiante eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe este carnet. :(\n:" + e.getMessage());
        }
    }
}