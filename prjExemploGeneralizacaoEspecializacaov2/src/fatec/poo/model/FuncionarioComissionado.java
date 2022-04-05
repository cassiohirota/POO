package fatec.poo.model;


public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }
    
    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas(double valorVenda){
        totalVendas += valorVenda;
    }
    
    public double calcGratificacao(){
        if(totalVendas <= 5000)
            return 0;
        else if(totalVendas <= 10000)
            return (totalVendas * 0.03);
        else
            return(totalVendas * 0.05);
    }
    
    @Override
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto() + calcGratificacao());
    }
    
    @Override
    public double calcSalBruto() {
        return(salBase + ((taxaComissao/100) * totalVendas));
    }
}
