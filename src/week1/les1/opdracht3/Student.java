package week1.les1.opdracht3;

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

    public String getAdres() {
        return adres;
    }

    public String getPlaats() {
        return plaats;
    }

    public String toString() {
        String s = naam + " woont op " + adres +  " in " + plaats;
        return s;
    }
}