package fatec.poo.model;

/**
 *
 * @author cassio
 */
 public class Palestra {
    private String data;
    private String tema;
    private String local;
    private double valor;
    private double totalArrecadado;
    private Palestrante palestrante;
    
    public Palestra(String data, String tema) {
        this.data = data;
        this.tema = tema;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public String getTema() {
        return tema;
    }

    public String getLocal() {
        return local;
    }

    public double getValor() {
        return valor;
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
    
    
    public void emitirListaParticipantes(){
        System.out.println("Relação de Palestras Dadas");
        System.out.println("");
        System.out.println("CPF: " + getPalestrante().getCpf());
        System.out.println("Nome: " + getPalestrante().getNome());
        System.out.println("Área de Atuação: " + getPalestrante().getAreaAtuacao());
        System.out.println("Taxa de Cobrança(%): " + getPalestrante().getTaxaCobranca());
        System.out.println("");

        System.out.println("Data Palestra       Tema        Valor Recebido");
        System.out.println(data + "  " + tema + "  " + totalArrecadado);
    }


}
