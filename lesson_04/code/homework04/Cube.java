package homework04;

public class Cube {
    public static void main(String[] args) {
        // Задача 1. Написать приложение, которое вычисляет объем куба по длине его ребра и площадь его поверхности.
        // V = a * a * a, a =side of cube

        int a = 8;
        System.out.println("Cube Volume: " + cubeVolume(a));
        System.out.println("Cube Square: " + cubeSquare(a));

    }
    public static double cubeVolume(double a){
        return Math.pow(a,3);
    }
    public static  double cubeSquare(double a){
        return Math.pow(a,2)*6;
    }

}
