package practice;

//Задание 3. Пользователь вводит натуральное число n. Определите, является ли оно простым.
// Простое число - это такое число, которое делится только на себя и на 1.
// Примеры: 2, 3, 5, 7, 11, 13, 17, 19, 23,...

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        // Algaritm:
        // Luboe celoe  n budem probivat delitt na chisla , menschie ego, nachinaja s 2
        // 10/ 2 = 5 snachit Ne prostoe, 11 delim na 2,3,4 ...., 10esli ne rasdelilos , to chislo Prostoe

        Scanner scanner = new Scanner(System.in);
        System.out.println("  Input positive integer number:");
        int number = scanner.nextInt();

        boolean isPrime = true;
        int div = 2;// eto delitel div
        while (div < number){
            if (number % div == 0){// esle rasdelilos chislo number nacelo na div
                isPrime = false;
                //mogno wichodit is cikla
            }
            div++;// uvilichivaem porametr cikla

        }
        System.out.println(number + " is prime " + isPrime);
    }
}
