package practice.beverage.model;

public class Beer extends Beverage {

    private String type; //tip piva

    // konstruktor
    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public void toBuy(String title, String packing, int quantity, String type) {
        super.toBuy(title, packing, quantity);
        this.type = type;
    }

    public void displayStock() {
        super.displayStock();
        System.out.println("Etot  " + type + " is Beer");
    }
// pustoi kanstruktor
    public Beer() {
    }

    // getori i setori
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
