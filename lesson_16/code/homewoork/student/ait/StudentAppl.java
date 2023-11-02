package homewoork.student.ait;

public class StudentAppl {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Andreas ", " Borger ", 1985, " Ati Student ");
        Student student2 = new Student(2, " Maxim ", " Schmid ", 1986, "Kaufmann ");
        Student student3 = new Student(3, " Rameta ", " Bakova ", 1985, " Konditor ");
        Student student4 = new Student(4, " Anatoli ", " Borger ", 1993, " Industrie mechaniker");
        Student student5 = new Student(5, " Umar ", " Bakov ", 1993, "Anlagen michaniker ");

        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();

        System.out.println("==================================");

        student1.erhältEinStipendium();
        student2.legtPrüfungenab();
        student3.machtUrlaub();
        student4.studiren();
        student5.erhältEinStipendium();
    }
}
