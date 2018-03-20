package week1.les1.zelfstudie6;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nr) {
        nummer = nr;
    }

    public int getNummer() {
        return nummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void stort(double bedrag) {
        if(bedrag > 0) {
            saldo = saldo + bedrag;
        } else {
            System.out.println("Kan alleen positieve bedragen storten.");
        }
    }

    public void neemOp(double bedrag) {
        if(bedrag > 0 && this.saldo > bedrag) {
            saldo = saldo - bedrag;
        } else {
            System.out.println("Negatief getal of je bent te skeer.");
        }
    }

    public String toString() {
        String s = "Op rekening " + nummer + " staat " + saldo;
        return s;
    }
}