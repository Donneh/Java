package week1.practicum2;

public class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam) {
        this.naam = naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen += 1;
        }
        if(ch == 'g') {
            aantalGelijk += 1;
        }
        if(ch == 'v') {
            aantalVerloren += 1;
        }
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public String toString() {
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
