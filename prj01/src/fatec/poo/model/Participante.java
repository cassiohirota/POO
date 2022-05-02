package fatec.poo.model;

/**
 *
 * @author cassio
 */
public class Participante extends Pessoa{
    private int tipo;
    private String escolaridade;

    public Participante(String cpf, String nome, int tipo) {
        super(cpf, nome);
        this.tipo = tipo;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public int getTipo() {
        return tipo;
    }  
    
    
}
