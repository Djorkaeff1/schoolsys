package schosys;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameSobre extends JFrame{
    
    private Container container;
    
    public FrameSobre() {
        
        super("Sobre..");
        
        container = this.getContentPane();
        
        container.setLayout(new GridLayout( 8, 1 ) );
        container.add( new JLabel( "School-System v1.beta" ));
        container.add( new JLabel( "Desenvolvedores:" ));
        
        container.add( new JLabel( "" ));
        
        container.add( new JLabel( " Djorkaeff Alexandre" ));
        container.add( new JLabel( "Email: djorkaeffalexandre@gmail.com" ));
        
        container.add( new JLabel( "" ));
        
        container.add( new JLabel( " Davi Mendes" ));
        container.add( new JLabel( "Email: davi.aviva@gmail.com" ));
        
        this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );

        this.pack();
        this.setResizable( false );
        this.setLocationRelativeTo( null );
        this.setVisible( true );
    }
}

