package hw08;

import java.util.Scanner;

//Задача 3. В первый день спортсмен пробежал s километров,
// а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.
public class Target {
    public static void main(String[] args) {

      double anfang = 4;
      int targer = 30;
      int tag = 0;

      while (anfang <= targer){
          anfang = anfang + anfang * 0.1;
          tag++;
      }
        System.out.println("Herzlichen Glückwunsch, Ihr Ziel wurde erreicht, " + targer + " km in " + tag + " Tagen. ");



    }
}
