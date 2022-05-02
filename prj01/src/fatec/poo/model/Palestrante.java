package fatec.poo.model;

/**
 *
 * @author cassio
 */
public class Palestrante extends Pessoa{
    private String areaAtuacao;
    private double taxaCobranca;
    
    public Palestrante(String cpf, String nome, double taxaCobranca) {
        super(cpf, nome);
        this.taxaCobranca = taxaCobranca;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }
    
    public void listarPalestras(){
        System.out.println("Relação de Palestras Dadas");
        System.out.println("");
        System.out.println("CPF: " + getCpf());
        System.out.println("Nome: " + getNome());
        System.out.println("Área de Atuação: " + getAreaAtuacao());
        System.out.println("Taxa de Cobrança(%): " + taxaCobranca + "%");
        System.out.println("");

        System.out.println("Data Palestra       Tema        Valor Recebido");
        System.out.println(getPalestra().getData() + "      " + getPalestra().getTema() + "     " + getPalestra().getTotalArrecadado());
    }
    
//    DecimalFormat decimalFormat = new DecimalFormat("0.##");
//    System.out.println(decimalFormat.format(3.1000565));
    
    
    
//    float number = 123.123456F;
//    BigDecimal numberBigDecimal = new BigDecimal(number);
//    System.out.println(numberBigDecimal);
//    numberBigDecimal  = numberBigDecimal .setScale(2, BigDecimal.ROUND_HALF_UP);
//    System.out.println(numberBigDecimal);
}
