package SchoSys.src.schosys;

import javax.swing.*;
import java.awt.*;


/**
 * Created by Davi Mendes on 19/05/2017.
 */
public class EditForm extends  JFrame{
    private JPanel rootpanel;
    private JPanel titleLabel;

    public EditForm() {
        super("Editor de Registros");
        this.setContentPane(rootpanel);
        rootpanel.setPreferredSize(new Dimension(640, 300));
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    public void main(String[] args) {
        new EditForm();
    }

}
