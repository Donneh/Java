package week1.les1.opdracht4;

public class Student {
    private String naam;
    private String adres;
    private String plaats;

    public Student(String naam, String adres, String plaats) {
        this.naam = naam;
        this.adres = adres;
        this.plaats = plaats;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public String toString() {
        String s = naam + " woont op " + adres +  " in " + plaats;
        return s;
    }
}