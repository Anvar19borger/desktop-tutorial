package practice.coffee;

public enum Coffee {
    ESP("Espresso", 3.25),AMR("Americano",3.85),CAP("Capuchino",4.50),LAT("Latte",4.85);
    private String type;
    private double price;

    Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
