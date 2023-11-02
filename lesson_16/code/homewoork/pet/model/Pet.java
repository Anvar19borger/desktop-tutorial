package homewoork.pet.model;

public class Pet {
    private int id;
    private String vid;
    private int ege;
    private String name;


    //Kanstruktar klassa Pet
    public Pet(int id, String vid, int ege, String name) {
        this.id = id;
        this.vid = vid;
        this.ege = ege;
        this.name = name;

    }
// Geteri i Setari
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// Metod pechati
    public void display() {
        System.out.println("Id: " + id + " Vid: " + vid + " Ege : " + ege + " Name: " + name);
    }

    public void sleep() {
        System.out.println(" Pet is sleeping! ");
    }

    public void eat() {
        System.out.println(" Pet is eating ! ");

    }

    public void makeAsound() {
        System.out.println(" Gave a voice! ");
    }

    public void play() {
        System.out.println(this.name + " Pet is play! ");
    }

    public void walk() {
        System.out.println(" Pet is walk! ");
    }

}
