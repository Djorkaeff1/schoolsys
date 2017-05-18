package schosys;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainMenu extends JFrame implements ActionListener {

	// ===== Componentes Gráficos =====
	private JMenuBar barraMenu;
    private JMenu mnAluno;
    private JMenu mnConsulta;
    private JMenu mnAjuda;
    private JMenuItem miNovo;
    private JMenuItem miEditar;
    private JMenuItem miRemover;
    private JMenuItem miRegistro;
    private JMenuItem miAll;
    private JMenuItem miSobre;
	// ================================

    // Container de Componentes - AWT
    private Container container;
    
    // Método Construtor do Frame de Formulário
    public MainMenu() {
        super("School-System v1.beta");
        
        JPanel painel = new JPanel();
        painel.setPreferredSize(new Dimension(640, 300));
        painel.setLayout( null );
        this.add(painel);
        this.pack();
        this.setLocationRelativeTo( null );
        
        //container = this.getContentPane(); // Implementa o container ao Frame
        //container.setLayout( new FlowLayout() ); // Seta o layout ajustável
        painel.setBackground(Color.CYAN); // Seta o fundo do Frame a Cyano

        barraMenu = new JMenuBar();
        mnAluno = new JMenu( "Aluno" );
        mnConsulta = new JMenu( "Consulta" );
        mnAjuda = new JMenu( "Ajuda" );
        miNovo = new JMenuItem( "Novo" );
        miEditar = new JMenuItem( "Editar" );
        miRemover = new JMenuItem( "Remover" );
        miRegistro = new JMenuItem( "Registro" );
        miAll = new JMenuItem( "Todos alunos" );
        miSobre = new JMenuItem( "Sobre.." );

        barraMenu.add( mnAluno );
        barraMenu.add( mnConsulta );
        barraMenu.add( mnAjuda );
        
        mnAluno.add( miNovo );
        mnAluno.add( miEditar );
        mnAluno.add( miRemover );
        mnConsulta.add( miRegistro );
        mnConsulta.add( miAll );
        mnAjuda.add( miSobre );

        miNovo.addActionListener(this);
      //  btLimpar.addActionListener(this);
      //  miNovo.addActionListener(this);
      //  miSair.addActionListener(this);
      //  miSobre.addActionListener(this);
        
        this.setJMenuBar(barraMenu);

        this.setVisible( true );
        this.setResizable( false );
    }

    public static void main(String[] args) {
        new MainMenu();
    }

    // Tratador de eventos de cliques
    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource()== miNovo) {
            this.setVisible( false );
            new SchoSys();
        }
    }
}