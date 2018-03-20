package week1.practicum2;

public class Main {
    public static void main(String[] args) {
        Voetbalclub ajax = new Voetbalclub("Ajax");
        System.out.println(ajax);
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        System.out.println(feij);
    }
}
