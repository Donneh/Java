package week4.practicum1;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String MacAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        MacAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    public double huidigeWaarde() {
        int jaarOud = LocalDate.now().getYear() - productieJaar;
        double prijs = aanschafPrijs;
        for (int i = 0; i < jaarOud; i++) {
            prijs = (prijs / 100) * 60;
        }

        return prijs;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Computer) {
            Computer computer = (Computer) obj;
            return type.equals(computer.type) &&
                    MacAdres.equals(computer.MacAdres) &&
                    aanschafPrijs == computer.aanschafPrijs &&
                    productieJaar == computer.productieJaar;
        }
        return false;
    }

    public String toString() {
        return "Computer: " + type + " heeft een waarde van: €" + huidigeWaarde();
    }
}
