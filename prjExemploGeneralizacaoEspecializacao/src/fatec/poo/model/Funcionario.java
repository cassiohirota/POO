package fatec.poo.model;

public abstract class Funcionario {

    private int registro;
    private String nome;
    private String dtadmissao;

    public Funcionario(int registro, String nome, String dtadmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtadmissao = dtadmissao;
    }
    
    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDtadmissao() {
        return dtadmissao;
    }


    public void setDtadmissao(String dtadmissao) {
        this.dtadmissao = dtadmissao;
    }
 
    //Método abstrato - apresenta apenas a assinatura. Caso use um método 
    //abstract, consequentemente deverá colocar a classe Funcionario como abstract também
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return (0.1 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto());
    }
        

}
