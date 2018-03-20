package week4.practicum1;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Voertuig) {
            Voertuig voertuig = (Voertuig) obj;
            return type.equals(voertuig.type) && nieuwprijs == voertuig.nieuwprijs && bouwjaar == voertuig.bouwjaar;
        }
        return false;
    }

    public String toString() {
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waaarde van: €" + huidigeWaarde();
    }
}
