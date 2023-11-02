package practice.computers.model;

public class Laptop extends Computer{
    private String display;
    private int batteryCapasity;
    private double weight;

    public Laptop(String cpu, int ram, int hdd, String brand, String display, int batteryCapasity, double weight) {
        super(cpu, ram, hdd, brand);
        this.display = display;
        this.batteryCapasity = batteryCapasity;
        this.weight = weight;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getBatteryCapasity() {
        return batteryCapasity;
    }

    public void setBatteryCapasity(int batteryCapasity) {
        this.batteryCapasity = batteryCapasity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {

        return "Laptop{" +
                "display='" + display + '\'' +
                ", batteryCapasity=" + batteryCapasity +
                ", weight=" + weight +
                '}' +  super.toString() ;
    }

}
