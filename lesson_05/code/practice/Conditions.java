package practice;

public class Conditions {
    public static void main(String[] args) {

        int x = 0;

        if (x > 0) {
            System.out.println("x - polojitelnoe");


        } else if (x == 0) {
            System.out.println("x = 0");
        } else {

            System.out.println(" x - otricatelnnoe");

        }

        // chotnoe ne chotnoe
        int y = 16;
        if (y % 2 == 0) {
            System.out.println("Chislo: " + y + " - chotnoe");
        } else {
            System.out.println(" Chislo : " + y + "- ne chotnoe");
        }
        System.out.println("=============================");

        int age = 18;
        if (age >= 18){
            System.out.println("Wam rasreschino deistvovat samostojatelnno");
        }else {
            System.out.println("Wam nujno preiti s vaschim opikunom");
        }
    }
}