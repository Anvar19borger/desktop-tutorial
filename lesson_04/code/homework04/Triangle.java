package homework04;

public class Triangle {
    public static void main(String[] args) {
        //   Задача 2. Написать приложение, которое вычисляет площадь треугольника по его основанию и высоте.
        // S = 1/2 ( a * g). S = area of a triangle

        double a = 9;
        double g = 10;
        System.out.println("Triangle Squere : " + triangleSquere(a, g));


    }

    public static double triangleSquere(double a, double g) {
        return a * g / 2;


    }

    }


