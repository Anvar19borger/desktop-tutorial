package homework11;
   //Задача 1. Написать метод, принимающий массив целых чисел,
  //      и возвращающий сумму всех его нечетных элементов (не индексы!,
 //    а сами элементы).

import java.util.Random;

public class HW01 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10, -10, 10);
        printArray(arr);

        int oddSum = sumOfOddElements(arr);
        System.out.println(" Summa nechotnich elimentov: " + oddSum);
    }

    // Metodt dlja geniracii masiva sluchainich chisel
    public static int[] generateRandomArray(int length, int minValue, int maxValue) {
        int[] arr = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return arr;
    }

    // Metod dlja vivoda massiva na ikran
    public static void printArray(int[] arr) {
        System.out.print("Massiv: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //  Metod dlja vicheslenija summi nechetnich elimentov massiva
    public static int sumOfOddElements(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }
}

