package homework;

import java.util.Random;

//Задача 2. (повторение и закрепление темы массивы, заполнение массива с помощью датчика случайных чисел) Задача про поиск "счастливого пельменя".
// Часть 1.
// Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм. Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя. Часть 2. Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм. Напишите программу, которая ищет счастливый пельмень.
public class Pelmeni {
    public static void main(String[] args) {

        int numberOfPelmeni = 30; // Kolichestvo
        int minWeight = 25;      // Min wes pelmenja
        int maxWeight = 35;      //Max ves pelmenja

        int[] pelmeniWeights = new int[numberOfPelmeni]; // Sosdaem massiv dlja chronenija vesa

        // Generator sluchainich chisel
        Random random = new Random();

        // Sapolnjaem massiv sluchainimi vesami ot minWeight do maxWeight
        for (int i = 0; i < numberOfPelmeni; i++) {
            pelmeniWeights[i] = random.nextInt(maxWeight - minWeight + 1) + minWeight;
        }

        // Vivodim ves kajdogo pelmenja
        for (int i = 0; i < numberOfPelmeni; i++) {
            System.out.println("Pelmen" + (i + 1) + " = " + pelmeniWeights[i] + " gram ");
        }
         // Reschenie  2 ischim pelmen s sürprisem))))

        int[] pelmeniVied = new int[30];// kolichestvo

        //Generator sluchainich chisel
        Random rondom = new Random();
        for (int i = 0; i < pelmeniVied.length; i++) {
            pelmeniVied[i] = rondom.nextInt(35 - 25) + 25;//random.nextInt(max - min) + min;


        }
        int happyIndex = rondom.nextInt(pelmeniVied.length);
        pelmeniVied[happyIndex] += 15;
        System.out.println("Schastlivi pelmen pod nomerrom : " + happyIndex);
    }

}
