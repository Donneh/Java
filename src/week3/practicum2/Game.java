package week3.practicum2;

import java.time.LocalDate;

public class Game {

    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rj, double nwpr) {
        naam = nm;
        releaseJaar = rj;
        nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int huidigJaar = LocalDate.now().getYear() - 2;
        int jarenOud = huidigJaar - releaseJaar;

        return nieuwprijs * Math.pow(0.7, jarenOud);

    }

    @Override
    public boolean equals(Object andereObject) {
        if (andereObject instanceof Game) {
            Game game = (Game) andereObject;
            if(this.naam.equals(game.naam) &&
                    this.releaseJaar == game.releaseJaar &&
                    this.nieuwprijs == game.nieuwprijs) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: " + nieuwprijs + " nu voor: " + huidigeWaarde();
    }


}
