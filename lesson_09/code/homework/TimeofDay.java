package homework;

//Task 2. Determining the time of day.
// Write a program that takes the current hour (0 to 23) and displays a greeting depending on the time of day (morning,
// afternoon, evening, night).

import java.util.Scanner;

public class TimeofDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("See the time of dayfrom 0 to 24 hours : ");

        int time = scanner.nextInt();
        switch (time){
            case 24, 0, 1 , 3, 4 :
                System.out.println("Good night. ");
                break;

            case 5, 6, 7, 8, 9, 10, 11 :
                System.out.println("Good morning. ");
                break;

            case 12, 13, 14, 15, 16 :
                System.out.println("Good day. ");
                break;

            case 17, 18, 19, 20, 21, 22, 23 :
                System.out.println("Good evening. ");
                break;
            default:
                System.out.println("You set the wrong number. SOMETHING WENT WRONG !!! ");

        }

    }
}
