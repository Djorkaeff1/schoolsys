package SchoSys.src.schosys;

import SchoSys.src.schosys.SchoEdit;
import SchoSys.src.schosys.SchoSys;
import SchoSys.src.schosys.FrameSobre;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

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
    public MainMenu(){
        super("School-System v1.beta");
        
        JPanel painel = new JPanel();
        painel.setPreferredSize(new Dimension(640, 300));
        painel.setLayout( null );
        this.add(painel);
        this.pack();
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //container = this.getContentPane(); // Implementa o container ao Frame
        //container.setLayout( new FlowLayout() ); // Seta o layout ajustável
        // ========================
        
        
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
        miSobre.addActionListener(this);
        miEditar.addActionListener(this);
      //  miNovo.addActionListener(this);
      //  miSair.addActionListener(this);
      //  miSobre.addActionListener(this);
        
        this.setJMenuBar(barraMenu);
        this.setVisible( true );
        this.setResizable( false );
    }
    
    public static void main(String[] args){
        new MainMenu();       
    }

    // Tratador de eventos de cliques
    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource()== miNovo) {
            this.dispose();
            new SchoSys();
        }
        else if(e.getSource() == miEditar) {
            System.out.println("EDITAR");
            //Menu de edição
            new SchoEdit();
        }
        else if( e.getSource() == miSobre ) {
           //JOptionPane.showMessageDialog(this, "Programa desenvolvido por Djorkaeff!");
           System.out.println("HELP");
           new FrameSobre();
        }
    }
    
}