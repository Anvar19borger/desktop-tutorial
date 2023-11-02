package homework10;

//Task 2
//Create an array of 30 random integers ranging from 10 to 20.
// Print the array.
// Swap the first and last elements of the array and print the array again.

import java.util.Random;

public class ArrayTask2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        // Sapolnjaem masiv sluchainimi chislami ot 10 дdo 30.
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) + 10; // Generiruem chisla ot  10 do 30.
        }

        // Vivodim ishodnii masiv na pechat
        System.out.println("Soursce array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println(); // Perichod na novuju stroku.

        //  Menjaem mistan´mi  pervii i poslednii elimenti masiva.
        if (array.length > 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }

        // Vivodim ismenenie masiva.
        System.out.println("Array after replacing the first and last elements :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }
}





