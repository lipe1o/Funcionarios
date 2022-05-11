package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Gerentes extends Funcionarios {
        
    private String login;
    private String senha;
    private String ramal;
        
        public void setLogin(String login){
            this.login=login;
        }
        public void setSenha(String senha){
            this.senha=senha;
        }
        public void setRamal(String ramal){
            this.ramal=ramal;
        }
        public String getLogin(){
            return this.login;
        }
        public String getSenha(){
            return this.senha;
        }
        public String getRamal(){
            return this.ramal;
        }
        
        public void adicionar( ){
            String sql = "INSERT INTO Empregados (nome, cpf, salario, departamento, horario )VALUES (?, ?, ?, ?, ?)";
            try{
            Connection con = conexao.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
        
            stmt.setString(1, this.getNome()); 
            stmt.setString(2, this.getCPF()); 
            stmt.setDouble(3, this.getSalario());
            stmt.setString(4, this.getDepartamento());
            stmt.setString(5, this.getHorario());
            stmt.execute();
            }catch(SQLException e){
            System.out.println("Erro no adicionar Produto:" + e.toString());
            }
        
        }
}
    