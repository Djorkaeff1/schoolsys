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

public class SchoSys extends JFrame implements ActionListener {

    // ===== Componentes Gráficos =====
    private JButton btCancelar;
    private JButton btSalvar;
    private JLabel lbTitulo;
    private JLabel lbId;
    private JLabel lbNome;
    private JLabel lbNivelEsc;
    private JLabel lbSerie;
    private JLabel lbSexo;
    private JTextField tfId;
    private JTextField tfNome;
    private JTextField tfNivelEsc;
    private JTextField tfSerie;
    private JTextField tfSexo; 
    
   
    // ================================
    
    // Container de Componentes - AWT
    private Container container;
    
    // Método Construtor do Frame de Formulário
    public SchoSys() {
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
        
        // Criando os componentes da Frame
        btCancelar = new JButton("Cancelar");
        btSalvar = new JButton("Salvar");
        lbTitulo = new JLabel("School-System");
        lbId = new JLabel("Id : ");
        lbNome = new JLabel("Nome : ");
        lbNivelEsc = new JLabel("Nível Escolar : ");
        lbSerie = new JLabel("Série : ");
        lbSexo = new JLabel("Sexo : ");
        tfId = new JTextField( 10 );
        tfNome = new JTextField( 20 );
        tfNivelEsc = new JTextField( 12 );
        tfSerie = new JTextField( 2 );
        tfSexo = new JTextField( 10 );
        
        // ===============================
        
        // === Adicionando os componentes ao Frame ===
        lbTitulo.setBounds(244, 20, 200, 40);
        lbTitulo.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 25));
        painel.add(lbTitulo);
        
        lbId.setBounds(30, 80, 200, 40);
        lbId.setFont(new Font("Times New Roman", Font.PLAIN , 18));
        painel.add(lbId);
        tfId.setBounds(60, 90, 100, 20);
        painel.add(tfId);
        
        lbNome.setBounds(30, 150, 200, 40);
        lbNome.setFont(new Font("Times New Roman", Font.PLAIN , 18));
        painel.add(lbNome);
        tfNome.setBounds(90, 160, 200, 20);
        painel.add(tfNome);
        
        lbNivelEsc.setBounds(250, 80, 200, 40);
        lbNivelEsc.setFont(new Font("Times New Roman", Font.PLAIN , 18));
        painel.add(lbNivelEsc);
        tfNivelEsc.setBounds(360, 90, 200, 20);
        painel.add(tfNivelEsc);
        
        lbSerie.setBounds(380, 150, 200, 40);
        lbSerie.setFont(new Font("Times New Roman", Font.PLAIN , 18));
        painel.add(lbSerie);
        tfSerie.setBounds(430, 160, 40, 20);
        painel.add(tfSerie);
        
        lbSexo.setBounds(30, 220, 200, 40);
        lbSexo.setFont(new Font("Times New Roman", Font.PLAIN , 18));
        painel.add(lbSexo);
        tfSexo.setBounds(80, 230, 200, 20);
        painel.add(tfSexo);
        
        
        btCancelar.setBounds(450, 270, 85, 25);
        painel.add(btCancelar);
        
        btSalvar.setBounds(545, 270, 85, 25); // coluna, linha, largura, altura
        painel.add(btSalvar);
        // ===========================================
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Dá a função de fechar ao X
        
        // Adiciona os botões a lista de eventos de clique
        btCancelar.addActionListener(this);
        btSalvar.addActionListener(this);
        
        //this.setSize( 640, 480 ); // Tamanho do Frame suficiente pros componentes
        this.setResizable( false ); // Tira a opção de maximizar
        this.setVisible( true ); // Apresenta o Frame
    }
    
    public static void main(String[] args) {
        SchoSys form = new SchoSys();
    }

    // Tratador de eventos de cliques
    @Override
    public void actionPerformed(ActionEvent e) {
        if( e.getSource()== btCancelar) {
            this.setVisible( false );
            JOptionPane.showMessageDialog(this, "Cadastro cancelado!");
            System.exit( 0 );
        }
        else if( e.getSource() == btSalvar) {
            salvar();
        }
    }

    // Salva o cadastro
    private void salvar() {
        if( isCamposInconsistentes() ) {
            JOptionPane.showMessageDialog(this, "Cadastro concluído!");
        }
    }

    // Valida as entradas dos campos
    private boolean isCamposInconsistentes() {
        String id = tfId.getText().trim();
        String serie = tfSerie.getText().trim();
        String nome = tfNome.getText().trim();
        String nivel = tfNivelEsc.getText().trim();
        String sexo = tfSexo.getText().trim();
        
        // Teste para vazio
        if ( id.equals("") ) {
            JOptionPane.showMessageDialog(this, "O campo ID não pode ficar vazio!", "Error",
    JOptionPane.ERROR_MESSAGE);
            tfId.requestFocus();
            return false;
        }
        else if (serie.equals("")) {
            JOptionPane.showMessageDialog(this, "O campo Série não pode ficar vazio!", "Error",
    JOptionPane.ERROR_MESSAGE);
            tfSerie.requestFocus();
            return false;
        }
        else if (nome.equals("")) {
            JOptionPane.showMessageDialog(this, "O campo Nome não pode ficar vazio!", "Error",
    JOptionPane.ERROR_MESSAGE);
            tfNome.requestFocus();
            return false;
        }
        else if (nivel.equals("")) {
            JOptionPane.showMessageDialog(this, "O campo Nível Escolar não pode ficar vazio!", "Error",
    JOptionPane.ERROR_MESSAGE);
            tfNivelEsc.requestFocus();
            return false;
        }
        else if (sexo.equals("")) {
            JOptionPane.showMessageDialog(this, "O campo Sexo não pode ficar vazio!", "Error",
    JOptionPane.ERROR_MESSAGE);
            tfSexo.requestFocus();
            return false;
        }
        
        // Teste para as entradas Inteiras
        try {
            Integer.parseInt(id);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "O campo ID deve conter apenas números!", "Error",
    JOptionPane.ERROR_MESSAGE);
            tfId.requestFocus();
            return false;
        }
        try {
            Integer.parseInt(serie);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "O campo Série deve conter apenas números!", "Error",
    JOptionPane.ERROR_MESSAGE);
            tfSerie.requestFocus();
            return false;
        }
        
        return true;
    }
    
}
