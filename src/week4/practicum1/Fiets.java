package week4.practicum1;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;


    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        int jaarOud = LocalDate.now().getYear() - bouwjaar;
        double prijs = nieuwprijs;
        for (int i = 0; i < jaarOud; i++) {
            prijs = (prijs / 100) * 900;
        }

        return prijs;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Fiets) {
            Fiets fiets = (Fiets) obj;
            return fiets.framenummer == framenummer && super.equals(fiets);
        }
        return false;
    }
}
