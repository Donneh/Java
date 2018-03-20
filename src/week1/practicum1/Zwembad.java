package week1.practicum1;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad() {

    }

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public String toString() {
        return "Het zwembad is " + breedte + " breed, "
                + lengte + " lang, " + diepte + " diep en de inhoud is " + inhoud() + ".";
    }
}