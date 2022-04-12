package fatec.poo.model;

public class Nota {
    private int ra;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;       
    private double NtTrab2;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNtPrv1() {
        return NtPrv1;
    }

    public void setNtPrv1(double NtPrv1) {
        this.NtPrv1 = NtPrv1;
    }

    public double getNtPrv2() {
        return NtPrv2;
    }

    public void setNtPrv2(double NtPrv2) {
        this.NtPrv2 = NtPrv2;
    }

    public double getNtTrab1() {
        return NtTrab1;
    }

    public void setNtTrab1(double NtTrab1) {
        this.NtTrab1 = NtTrab1;
    }

    public double getNtTrab2() {
        return NtTrab2;
    }
    
    public void setNtTrab2(double NtTrab2) {
        this.NtTrab2 = NtTrab2;
    }
    
    public double calcMediaProva(){
        return (0.75 * ((NtPrv1 + 2 * NtPrv2)/3));
    }
    
    public double calcMediaTrab(){
        return (0.25 * ((NtTrab1 + NtTrab2)/2));
    }
    
    public double calcMediaFinal(){
        return (calcMediaProva() + calcMediaTrab());
    }
}
