package practice.coffee;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {

        System.out.println("Privet v Coffeeshop!");
        // predlojit meenju
        Coffee[] menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i].getType());
        }


        while (true) {
            System.out.println("Input your choice: ");// prigloscheeniju polsevatelja
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();// prineli vvod s klaviaturi
            switch (choice) {
                case 1: {
                    System.out.println("Your choice is: " + menu[choice - 1].getType());
                    System.out.println("The price is: " + menu[choice - 1].getPrice());
                    break;
                }
                // raskopirivat cases
                default: {
                    System.out.println("Wrong choice.");
                }
            }
        }
    }
}
