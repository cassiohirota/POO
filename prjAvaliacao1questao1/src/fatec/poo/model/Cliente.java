package fatec.poo.model;

/**
 *
 * @author 0030482021033
 */
public class Cliente {
    private String codigo;
    private String numTel;
    private double limCred;

    public Cliente(String codigo, String numTel) {
        this.codigo = codigo;
        this.numTel = numTel;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNumTel() {
        return numTel;
    }

    public double getLimCred() {
        return limCred;
    }

    public void setLimCred(double limCred) {
        this.limCred = limCred;
    } 
}
