package week2.les1.practicum3;

import java.util.ArrayList;

public class Klas {

    private String KlasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<Leerling>();

    public Klas(String kc) {
        KlasCode = kc;
    }

    public void voegLeerlingToe(Leerling l) {
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double newCijfer) {
        for (Leerling leerling : deLeerlingen) {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(newCijfer);
            }
        }
    }

    public ArrayList getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        return 5;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("In klas " + KlasCode + " zitten de volgende leerlingen:");
        for (Leerling leerling : deLeerlingen) {
            s.append("\n").append(leerling);
        }

        return s.toString();
    }
}
