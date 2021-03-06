package fatec.poo.model;

/**
 *
 * @author cassio
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private String telefone;
    private Palestra palestra;


    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Palestra getPalestra() {
        return palestra;
    }

    public void setPalestra(Palestra palestra) {
        this.palestra = palestra;
    }
    
    
}
