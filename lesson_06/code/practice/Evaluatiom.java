package practice;
//Родители позволяют ребенку играть на компьютере 1 час.
//Напишите программу, которая будет реагировать на полученную в школе оценку:
//
//1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
//2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
//3. "Посредственно.", время для игр уменьшается на 30 мин.
//4. "Плохо!", сегодня никаких игр на компьютере.
//5. "Позор семьи!", никаких игр на компьютере 2 дня.

import java.util.Scanner;

public class Evaluatiom {
    public static void main(String[] args) {

        int timeForGame = 60;// skolko rasrischeno igrat na pc

        Scanner scanner = new Scanner(System.in);//vkluchili vvod dannich s klaviaturi
        System.out.println("Input today`s mark:");//prigloschenie k vvodu
        int mark = scanner.nextInt();// polochenie otcenki s klavioturi

        switch (mark) {
            case 1: {
                System.out.println("Молодец!");//pochvola
                timeForGame = timeForGame + 30;// uvilicheli vremja
                System.out.println("время для игр на компьютере увеличивается на " + timeForGame + " мин");
                break;
            }
            case 2: {
                System.out.println("Хорошо");
                break;
            }
            case 3: {
                System.out.println("Nicht seher gut");
                timeForGame = timeForGame - 30;
                break;
            }
            case 4: {
                System.out.println("Позор семьи!");
                timeForGame = 0;
                break;
            }
            case 5: {
                System.out.println("Позор семьи! (((( ");
                System.out.println("Позор семьи!, никаких игр на компьютере 2 дня");
                break;
            }
            default: {//esli polsevotel vel chtoto drugoe ( chislo)
                System.out.println("Wrong input!");
            }

        }

    }
}
