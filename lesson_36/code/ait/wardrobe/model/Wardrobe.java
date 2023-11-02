package ait.wardrobe.model;

public class Wardrobe  implements Comparable<Wardrobe>{
    double heigth;
    double width;
    double depth;

    public Wardrobe(double heigth, double width, double depth) {
        this.heigth = heigth;
        this.width = width;
        this.depth = depth;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
    public double area(){
        return width * depth;
    }
    public double volume(){
        return area() * heigth;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Wardrobe wardrobe = (Wardrobe) object;

        if (Double.compare(heigth, wardrobe.heigth) != 0) return false;
        if (Double.compare(width, wardrobe.width) != 0) return false;
        return Double.compare(depth, wardrobe.depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(heigth);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "heigth=" + heigth +
                ", width=" + width +
                ", depth=" + depth +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }

    @Override
    public int compareTo(Wardrobe o) {
        return Double.compare(heigth, o.heigth);
    }

}
