package practice;
//Задание 4. Запрограммировать бот, который помогает выбрасывать мусор в баки разных цветов:
//
//упаковки в желтый бак
//пищевые отходы в коричневый бак
//бумага в зеленый бак
//прочие отходы в черный бак


import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {

        //v vod nasvanija musara mi delaem String, mojet bit mnogo snachenii
        // gelbe bak doljen prinjat

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input type of garbage : ");
        System.out.println("package, plastic, bag, rest, waste, paper, carton ");

        String garbage = scanner.next();// prinemaem otveti polsivatelja

        if (garbage.equals("package") | garbage.equals("plastic ") | garbage.equals("bag")) {// == ne primenjaetsja dlja String
            System.out.println("Put it into \n yellow box ");

        } else if (garbage.equals("rest ") | garbage.equals("waste")) {
            System.out.println("Put it into blue box");

        }


    }
}
