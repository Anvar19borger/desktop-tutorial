package computer.practice.comp.model;

public class Laptop12 extends Computer {

    private double hours;
    private double weight;

    public Laptop12(String cpu, int ram, int ssd, String brand, double hours, double weight) {
        super(cpu, ram, ssd, brand);
        this.hours = hours;
        this.weight = weight;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String toString(){
        return super.toString() + " Hours : " + hours + " Weeight : " + weight;
    }

}
