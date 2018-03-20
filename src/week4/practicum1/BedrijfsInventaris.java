package week4.practicum1;

import java.util.ArrayList;

public class BedrijfsInventaris {

    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<Goed>();

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g) {
        Boolean owned = false;
        for (Goed goed : alleGoederen) {
            if(goed.equals(g)) {
                owned = true;
            }
        }
        if(!owned) {
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder(bedrijfsnaam + " met inventaris:").append(System.getProperty("line.separator"));

        for (Goed goed : alleGoederen) {
            s.append(goed).append(System.getProperty("line.separator"));
        }
        return s.toString();
    }
}
