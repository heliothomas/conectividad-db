package files;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.HeadlessException;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Estudiantes extends javax.swing.JFrame {

Libreria lib = new Libreria();
Connection con;
PreparedStatement ps;
CallableStatement cs;//ocupado para SP Insertar
ResultSet rs;

    public Estudiantes() {
        initComponents();
        setLocationRelativeTo(lib);
        btClean.setMnemonic(KeyEvent.VK_L);
        btExit.setMnemonic(KeyEvent.VK_X);
        btSave.setMnemonic(KeyEvent.VK_C);
        btRead.setMnemonic(KeyEvent.VK_R);
        btUpdate.setMnemonic(KeyEvent.VK_U);
        btDelete.setMnemonic(KeyEvent.VK_D);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ftfCed = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ftfCel = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        tfFecNac = new javax.swing.JTextField();
        lbResult = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        btRead = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btClean = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfApel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfDir = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        cbbxSex = new javax.swing.JComboBox();
        ftfCarnet = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Estudiantes");
        setBackground(new java.awt.Color(153, 204, 255));
        setLocationByPlatform(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DIGITE SUS DATOS");

        try {
            ftfCed.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCed.setNextFocusableComponent(tfName);

        jLabel5.setText("Cédula");

        jLabel1.setText("Nombres");

        tfName.setNextFocusableComponent(tfApel);

        jLabel3.setText("Celular");

        try {
            ftfCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("8###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCel.setNextFocusableComponent(tfFecNac);

        jLabel2.setText("Fecha de Nacimiento");

        tfFecNac.setNextFocusableComponent(tfDir);

        lbResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbResult.setText("    ");

        btSave.setText("Create");
        btSave.setNextFocusableComponent(btRead);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btRead.setText("Read");
        btRead.setNextFocusableComponent(btUpdate);

        btUpdate.setText("Update");
        btUpdate.setNextFocusableComponent(btDelete);

        btDelete.setText("Delete");

        btClean.setText("Clean");
        btClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCleanActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        jLabel6.setText("Carnet");

        jLabel7.setText("Apellidos");

        tfApel.setNextFocusableComponent(ftfCel);

        jLabel8.setText("Direccion");

        tfDir.setNextFocusableComponent(tfEmail);

        jLabel9.setText("Email");

        jLabel10.setText("Sexo");

        tfEmail.setNextFocusableComponent(cbbxSex);

        cbbxSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        cbbxSex.setNextFocusableComponent(btSave);

        try {
            ftfCarnet.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCarnet.setNextFocusableComponent(ftfCed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfCarnet))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfCed, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(369, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfApel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfCel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDir, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btSave)
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbResult)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btRead)
                                        .addGap(66, 66, 66)
                                        .addComponent(btUpdate)
                                        .addGap(23, 23, 23)))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btExit)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btClean)
                                .addComponent(btDelete)))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClean)
                    .addComponent(jLabel6)
                    .addComponent(ftfCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ftfCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExit))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfApel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfDir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(btRead)
                    .addComponent(btUpdate)
                    .addComponent(btDelete)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    private void btCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanActionPerformed
        ftfCarnet.setText("");
        ftfCed.setText("");
        tfName.setText("");
        tfApel.setText("");
        ftfCel.setText("");
        tfFecNac.setText("");
        tfDir.setText("");
        tfEmail.setText("");
        lbResult.setText("");
    }//GEN-LAST:event_btCleanActionPerformed
    
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        final Long carnet = Long.parseLong(ftfCarnet.getText());
        final Integer cel = Integer.parseInt(ftfCel.getText().replace("-", ""));
        lib.insertar(carnet, ftfCed.getText(), tfName.getText(), tfApel.getText(), cel, tfFecNac.getText(), tfDir.getText(), tfEmail.getText(), cbbxSex.getSelectedItem().toString());
    }//GEN-LAST:event_btSaveActionPerformed

    private void btReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReadActionPerformed
        final Long carnet = Long.parseLong(ftfCarnet.getText());

        try {
            lib.conect();
            if (con != null) {
                cs = con.prepareCall("{call buscar(?)}");
                cs.setLong(1, carnet);
                rs = cs.executeQuery();

                if(rs.next()){
                    ftfCed.setText(rs.getString(1));
                    tfName.setText(rs.getString(2));
                    tfApel.setText(rs.getString(3));
                    ftfCel.setText(rs.getString(4));
                    tfFecNac.setText(rs.getString(5));
                    tfDir.setText(rs.getString(6));
                    tfEmail.setText(rs.getString(7));
                    cbbxSex.setSelectedItem(rs.getString(8));
                    JOptionPane.showMessageDialog(this,"Estudiante encontrado","Aviso :)",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }        
    }//GEN-LAST:event_btReadActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        final Long carnet = Long.parseLong(ftfCarnet.getText());
        final Integer cel = Integer.parseInt(ftfCel.getText().replace("-", ""));
        lib.actualizar(carnet, ftfCed.getText(), tfName.getText(), tfApel.getText(), cel, tfFecNac.getText(), tfDir.getText(), tfEmail.getText(), cbbxSex.getSelectedItem().toString());
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        final Long carnet = Long.parseLong(ftfCarnet.getText());
        lib.eliminar(carnet);
    }//GEN-LAST:event_btDeleteActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("Error con LAF: " + e.getMessage());
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Estudiantes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClean;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btRead;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox cbbxSex;
    private javax.swing.JFormattedTextField ftfCarnet;
    private javax.swing.JFormattedTextField ftfCed;
    private javax.swing.JFormattedTextField ftfCel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbResult;
    private javax.swing.JTextField tfApel;
    private javax.swing.JTextField tfDir;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFecNac;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}