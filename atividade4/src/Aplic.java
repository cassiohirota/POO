
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Instrutor pesInstr = new Instrutor(12345, "Joao", "23435435");
        Cliente pesCli = new Cliente("232435435234", "Felipe", "43245354");
        
        System.out.println("Digite a área de atuação: ");
        pesInstr.setAreaAtuacao(entrada.next());
        
        System.out.println("Identificação: " + pesInstr.getIdentificacao());
        System.out.println("Nome: " + pesInstr.getNome());
        System.out.println("Telefone: " + pesInstr.getTelefone());
        System.out.println("Area de Atuação: " + pesInstr.getAreaAtuacao());
        
        System.out.println("");
        
        
        System.out.println("Digite a altura: ");
        pesCli.setAltura(entrada.nextDouble());
        System.out.println("Digite o peso: ");
        pesCli.setPeso(entrada.nextDouble());
        
        System.out.println("CPF: " + pesCli.getCpf());
        System.out.println("Nome: " + pesCli.getNome());
        System.out.println("Telefone: " + pesCli.getTelefone());
        System.out.println("Altura: " + pesCli.getAltura() + "m");
        System.out.println("Peso: " + pesCli.getPeso() + "kg");
    }
    
}
