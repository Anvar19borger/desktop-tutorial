package consultation.city;
///12313123
import java.util.Objects;

public class City implements Comparable<City> {
    // fields of class
    private String name;// nasvanie
    private int population;// nasilenie
    private String country;// strona
    private double index; //reitingg kakoito

    // constructor

    public City(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        City city = (City) object;

        if (!name.equals(city.name)) return false;
        return country.equals(city.country);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + country.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }

    // budim sortirovat po nasvaniju goroda po alfavitu
    @Override
    public int compareTo(City o) {
        int res = this.name.compareTo(o.name);
        if (res != 0) {
            return res;
        } else {
            res = Integer.compare(this.population, o.population);
            return res;//
        }
        //  return this.name.compareTo(o.name);// esli int > 0, to pri sartirovke obekti nado pominat mistammi int
    }
}
