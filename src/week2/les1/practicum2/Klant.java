package week2.les1.practicum2;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        naam = nm;
    }

    public void setKorting(double korting) {
        kortingsPercentage = korting;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        return  naam + " (korting: " + kortingsPercentage + "%)";
    }
}
