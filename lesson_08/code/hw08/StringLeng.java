package hw08;
//Задача 1. Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.

import java.util.Scanner;

public class StringLeng {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Zeichenfolge ein : ");
        String inputString = scanner.nextLine();

        System.out.print("Geben  Sie die Anzahl der Wiederholungen ein : ");
        int repeatCount = scanner.nextInt();

        for (int i = 0; i < repeatCount; i++) {
            System.out.println(inputString);
        }




    }

}
