package practice;
//Задача 4. Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.

import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        System.out.println("Your numbers is : " + number);

        //sostovljam algoritem
        // smisel cifri v chesle oprediljaetsja ee pologenie, edenici,desjatki,sotni,....
        //Budim delit v cikle nasche chislo na 10 poka bolsche > 0
        int count = 0;

        while (number > 0){
            number = number / 10;// delim chislo na 10
            count++;//schitaem kolichestvo cifer

        }
        System.out.println("Digits in number is " + count);


    }
}
