package homewoork.model;

public class Cat extends Pet1 {

    private String breed;
    private double height;
    private double weight;

    public Cat(int id, String vid, int ege, String name) {
        super(id, vid, ege, name);
    }

    public Cat(int id, String vid, int ege, String name, String breed, double height, double weight) {
        super(id, vid, ege, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void voice(){
        System.out.println("Mjau ...mauuu !");
    }
}
