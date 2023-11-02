package practice;

//Задание 2. Распечатать в консоли таблицу умножения от 1 до 10.

public class Multiplay {
    public static void main(String[] args) {

        int n =1;
        int m = 1;

        while (n <= 10){
            while (m <= 10){
                System.out.print(n + " * " + m + " = " + n * m + " | ");
                m++;
            }
            System.out.println();// perechod na sleduschiju straku
            m =1;// sbros m na nachalnoe snache nie
            n++;// uvelichewaem n na 1
        }

    }
}
