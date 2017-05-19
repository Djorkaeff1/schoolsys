package SchoSys.src.schosys;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Davi Mendes on 19/05/2017.
 */
public class SchoEdit extends JFrame implements ActionListener {

    private Container ct;
    public SchoEdit() {
        super("Editar Registros");
        ct = this.getContentPane();
        GridLayout editGrid = new GridLayout(1,1);
        ct.setLayout(editGrid);
        ct.add(new JLabel("TESTE DE EDICAO"));
        this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        this.pack();
        this.setResizable( false );
        this.setLocationRelativeTo( null );
        this.setVisible( true );
    }

    public void main(String[] args) {
        new SchoEdit();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
