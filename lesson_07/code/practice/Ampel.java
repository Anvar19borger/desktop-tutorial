package practice;
//Задание 2. Напишите программу для машины на светофоре.
// Что нужно делать, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.


import java.util.Scanner;

public class Ampel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the color? ( Red, Yellow, Green): ");


        String color = scanner.next();// sadajem perimmenuju strokova tipa Strrring


        switch (color) {
            case "Red" -> System.out.println("Stop , wait ! ");
            case "Yellow " -> System.out.println("Be ready to go.");
            case "Green" -> System.out.println("You can go! ");
            default -> System.out.println("Wrong input ! ");

        }


    }
}
