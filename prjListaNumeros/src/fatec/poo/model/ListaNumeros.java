package fatec.poo.model;

public class ListaNumeros {
    private double[] matNum = new double[10];
    private int qtdeElem;
    private int indice;

    public ListaNumeros(int qtdeElem) {
        this.qtdeElem = qtdeElem;
    }

    public double[] getMatNum() {
        return matNum;
    }

    public int getQtdeElem() {
        return qtdeElem;
    }

    
    
    
}
