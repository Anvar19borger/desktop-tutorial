package homewoork.student.ait;

public class Student {
    private int id;
    private String vorname;
    private String name;
    private int geboren;
    private String beruf;

    public Student(int id, String vorname, String name, int geboren, String beruf) {
        this.id = id;
        this.vorname = vorname;
        this.name = name;
        this.geboren = geboren;
        this.beruf = beruf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeboren() {
        return geboren;
    }

    public void setGeboren(int geboren) {
        this.geboren = geboren;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }
    public void display(){
        System.out.println("Id : " + id + " Vorname : " + vorname + " Name : " + name + " Geburtstag : " + geboren + " Beruf : " + beruf);
    }
    public void studiren(){
        System.out.println(" Student studiren! ");
    }
    public void machtUrlaub(){
        System.out.println(" Student macht Urlaub! ");
    }
    public void legtPrüfungenab(){
        System.out.println(" Student legt Prüfungen ab!");
    }
    public  void erhältEinStipendium(){
        System.out.println(" Student erhält ein Stipendium! ");
    }
    public void erledigtPraktischeAufgaben(){
        System.out.println("Studdent , erledigt praktische Aufgaben! ");
    }
}
