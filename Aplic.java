
import fatec.poo.model.Nota;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Nota nota = new Nota();
        
        int ra, op;
        double prv1, prv2, trab1, trab2;
        
        System.out.println("Digite seu RA: ");
        ra = entrada.nextInt();
        System.out.println("Digite a nota da 1ª Prova:");
        prv1 = entrada.nextDouble();
        System.out.println("Digite a nota da 2ª Prova:");
        prv2 = entrada.nextDouble();
        System.out.println("Digite a nota do 1ª Trabalho:");
        trab1 = entrada.nextDouble();
        System.out.println("Digite a nota da 2ª Trabalho:");
        trab2 = entrada.nextDouble();

/*
        * Essa codigo permite reduzir o código e evitar de criar variáveis.
        System.out.println("Digite seu RA: ");
        nota.setRa(entrada.nextInt());
*/
        nota.setRa(ra);
        nota.setNtPrv1(prv1);
        nota.setNtPrv2(prv2);
        nota.setNtTrab1(trab1);
        nota.setNtTrab2(trab2);
        
        do{
            System.out.println("Escolha uma das opções:");
            System.out.println("\n 1 - Media Prova");
            System.out.println("\n 2 - Media Trabalho");
            System.out.println("\n 3 - Media Final");
            op = entrada.nextInt();

            switch(op){
                case 1 : System.out.println("RA: " + ra + " - Media da Prova: " + nota.calcMediaProva());
                break;
                case 2 : System.out.println("RA: " + ra + " - Media da Prova: " + nota.calcMediaTrab());
                break;
                case 3 : System.out.println("RA: " + ra + " - Media da Prova: " + nota.calcMediaFinal());
                break;
            }
        }while(op < 4);
    }
    
}
