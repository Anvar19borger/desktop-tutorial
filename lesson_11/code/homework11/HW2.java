package homework11;

//Задача 2. Написать метод, принимающий массив целых чисел,
// и возвращающий произведение всех его элементов с четными индексами.

import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(10, -10, 10);
        printArray(arr);

        int product = productOfEvenIndexedElements(arr);
        System.out.println("Произведение элементов с четными индексами: " + product);
    }

    // Метод для генерации массива случайных чисел
    public static int[] generateRandomArray(int length, int minValue, int maxValue) {
        int[] arr = new int[length];
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(maxValue - minValue + 1) + minValue;
        }

        return arr;
    }

    // Метод для вывода массива на экран
    public static void printArray(int[] arr) {
        System.out.print("Массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для вычисления произведения элементов с четными индексами
    public static int productOfEvenIndexedElements(int[] arr) {
        int product = 1;

        for (int i = 0; i < arr.length; i += 2) {
            product *= arr[i];
        }

        return product;
    }
}
