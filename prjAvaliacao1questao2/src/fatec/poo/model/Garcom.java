package fatec.poo.model;

/**
 *
 * @author 0030482021033
 */
public class Garcom extends Pessoa{
    private double salBase;
    private double taxaServico;
    private double totalGorgeta;

    public Garcom(int codigo, String nome, double taxaServico) {
        super(codigo, nome);
        this.taxaServico = taxaServico;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }
    
    public double getSalBase() {
        return salBase;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public double getTotalGorgeta() {
        return totalGorgeta;
    }
    
    public void addGorgeta(double valor){
        totalGorgeta += (valor * (taxaServico/100));
    }
    
    public double calcSalarioFinal(){
        return salBase + totalGorgeta;
    }
}
