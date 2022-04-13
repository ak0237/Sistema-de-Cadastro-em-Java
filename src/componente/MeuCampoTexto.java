
package componente;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class MeuCampoTexto extends JTextField implements FocusListener, MeuComponente{
    public MeuCampoTexto(int colunas){
        setColumns(colunas);
        addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        setBackground(Color.gray);
    }

    @Override
    public void focusLost(FocusEvent e) {
        setBackground(Color.white);
    }

    @Override
    public boolean eVazio() {
        return getText().trim().isEmpty();
    }

    @Override
    public void limpar() {
        setText("");
    }
  
    @Override
    public void habilitar(boolean status) {
        setEnabled(status);
    }
    
}
