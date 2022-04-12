
import fatec.poo.model.ListaNumeros;
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int i, op;
        
        System.out.println("Digite o numero de elementos da Matriz: ");        
        ListaNumeros lisNum = new ListaNumeros(entrada.nextInt());
        for(i = 0; i < lisNum.getQtdeElem(); i++){
            System.out.print("Digite os valores da produto: ");
            lisNum.insereNumero(entrada.nextDouble());
        }
        
        do{
        System.out.println("");        

        System.out.println("1 - Exibir a Somatória");
        System.out.println("2 - Exibir a Média");        
        System.out.println("3 - Exibir Maior Valor");        
        System.out.println("4 - Exibir Menor Valor");        
        System.out.println("5 - Exibir Lista");        
        System.out.println("6 - Sair");        
        System.out.println("");        
        System.out.println("Digite a opção: ");        
        op = entrada.nextInt();
        
        switch(op){
        
            case 1: System.out.println("Soma da Matriz = " + lisNum.calcSomatoria());
                    break;
            case 5: for(i = 0; i < lisNum.getQtdeElem(); i++){
                        System.out.println("Valor = " + lisNum.getMatNum());
                    }
                    break;
        }
        }while(op < 6);
    }
    
}
