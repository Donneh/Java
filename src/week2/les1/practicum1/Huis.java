package week2.les1.practicum1;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr) {
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb) {
        huisbaas = hb;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public String toString() {
        String s = "Huis " + adres + "is gebouwd in " + bouwjaar;
        if(huisbaas != null) {
            s+= " en heeft huisbaas " + huisbaas;
        }

        return s;
    }
}
