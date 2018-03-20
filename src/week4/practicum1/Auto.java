package week4.practicum1;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde() {
        int jaarOud = LocalDate.now().getYear() - bouwjaar;
        double prijs = nieuwprijs;
        for (int i = 0; i < jaarOud; i++) {
            prijs = (prijs / 100) * 70;
        }

        return prijs;
    }

    public boolean equals(Object obj) {
        if (obj instanceof  Auto) {
            Auto auto = (Auto)obj;
            return auto.kenteken.equals(kenteken) && super.equals(auto);
        }
        return false;
    }
}
