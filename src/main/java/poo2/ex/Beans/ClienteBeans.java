
package poo2.ex.Beans;

public class ClienteBeans {
    
    private String Nome;
    private String TipoLogradouro;
    private String Logradouro;
    private int NumLogradouro;
    private String TelResidencial;
    private String TelComercial;
    private String TelCelular;
    private String CPF;
    private String RG;
    private String Profissao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTipoLogradouro() {
        return TipoLogradouro;
    }

    public void setTipoLogradouro(String TipoLogradouro) {
        this.TipoLogradouro = TipoLogradouro;
    }


    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public int getNumLogradouro() {
        return NumLogradouro;
    }

    public void setNumLogradouro(int NumLogradouro) {
        this.NumLogradouro = NumLogradouro;
    }

    public String getTelResidencial() {
        return TelResidencial;
    }

    public void setTelResidencial(String TelResidencial) {
        this.TelResidencial = TelResidencial;
    }

    public String getTelComercial() {
        return TelComercial;
    }

    public void setTelComercial(String TelComercial) {
        this.TelComercial = TelComercial;
    }

    public String getTelCelular() {
        return TelCelular;
    }

    public void setTelCelular(String TelCelular) {
        this.TelCelular = TelCelular;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getProfissao() {
        return Profissao;
    }

    public void setProfissao(String Profissao) {
        this.Profissao = Profissao;
    }
  
    public void informacoesCliente(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("TipoLogradouro: " + this.getTipoLogradouro());
        System.out.println("Logradouro: " + this.getLogradouro());
        System.out.println("NumLogradouro: " + this.getNumLogradouro());
        System.out.println("Telefone Residencial: " + this.getTelResidencial());
        System.out.println("Telefone Comercial: " + this.getTelComercial());
        System.out.println("Telefone Celular: " + this.getTelCelular());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("RG: " + this.getRG());
        System.out.println("Profissão: " + this.getProfissao());
    }
            
        
}
