package files;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Productos extends JFrame { //implements ActionListener
    Connection con;
    Statement stm;
    ResultSet rs;
    PreparedStatement ps ;
    //JComboBox cbbId;
    /* Creates new form Productos */
    public Productos() {
        initComponents();
        setSize(500, 400);
        FlowLayout flow = new FlowLayout();

        try {
            UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:Productos", "", "");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select id from productos");

            while (rs.next())
            {
                cbbId.addItem(Integer.toString(rs.getInt(1)));
            }
            con.close();
        } catch(UnsupportedLookAndFeelException | SQLException | ClassNotFoundException e) {
            System.out.println("Error : " + e );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblCant = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        cbbId = new javax.swing.JComboBox();
        error = new javax.swing.JLabel();

        jLabel1.setText("Información de Productos");

        lblId.setText("ID");

        lblNombre.setText("Nombre");

        lblDesc.setText("Descripcion");

        lblCant.setText("Cantidad");

        btnInsertar.setText("Insertar");
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarMouseClicked(evt);
            }
        });
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cbbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbIdActionPerformed(evt);
            }
        });

        error.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDesc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCant)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombre)
                                            .addComponent(lblId))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                                                .addComponent(cbbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(error)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnActualizar)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnLimpiar)))
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(cbbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesc)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCant)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(error)
                .addContainerGap())
        );

        lblId.getAccessibleContext().setAccessibleName("lblId");
        lblNombre.getAccessibleContext().setAccessibleName("lblNombre");
        lblDesc.getAccessibleContext().setAccessibleName("lblDesc");
        lblCant.getAccessibleContext().setAccessibleName("lblCant");
        txtId.getAccessibleContext().setAccessibleName("txtId");
        txtNombre.getAccessibleContext().setAccessibleName("txtNombre");
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        try {
            con = DriverManager.getConnection("jdbc:odbc:Productos");
            stm = con.prepareStatement("INSERT INTO productos values (?,?,?,?)");
            String id = txtId.getText();
            String name = txtNombre.getText();
            String desc = txtDesc.getText();
            String cant = txtCant.getText();
            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, name);
            ps.setString(3, desc);
            ps.setInt(4, Integer.parseInt(cant));
            ps.executeUpdate();
            con.close();
            con = DriverManager.getConnection("jdbc:odbc:Productos");
            stm = con.createStatement();
            rs = stm.executeQuery("select id from productos");
            cbbId.removeAllItems();

            while (rs.next()) {
                cbbId.addItem(Integer.toString(rs.getInt(1)));
                con.close();
                error.setText("Fila insertada");
            }
        } catch (SQLException | NumberFormatException e) {
            error.setText("La fila no pudo ser insertada: " + e.getMessage());
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            con = DriverManager.getConnection("jdbc:odbc:Productos");
            stm = con.prepareStatement("update productos set nombre = ?, descripcion = ?, "
                    + "cantidad = ? where id = ?");
            final String id_selec = txtId.getText();
            final String name = txtNombre.getText();
            final String desc = txtDesc.getText();
            final String cant = txtCant.getText();
            final int id = Integer.parseInt(id_selec);
            stm = con.createStatement();
            ps.setString(1, name);
            ps.setString(2, desc);
            ps.setInt(3, Integer.parseInt(cant));
            ps.executeUpdate();
            con.close();
            error.setText("Fila actualizada");
        } catch (SQLException | NumberFormatException e) {
            error.setText("La fila no pudo ser actualizada: " + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseClicked
        try {
            con = DriverManager.getConnection("jdbc:odbc:Productos");
            stm = con.prepareStatement("insert into productos values (?,?,?,?)");
            final String id = txtId.getText();
            final String name = txtNombre.getText();
            final String desc = txtDesc.getText();
            final String cant = txtCant.getText();
            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, name);
            ps.setString(3, desc);
            ps.setInt(4, Integer.parseInt(cant));
            ps.executeUpdate();
            con.close();

            con = DriverManager.getConnection("jdbc:odbc:Productos");
            stm = con.createStatement();
            rs = stm.executeQuery("select id from productos");
            cbbId.removeAllItems();

            while (rs.next()) {
                cbbId.addItem(Integer.toString(rs.getInt(1)));
                con.close();
                cbbId.addActionListener((ActionListener)this);
                error.setText("Fila insertada");
            }
        } catch (SQLException | NumberFormatException e) {
            error.setText("La fila no pudo ser insertada: " + e.getMessage());
        }
    }//GEN-LAST:event_btnInsertarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        try {
            con = DriverManager.getConnection("jdbc:odbc:Productos");
            stm = con.prepareStatement("delete from productos "
                    + "where id = ?");
            final String id_selec = cbbId.getSelectedItem().toString();
            final int id = Integer.parseInt(id_selec);
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();

            con = DriverManager.getConnection("jdbc:odbc:Productos");
            stm = con.createStatement();
            rs = stm.executeQuery("select id from productos");
            cbbId.removeAllItems();

            while(rs.next()) {
                cbbId.addItem(Integer.toString(rs.getInt(1)));
                con.close();
                cbbId.addActionListener((ActionListener)this);
                txtId.setText("");
                txtNombre.setText("");
                txtDesc.setText("");
                txtCant.setText("");
                error.setText("Fila eliminada");
            }
        } catch (SQLException | NumberFormatException e) {
            error.setText("La fila no pudo ser eliminada: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        try {
            con = DriverManager.getConnection("jdbc:odbc:Productos");
            stm = con.prepareStatement("update productos set nombre = ?, "
                    + "descripcion = ?, cantidad = ? where id = ?");
            final String id_selec = txtId.getText();
            final String name = txtNombre.getText();
            final String desc = txtDesc.getText();
            final String cant = txtCant.getText();
            final int id = Integer.parseInt(id_selec);
            stm = con.createStatement();
            ps.setString(1, name);
            ps.setString(2, desc);
            ps.setInt(3, Integer.parseInt(cant));
            ps.executeUpdate();
            con.close();         
            error.setText("Fila actualizada");
        } catch (NumberFormatException | SQLException e) {
            error.setText("La fila no pudo ser actualizada: " + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtId.setText("");
        txtNombre.setText("");
        txtDesc.setText("");
        txtCant.setText("");
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void cbbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbIdActionPerformed
        try {
            con = DriverManager.getConnection("jdbc:odbc:Productos");
            String idSelected = cbbId.getSelectedItem().toString();
            int id = Integer.parseInt(idSelected);
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT nombre,descripcion,cantidad from productos where id = " + id);

            while (rs.next()) {
                txtId.setText(idSelected);
                txtNombre.setText(rs.getString(1));
                txtDesc.setText(rs.getString(2));
                txtCant.setText(rs.getString(3));
            }
            con.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error al obtener del combo: " + e.getMessage());
        }
    }//GEN-LAST:event_cbbIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cbbId;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public static void main (String args []) {
        Productos p = new Productos();
        p.show();
    }
}