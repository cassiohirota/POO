package fatec.poo.model;

public class ListaNumeros {
    private double[] matNum = new double[5];
    private int qtdeElem;
    private int indice = 0;

    public ListaNumeros(int qtdeElem) {
        this.qtdeElem = qtdeElem;
    }

    public double[] getMatNum() {
        return matNum;
    }

    public int getQtdeElem() {
        return qtdeElem;
    }

    public void insereNumero(double num){
        for (indice = 0; indice < qtdeElem; indice++){
            matNum[indice] = num;
        }
    }

    public double calcSomatoria(){
        double soma = 0;
        
        for (indice = 0; indice < qtdeElem; indice++){
            soma += matNum[indice];
        }
        return soma;
    }
    /*    
    public double calcMedia(){
        
    }
    
    public double pesqMaior(){
        
    }
    
    public double pesqMenor(){
        
    }
    */
}
