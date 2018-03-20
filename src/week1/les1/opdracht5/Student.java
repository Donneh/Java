package week1.les1.opdracht5;

public class Student {
    private String naam;
    private int studentNr;

    public Student(String nm) {
        this.naam = nm;
    }

    public Student(String nm, int studentNr) {
        this.naam = nm;
        this.studentNr = studentNr;
    }

    public void setStudentNr(int studentNr) {
        this.studentNr = studentNr;
    }

    public int getStudentNr() {
        return studentNr;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String toString() {
        String s = "Deze student heet " + naam;
        return s;
    }
}