package files;

import java.sql.*;

public class AuthorsInfo {
    public static void main(String[]args){
        try (
            //Establecer una conexión con un Orígen de datos
            Connection con = DriverManager.getConnection("jdbc:odbc:Productos", "sa", "j27j1991");
            ) {
            String str = "select * from productos";
            //Inicializar y cargar el driver Puente JDBC-ODBC
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            System.out.println("ID: \tNombre: \tDescripcion: \tCantidad: ");

            while (rs.next()) {
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
            System.out.println("Ha ocurrido un error");
            System.out.println("Error: " + e);
        }
    }
}