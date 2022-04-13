
package tela;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class TelaCadastroEstado extends JInternalFrame implements ActionListener{
    public JPanel jpBotoes = new JPanel();
    public JButton jbIncluir = new JButton("Incluir");
    public JButton jbAlterar = new JButton("Alterar");
    public JButton jbExcluir = new JButton("Excluir");
    public JButton jbConsultar = new JButton("Consultar");
    public JButton jbConfirmar = new JButton("Confirmar");
    public JButton jbCancelar = new JButton("Cancelar");
    
    public final int PADRAO = 0;
    public final int INCLUINDO = 1;
    public final int ALTERANDO = 2;
    public final int EXCLUINDO = 3;
    public final int CONSULTANDO = 4;
    public int estadoTela = PADRAO;
    public boolean temDadosNaTela = false;
    
    
    public TelaCadastroEstado(){
        super("Cadastro de Estado", true, true, true, true);
        getContentPane().add(BorderLayout.PAGE_END, jpBotoes);
        jpBotoes.setLayout(new GridLayout(1, 6));
        jpBotoes.add(jbIncluir);
        jpBotoes.add(jbAlterar);
        jpBotoes.add(jbExcluir);
        jpBotoes.add(jbConsultar);
        jpBotoes.add(jbConfirmar);
        jpBotoes.add(jbCancelar);
        
        jbIncluir.addActionListener(this);
        jbAlterar.addActionListener(this);
        jbExcluir.addActionListener(this);
        jbConsultar.addActionListener(this);
        jbConfirmar.addActionListener(this);
        jbCancelar.addActionListener(this);
        
        
        pack();
        setVisible(true);
        habilitaBotoes();
    }
    
    public void habilitaBotoes(){
        jbIncluir.setEnabled(estadoTela==PADRAO);
        jbAlterar.setEnabled(estadoTela==PADRAO && temDadosNaTela);
        jbExcluir.setEnabled(estadoTela==PADRAO && temDadosNaTela);
        jbConsultar.setEnabled(estadoTela==PADRAO);
        jbConfirmar.setEnabled(estadoTela!=PADRAO);
        jbCancelar.setEnabled(estadoTela!=PADRAO);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbIncluir){
            estadoTela = INCLUINDO;
        }else if(e.getSource() == jbAlterar){
            estadoTela = ALTERANDO;
        }else if(e.getSource() == jbExcluir){
            estadoTela = EXCLUINDO;
        }else if(e.getSource() == jbConsultar){
            estadoTela = CONSULTANDO;
        }else if(e.getSource() == jbConfirmar){
            estadoTela = PADRAO;
        }else if(e.getSource() == jbCancelar){
            estadoTela = PADRAO;
        }
        habilitaBotoes();
    }
}
