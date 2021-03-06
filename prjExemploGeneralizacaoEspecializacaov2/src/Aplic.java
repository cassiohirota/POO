
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

public class Aplic {


    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.50);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(1011, "Ana Beatriz", "22/10/2020", 600.0);
        FuncionarioComissionado funcCom = new FuncionarioComissionado(1012, "Joao Pedro", "11/05/2021", 25);
        
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Auxiliar Administrativo");
        System.out.println("Registro = " + funcHor.getRegistro());
        System.out.println("Nome = " + funcHor.getNome());
        System.out.println("Data de Admissão = " + funcHor.getDtAdmissao());
        System.out.println("Cargo = " + funcHor.getCargo());
        System.out.println("Salário Bruto = R$" + funcHor.calcSalBruto());
        System.out.println("Desconto = R$" + funcHor.calcDesconto());        
        System.out.println("Gratificação = R$" + funcHor.calcGratificacao());
        System.out.println("Salário Líquido = R$" + funcHor.calcSalLiquido());
        
        System.out.println("  ");
        
        funcMen.setNumSalMin(5);
        funcMen.setCargo("Programador");
        System.out.println("Registro = " + funcMen.getRegistro());
        System.out.println("Registro = " + funcMen.getNome());
        System.out.println("Data de Admissão = " + funcMen.getDtAdmissao());
        System.out.println("Cargo = " + funcMen.getCargo());
        System.out.println("Salário Bruto = R$" + funcMen.calcSalBruto());
        System.out.println("Desconto = R$" + funcMen.calcDesconto());
        System.out.println("Salário Líquido = R$" + funcMen.calcSalLiquido());
        
        System.out.println("  ");
        
        funcCom.setCargo("Vendedor");
        funcCom.setSalBase(2000);
        funcCom.addVendas(10000);
        System.out.println("Registro = " + funcCom.getRegistro());
        System.out.println("Registro = " + funcCom.getNome());
        System.out.println("Data de Admissão = " + funcCom.getDtAdmissao());
        System.out.println("Cargo = " + funcCom.getCargo());
        System.out.println("Salário Base = R$" + funcCom.getSalBase());
        System.out.println("Taxa de Comissão = " + funcCom.getTaxaComissao() + "%");
        System.out.println("Total Vendas = R$" + funcCom.getTotalVendas());
        System.out.println("Salário Bruto = R$" + funcCom.calcSalBruto());
        System.out.println("Desconto = R$" + funcCom.calcDesconto());
        System.out.println("Gratificação = R$ " + funcCom.calcGratificacao());
        System.out.println("Salário Líquido = R$" + funcCom.calcSalLiquido());
    }
    
}
