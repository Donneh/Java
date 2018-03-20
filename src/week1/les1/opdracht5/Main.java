package week1.les1.opdracht5;

public class Main {

    public static void main(String[] arg) {
        Student student = new Student("Donny");
        student.setStudentNr(1337);
        System.out.println(student.toString());
        student.setNaam("Don");
        System.out.println(student.toString());
    }
}
