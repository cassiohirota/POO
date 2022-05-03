
package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; // implementando a multiplicidade de 1*
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[10];
        numFunc = 0;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc++;
    }
    
    public void listarFuncionarios(){

            
        System.out.println("");
        System.out.println("Sigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("------------------------------");
        for(int i = 0; i < numFunc; i++){
            System.out.println("Registro\tNome\t\tCargo");
            System.out.println(funcionarios[i].getRegistro() + "\t\t" + 
            funcionarios[i].getNome() + "\t" + funcionarios[i].getCargo());
        }
    }
}
