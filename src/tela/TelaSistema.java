
package tela;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaSistema extends JFrame implements ActionListener{
    public JDesktopPane jdp = new JDesktopPane();
    public JMenuBar jmb = new JMenuBar();
    public JMenu jmCadastros = new JMenu("Cadastros");
    public JMenu jmMovimentos = new JMenu("Movimentos");
    public JMenu jmRelatorios = new JMenu("Relatorios");
    public JMenuItem jmiEstado = new JMenuItem("Estado");
    public JMenuItem jmiCidade = new JMenuItem("Cidade");
    public JMenuItem jmiFornecedor = new JMenuItem("Fornecedor");
    
    
    public TelaSistema(){
        getContentPane().add(jdp);
        
        setTitle("Sistema Comercial");
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(jmb);
        jmb.add(jmCadastros);
        jmb.add(jmMovimentos);
        jmb.add(jmRelatorios);
        
        jmCadastros.add(jmiEstado);
        jmCadastros.add(jmiCidade);
        jmCadastros.add(jmiFornecedor);
        
        jmiEstado.addActionListener(this);
        jmiCidade.addActionListener(this);
        jmiFornecedor.addActionListener(this);
                
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jmiEstado){
            TelaCadastroEstado telaCadastroEstado = new TelaCadastroEstado();
            jdp.add(telaCadastroEstado);
        } 
    }
}
