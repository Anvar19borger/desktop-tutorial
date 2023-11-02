package homework.cube;

public class CubeAppl {
    public static void main(String[] args) {
        //  Sosdaem classi Cube s rasnimi storonami
        Cube cube1 = new Cube(5.0);
        Cube cube2 = new Cube(3.0);

        // Vichesleennie perimetra , obema i ploschadi dlja kajdogo Cuba
        double perimeter1 = cube1.calculatePerimeter();
        double surfaceArea1 = cube1.calculateSurfaceArea();
        double volume1 = cube1.calculateVolume();

        double perimeter2 = cube2.calculatePerimeter();
        double surfaceArea2 = cube2.calculateSurfaceArea();
        double volume2 = cube2.calculateVolume();

        // Vivod resultata
        System.out.println("Cube 1: ");
        System.out.println("Perimeter: " + perimeter1);
        System.out.println("Square: " + surfaceArea1);
        System.out.println("Volumen: " + volume1);

        System.out.println("\nCube 2:");
        System.out.println("Perimeter: " + perimeter2);
        System.out.println("Square: " + surfaceArea2);
        System.out.println("Volumen: " + volume2);
    }
}
