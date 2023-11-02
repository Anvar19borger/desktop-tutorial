package variables;

public class HW03 {
    public static void main(String[] args) {

        /*  Метод вычисляющий площадь круга;
         Метод вычисляющий площадь квадрата;
         Метод вычисляющий площадь прямоугольника (чуть сложнее чем 1. и 2.);
           В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.
         сторона - side
        площадь - area
        круг - circle
         квадрат - square
        прямоугольник - rectangle
        площадь круга - circle are
        площадь квадрата - square area
        */
        System.out.println("CircleLength: " + circleLength(60));
        System.out.println("SquareArea: " + squareArea(3));
        System.out.println("Rectangle: " + rectangle(6,9));
    }

    public static double circleLength(double radius) {
        double g = 2 * Pi() * radius;
        return g;

    }

    public static double Pi() {
        double pi = 3.1415926;
        return pi;
    }

    public static int squareArea(int side) {
        int a = side * side;
        return a;

    }
    public static double rectangle(double sideA, double sideB){
        double l = sideA * sideB;
        return l;
    }


}
