package week1.les1.opdracht4;

public class Main {

    public static void main(String[] arg) {
        Student student = new Student("Donny", "Zandstraat 32a", "Hulst");
        System.out.println(student.toString());
        student.setNaam("Don");
        System.out.println(student.toString());
    }
}
