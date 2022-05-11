package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    public static String servidor = "127.0.0.1:3306";
    public static String usuario = "root";
    public static String senha="";
    public static String nome_banco = "Funcionarios";  
    
        public static Connection conexao(){
            Connection conexao = null; 
        
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conexao= DriverManager.getConnection("jdbc:mysql://"+servidor+"/"+nome_banco+"?useTimezone=true&serverTimezone=UTC", usuario, senha);
            }catch (SQLException e){
                System.out.println("Erro concexao"+ e.toString());
            }catch(ClassNotFoundException e){
                System.out.println("Classe não Encontrada:" + e.toString());
            }
        
        
        
        return conexao;
        } 
}
