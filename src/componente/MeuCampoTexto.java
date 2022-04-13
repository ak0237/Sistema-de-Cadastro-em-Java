
package componente;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

public class MeuCampoTexto extends JTextField implements FocusListener{
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
    
}
