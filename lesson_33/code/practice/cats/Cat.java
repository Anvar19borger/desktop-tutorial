package practice.cats;

public class Cat implements Comparable<Cat>{
    private int id; // chip
    private String name; // klichka
    private String breed; //poroda
    private int age; // vosrast
    private double weight; // wes
    // Construktor

    public Cat(int id, String name, String breed, int age, double weight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    // get set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    // toString

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
    // hesch code

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Cat cat = (Cat) object;
        return id == cat.id;
    }

    @Override
    public int hashCode() {

        return id;
    }
    // etot metod posvoljaet provodit srawnenie obektov etogo klassa
    // on sravnivaet tekuschi obekt (this) s Cat o
    // i vosvraschat celoe chislo. Esli ono > 0 , to obekti menjajutsja mestami , v ostalnich sluchijach - ostavljaem kak est

    @Override
    public int compareTo(Cat o) {
        int res = this.age -o.age;// sravnili goda 2-h obektov - this i o
        return res;
    }
}
