
package bd;

import java.sql.*;
import javax.swing.JOptionPane;

public class BancoDados {
    private static Connection conexao; 
    
    public static Connection getConexao(){
        try{
            if(conexao == null){
                Class.forName("org.firebirdsql.jdbc.FBDriver");
                conexao = DriverManager.getConnection(
                        "jdbc:firebirdsql://localhost/" +
                        System.getProperty("user.dir") + //   C:/
                        "/BANCO.FDB", "SYSDBA", "123456"
                );
            }
            return conexao;
        }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Não foi possível encontrar o driver de acesso ao banco de dados");
            return null;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível conectar-se com o banco de dados");
            return null;
        }
    }
}
