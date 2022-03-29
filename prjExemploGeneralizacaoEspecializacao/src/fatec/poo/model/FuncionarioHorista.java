package fatec.poo.model;

public class FuncionarioHorista extends Funcionario{
    
    private double valHorTrab; 
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro, String nome, String dtadmissao, double valHorTrab) {
        super(registro, nome, dtadmissao); // Chamada do metodo contrutor da superclasse.
        this.valHorTrab = valHorTrab;
    }
    
    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    @Override
    public double calcSalBruto() {
        return(valHorTrab * qtdeHorTrab);
    }


            
}
