package week1.les2.opdracht1;

public class Piloot {

    private String naam;
    private double salaris;
    private int vlieguren;

    public Piloot(String naam) {
        this.naam = naam;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public int getVliegUren() {
        return vlieguren;
    }

    public void verhoogVliegurenMet(int uren) {
        this.vlieguren += uren;
    }

    public String toString() {
        return naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
    }
}
