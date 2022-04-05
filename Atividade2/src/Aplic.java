
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;

public class Aplic {

    public static void main(String[] args) {
        PessoaFisica pesFis = new PessoaFisica("12345678910", "Antonio Fernando", 2019);
        PessoaJuridica pesJud = new PessoaJuridica("14.322.312/0001-34", "Julio Almeida", 2020);
    
        pesFis.setBase(1000);
        pesFis.addCompras(10000);        
        System.out.println("CPF = " + pesFis.getCpf());
        System.out.println("Nome = " + pesFis.getNome());
        System.out.println("Ano de Inscrição = " + pesFis.getAnoInscricao());
        System.out.println("Base = " + pesFis.getBase());
        System.out.println("Total Compras = R$" + pesFis.getTotalCompras());
        System.out.println("Valor Bônus = R$" + pesFis.calcBonus(2022));
        
        System.out.println("");
        
        pesJud.setTaxaIncentivo(10);        
        pesJud.addCompras(1200);        
        System.out.println("CGC = " + pesJud.getCgc());
        System.out.println("Nome = " + pesJud.getNome());
        System.out.println("Ano de Inscrição = " + pesJud.getAnoInscricao());
        System.out.println("Taxa de Incentivo = " + pesJud.getTaxaIncentivo() + "%");
        System.out.println("Total Compras = R$" + pesJud.getTotalCompras());
        System.out.println("Valor Bônus = R$" + pesJud.calcBonus(2022));
        
    }
    
}
