
package tela;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastroEstado extends TelaCadastro{
    public JLabel jlCodigo = new JLabel("Código");
    public JLabel jlNome = new JLabel("Nome");
    public JLabel jlSigla = new JLabel("Sigla");
    public JLabel jlAtivo = new JLabel("Ativo");
    
    public JTextField jtfCodigo = new JTextField(10);
    public JTextField jtfNome = new JTextField(50);
    public JTextField jtfSigla = new JTextField(2);
    public JTextField jtfAtivo = new JTextField(1);
    
    public TelaCadastroEstado(){
        super("Cadastro de Estado");
        adicionaComponente(1,1,1,1,jlCodigo);
        adicionaComponente(1,2,1,1,jtfCodigo);
        adicionaComponente(2,1,1,1,jlNome);
        adicionaComponente(2,2,1,1,jtfNome);
        adicionaComponente(3,1,1,1,jlSigla);
        adicionaComponente(3,2,1,1,jtfSigla);
        adicionaComponente(4,1,1,1,jlAtivo);
        adicionaComponente(4,2,1,1,jtfAtivo);
        pack();
    }
}