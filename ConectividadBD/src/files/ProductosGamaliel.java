package files;

import java.sql.*;

public class ProductosGamaliel
{
    public static void main(String[]args) {
        try {
            String str = "select * from productos";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:Productos", "sa", "j27j1991");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            System.out.println("ID: \tNombre: \tDescripcion: \tCantidad: ");
            while (rs.next()) { //Mostrar el resultadoc
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String cantidad = rs.getString("cantidad");

                System.out.print(id + "\t\t");
                if (nombre.length() <= 7)
                    System.out.print(nombre + "\t\t");
                else
                    System.out.print(nombre + "\t");
                if (descripcion.length() <= 7)
                    System.out.print(descripcion + "\t\t");
                else {
                    System.out.print(descripcion + "\t");
                    System.out.println(cantidad);
                }
            }
            con.close();
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}