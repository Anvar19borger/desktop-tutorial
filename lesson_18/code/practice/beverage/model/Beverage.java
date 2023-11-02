package practice.beverage.model;

public class Beverage {
    // fields
    private String title;// naimenovanie
    private String packing;// Vid upakovki
    private int quantity;// kol upokovki


    // kanstruckter


    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }
// pustoi konstrucktor
    public Beverage() {
    }
    // getori i setori

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // metod dlja pokupki
    public void toBuy(String title, String packing, int quantity) {
        // swjasivaem tekuschi obekt s metodom
        //  this.packing = packing;
        //this.title = title;
        //this.quantity = quantity;
        System.out.println("Idi v magasin i kupi : " + title + " " + packing + " " + quantity + ".");
    }

    //metod dlja proverki togo, chto ostalos na sklade
    public void displayStock() {
        System.out.println("U nas ostalos : " + title + " " + packing + " " + quantity + ".");
    }

}
