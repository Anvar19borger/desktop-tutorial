package homework.cube;

public class Cube {
    private double side;

    // Konstruktor dla sosdanija cuba s sadonnoi staranoi
    public Cube(double side) {
        this.side = side;
    }

    // Gettari i settari
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //Metod dlja vicheslennija  perimetra sumi dlini vsech staron
    public double calculatePerimeter() {
        return 12 * side;
    }

    //  Metod dlja vicheslennija  ploschadi sumi ploschadei vsech granii
    public double calculateSurfaceArea() {
        return 6 * side * side;
    }

    //  Metod dlja vicheslenija obema
    public double calculateVolume() {
        return side * side * side;
    }
}





