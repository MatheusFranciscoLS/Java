package ProvaGrupo1;

import javax.swing.*;

public class Jframe extends JFrame{
    public Jframe() {
        super("Calculadoras");
        this.add(new Jtabbedpane());
        //set frame
        this.setBounds(500, 100, 500, 500);
        this.setVisible(true);
    }
}