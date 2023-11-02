package practice;

//Задача 1. Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
// Найдите минимальный элемент массива и его индекс.
// Напечатайте все элементы массива с НЕчетными индексами.
// Найдите произведение всех четных элементов массива.

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {75, -250, -15, -123, 57, -145, 86, -250, 48, -251};

        int m = minEelOfArray(array);

        System.out.println(" Minemalnii eliment: " + m);

        int i = minEelOfArrayIndex(array);
        System.out.println("Indeex Minemalnii eliment : " + i);


    }// konec main

    //====Metod====
    public static int minEelOfArrayIndex(int[] array) {
        // probigaem po massivu,kajdii elrment sravnivaem s min
        //esli eliment budet mensche min, to delaem min = etomu elementu
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {// esli eliment massiva s indeksom [i] mensche min
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }


    public static int minEelOfArray(int[] array) {
        // probigaem po massivu,kajdii elrment sravnivaem s min
        //esli eliment budet mensche min, to delaem min = etomu elementu
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {// esli eliment massiva s indeksom [i] mensche min
                min = array[i];
            }
        }
        return min;
    }

    // ====konec metoda=====

}
