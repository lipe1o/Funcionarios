package classes;

abstract class Funcionarios {
    private String nome;
    private String cpf;
    private double salario;
    private String departamento;
    private String horario;
    
    public void bonificacao(double bonificacao){
        this.salario=bonificacao+salario;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCPF(String cpf){
        this.cpf=cpf;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.cpf;
    }
    public double getSalario(){
        return this.salario;
    }
    public String getDepartamento(){
        return this.departamento;
    }
    public String getHorario(){
        return this.horario;
    }
    
    
}
