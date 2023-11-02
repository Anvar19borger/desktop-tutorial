package homework;

//Задача 2. Пользователь с клавиатуры вводит число от 1 до 12,
// программа сообщает, какому времени года принадлежит введенный месяц.

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {

        int num = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Widite nomer mesica goda : ");
        num = scanner.nextInt();// Prinemaem wwod s klavioturi

        switch (num) {

            case 1:
            case 2:
            case 12: {
                System.out.println("Seasons  Winter : " + num);
                break;

            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Seasons  Spring: " + num);
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Seasons  Summer : " + num);
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Seasons  Fall : " + num);
                break;
            }
            default: {
                System.out.println("Wrong Input ! ");
            }


        }
    }
}
