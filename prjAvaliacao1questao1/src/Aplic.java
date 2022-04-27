
import fatec.poo.model.Cliente;
import java.util.Scanner;

/**
 *
 * @author 0030482021033
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o Código do Cliente: ");
        System.out.println("Digite o número de Telefone: ");
        Cliente cli = new Cliente(entrada.nextLine(), entrada.nextLine());

        
        System.out.println("Digite o limite de crédito: ");
        cli.setLimCred(entrada.nextDouble());
        
        System.out.println("");
        System.out.println("Código do Cliente: " + cli.getCodigo());
        System.out.println("Numero de Telefone: " + cli.getNumTel());
        System.out.println("Limite de Crédito: R$" + cli.getLimCred());

    }
    
}
