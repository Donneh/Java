package week2.les1.practicum2;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {

    }

    public void setAantalDagen(int ad) {
        aantalDagen = ad;
    }

    public void setGehuurdeAuto(Auto ga) {
        gehuurdeAuto = ga;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        double ppd = gehuurdeAuto == null ? 0 : gehuurdeAuto.getPrijsPerDag();
        double korting = huurder == null ? 0 : huurder.getKorting();
        return (ppd * aantalDagen) / 100 * (100 - korting);
    }

    public String toString() {
        String s = "";
        if(gehuurdeAuto == null) {
            s += "Er is geen auto bekend. ";
        } else {
            s+= gehuurdeAuto;
        }
        if(huurder == null) {
            s+= "Er is geen huurder bekend. ";
        } else {
            s += huurder;
        }
        s+= "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();

        return s;
    }

}
