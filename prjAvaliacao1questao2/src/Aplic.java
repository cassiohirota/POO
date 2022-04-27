
import fatec.poo.model.Cliente;
import fatec.poo.model.Garcom;

/**
 *
 * @author 0030482021033
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Garcom gar = new Garcom(123, "Marcos Silva", 10);
        gar.setSalBase(1000);


        Cliente cli1 = new Cliente(1, "Luiz", 10);
        Cliente cli2 = new Cliente(2, "Maria", 25);
        cli1.addValorComanda(100);
        cli1.addValorComanda(100);
        cli2.addValorComanda(100);
        cli2.addValorComanda(100);

        gar.addGorgeta(cli1.getTotalConta());
        gar.addGorgeta(cli2.getTotalConta());
        
        
        System.out.println("- Garçom -");
        System.out.println("Código: " + gar.getCodigo());
        System.out.println("Nome: " + gar.getNome());
        System.out.println("Salário Base: R$" + gar.getSalBase());
        System.out.println("Taxa de Serviço: " + gar.getTaxaServico() + "%");
        System.out.println("Gorgeta Total: R$" + gar.getTotalGorgeta());
        System.out.println("Salário Final: R$" + gar.calcSalarioFinal());
        System.out.println("--------------------------------");

        System.out.println("- Cliente 1 -");
        System.out.println("Código: " + cli1.getCodigo());
        System.out.println("Número da Mesa: " + cli1.getNumMesa());    
        System.out.println("Total da Conta: R$" + cli1.getTotalConta());
        System.out.println("--------------------------------");
        
        System.out.println("- Cliente 2 -");        
        System.out.println("Código: " + cli2.getCodigo());
        System.out.println("Nome: " + cli2.getNome());    
        System.out.println("Número da Mesa: " + cli2.getNumMesa());    
        System.out.println("Total da Conta: R$" + cli2.getTotalConta());
        System.out.println("");    
    }

}
