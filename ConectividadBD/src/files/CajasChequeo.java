package files;

import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class CajasChequeo extends JFrame {

    public CajasChequeo() {
        super("Cajas Chequeo");
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());                 
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        } catch (UnsupportedLookAndFeelException e) {
          System.out.println("Error con el look and feel: " + e.getMessage());
        }        
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox cursoJava = new JCheckBox("Curso de Java", true);
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash", true);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP", false);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby", false);
        FlowLayout dis = new FlowLayout();
        ButtonGroup cursos = new ButtonGroup();
        cursos.add(cursoJava);
        cursos.add(cursoFlash);
        cursos.add(cursoPHP);
        cursos.add(cursoRuby);
        setLayout(dis);
        add(cursoJava);
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);
        setLocationRelativeTo(this);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        CajasChequeo app = new CajasChequeo();
    }
}