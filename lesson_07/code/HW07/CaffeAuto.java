package HW07;

//Задача 1. Написать программу для "Кофе-машины", которая позволяет пользователю выбрать напиток:
//
//Эспрессо
//Американо
//Латте
//Капучино После выбора программа должна сообщить стоимость выбранного напитка.

import java.util.Scanner;

public class CaffeAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Which drink would you like to choose ? ");

        String drinkSelection = scanner.next();
        switch (drinkSelection) {
            case "Expresso" -> System.out.println("Price: 2,50€");
            case "Americano" -> System.out.println("Price: 3,50€");
            case "Latte" -> System.out.println("Price: 3,70€");
            case "Cappuccino" -> System.out.println("Price: 4€ ");
            default -> System.out.println("Sorry this drink is not available.");

        }

    }

}
