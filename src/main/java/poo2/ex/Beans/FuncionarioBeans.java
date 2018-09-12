package poo2.ex.Beans;

public class FuncionarioBeans {
    private String Nome;
    private String Sobrenome;
    private String Cargo;
    private int Salario;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
    public void informacoesFunc(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sobrenome: " + this.getSobrenome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salario: " + this.getSalario());
    } 
}
