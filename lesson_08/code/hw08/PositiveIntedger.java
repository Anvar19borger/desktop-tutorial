package hw08;
//Задача 2. Вводится положительное целое число, найдите сумму его цифр.

import java.util.Scanner;

public class PositiveIntedger {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        System.out.print("Vvidite pologitelnoe, celoe chislo : ");
        int number = scanner.nextInt();


        if (number < 0) {
            System.out.println("Pogalusta vvidite pologitelnoe chislo . ");
            return;
        }

        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Summa cifer chisla " + originalNumber + " ravna " + sum);

    }
}
